package com.jetbrains.kmpapp.di

class CrashMaker {

    fun boom(){
        error("This is a Kotlin shared code crash!")
    }
}