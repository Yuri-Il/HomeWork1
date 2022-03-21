package com.example.homework1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

const val FLAG_KEY = "FLAG_KEY"

class MainActivity : AppCompatActivity() {
    private val TAG = "MyApp"
    private var flag: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            flag = savedInstanceState.getBoolean(FLAG_KEY)
        }
        threadMethod()
        //executorMethod()
    }

    private fun getData() {
        val json = resources.openRawResource(R.raw.file)
                .bufferedReader().use { it.readText() }
        val typeToken = object : TypeToken<List<Post>>() {}.type
        val posts = Gson().fromJson<List<Post>>(json, typeToken)
        Log.d(TAG, posts.toString())
    }


    private fun threadMethod() {
        if (!flag){
            val progressBar = findViewById<ProgressBar>(R.id.progressBar)
            progressBar.visibility = View.VISIBLE
            Thread{
                Thread.sleep(5000)
                getData()
                progressBar.post{
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, "Данные получены, проверьте Logcat", Toast.LENGTH_SHORT).show()
                }
            }.start()
            flag = true
        }
    }

    private fun executorMethod() {
        if (!flag){
            val progressBar = findViewById<ProgressBar>(R.id.progressBar)
            progressBar.visibility = View.VISIBLE
            val executor = Executors.newSingleThreadExecutor()
            executor.execute {
                Thread.sleep(5000)
                getData()
                runOnUiThread{
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, "Данные получены, проверьте Logcat", Toast.LENGTH_SHORT).show()
                }
            }
            executor.shutdown()
            flag = true
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean(FLAG_KEY, flag)
        super.onSaveInstanceState(outState)
    }
}