package com.example.sokolbmicalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info_bmi.*


class InfoBmiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_bmi)

        val bundle = this.intent.extras
        if (bundle != null) {
            bmiValue.text = bundle.getString(MainActivity.KEY_BMI_VALUE)
            bmiValue.setTextColor(bundle.getInt(MainActivity.KEY_BMI_COLOR))
            bmiClass.text = bundle.getString(MainActivity.KEY_BMI_NAME)
            bmiClass.setTextColor(bundle.getInt(MainActivity.KEY_BMI_COLOR))
            bmiDescriptionLong.text = bundle.getString(MainActivity.KEY_BMI_DESCRIPTION)
        }

    }

}