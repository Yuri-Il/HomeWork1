package com.example.homework1.Part2

fun User.validAge(){
    if (age >= 18) println("${this.name}'s age is valid")
    else throw Exception("Age is not valid")
}


val authCallback = object : AuthCallback {
    override fun authSuccess() {
        println("Authorization successed")
    }
    override fun authFailed() {
        println("Authorization failed")
    }
}

fun updateCache(){
    println("Cache updated")
}

inline fun auth(update: ()->Unit, user: User){
    try{
        user.validAge()
        authCallback.authSuccess()
        update()
    }
    catch(e: Exception) {
        println(e)
        authCallback.authFailed()
    }
}

fun doAction(action: Action){
    when (action){
        is Action.Login -> {
            auth(::updateCache, action.user); println("You have logged in")}
        is Action.Logout -> println("You have logged out")
        is Action.Registration -> println("You have registered")
    }
}

fun main(){
    val myUser = User(1, "Tom", 18, Type.FULL)

    println(myUser.startTime)
    Thread.sleep(1000)
    println(myUser.startTime)

    val users = mutableListOf<User>(myUser)
    users.apply {
        this.add(User(2, "Max", 16, Type.FULL))
        this.add(User(3, "Bob", 20, Type.DEMO))
    }

    val fullUsers = users.filter { it.type == Type.FULL }
    print("Full users: ")
    fullUsers.forEach {print("${it.name} ")}
    println()

    val userNames = mutableListOf<String>()
    users.forEach{userNames.add(it.name)}
    println("First user: ${userNames.first()}")
    println("Last user: ${userNames.last()}")

    doAction(Action.Registration())
    doAction(Action.Login(myUser))
    doAction((Action.Logout()))
}
