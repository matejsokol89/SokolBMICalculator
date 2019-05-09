package com.example.sokolbmicalculator.logic

class BmiForKgCm(private var mass: Int, private var height: Int) : Bmi {
    private val massRange = 1..999
    private val heightRange = 1..999
    private var bmi = mass * 10000.0 / (height * height)


    override fun countBmi(): Double {
        return bmi
    }

    override fun getMass(): Int {
        return mass
    }

    override fun getHeight(): Int {
        return height
    }

    override fun getMassRange(): IntRange {
        return massRange
    }

    override fun getHeightRange(): IntRange {
        return heightRange
    }


}