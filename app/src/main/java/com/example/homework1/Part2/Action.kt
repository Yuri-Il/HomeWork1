package com.example.homework1.Part2

sealed class Action(){
    class Registration: Action()
    class Login(val user: User): Action()
    class Logout: Action()
}