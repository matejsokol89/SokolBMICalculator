package com.example.sokolbmicalculator

import android.content.res.Resources
import android.support.v4.content.res.ResourcesCompat

enum class BmiCategories(
    private val categoryName: Int,
    private val categoryColor: Int,
    private val categoryDescription: Int

) {
    UNDERWEIGHT(
        R.string.BMI_UNDERWEIGHT,
        R.color.colorLapisLazuli,
        R.string.BMI_UNDERWEIGHT_INFO
    ),
    NORMAL(
        R.string.BMI_NORMAL,
        R.color.colorVerdigris,
        R.string.BMI_NORMAL_INFO
    ),
    OVERWEIGHT(
        R.string.BMI_OVERWEIGHT,
        R.color.colorOrange,
        R.string.BMI_OVERWEIGHT_INFO
    ),
    OBESE1(
        R.string.BMI_OBESE1,
        R.color.colorPink,
        R.string.BMI_OBESE1_INFO
    ),
    OBESE2(
        R.string.BMI_OBESE2,
        R.color.colorPompeianPink,
        R.string.BMI_OBESE2_INFO
    ),
    OBESE3(
        R.string.BMI_OBESE3,
        R.color.colorClaret,
        R.string.BMI_OBESE3_INFO
    );

    fun getName(res: Resources): String = res.getString(categoryName)
    fun getColor(res: Resources): Int =
        ResourcesCompat.getColor(res, categoryColor, null)

    fun getDescription(res: Resources): String = res.getString(categoryDescription)
}