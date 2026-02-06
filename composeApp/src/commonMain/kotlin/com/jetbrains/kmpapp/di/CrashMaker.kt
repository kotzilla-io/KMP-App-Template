package com.jetbrains.kmpapp.di

class CrashMaker {

    fun boom(){
        throw Throwable("CRASH_2.0.4-dev6")
    }
}