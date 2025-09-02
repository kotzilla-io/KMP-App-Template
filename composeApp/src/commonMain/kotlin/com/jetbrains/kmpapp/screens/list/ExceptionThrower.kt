package com.jetbrains.kmpapp.screens.list

class ExceptionThrower {
    fun throwException() {
        print("Throwing")
        reallyThrow()
    }

    fun reallyThrow() {
        throw Exception("App crashed intentionally")
    }
}