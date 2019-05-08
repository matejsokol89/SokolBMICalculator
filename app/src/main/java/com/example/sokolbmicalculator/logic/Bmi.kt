package com.example.sokolbmicalculator.logic

interface Bmi {
    fun countBmi() : Double
    fun getMass() : Int
    fun getHeight() : Int
    fun getMassRange() : IntRange
    fun getHeightRange() : IntRange
}