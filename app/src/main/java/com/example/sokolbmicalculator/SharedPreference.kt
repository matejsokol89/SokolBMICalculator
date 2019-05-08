package com.example.sokolbmicalculator

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class SharedPreference(myContext: Context) {

    private val pref: SharedPreferences = myContext.getSharedPreferences(KEY_BMI_PREFS,
        Context.MODE_PRIVATE
    )

    fun save(key: String, list: ArrayList<BmiRecord>) {
        val listJson = Gson().toJson(list)
        val editor = pref.edit()
        editor.putString(key, listJson)
        editor.apply()
    }

    fun getRecordList(key: String): ArrayList<BmiRecord> {
        class Token : TypeToken<ArrayList<BmiRecord>>()
        val keyList = pref.getString(key, null)
        if (keyList != null) {
            return Gson().fromJson(keyList, Token().type)
        }
        return arrayListOf()
    }

        companion object {
        const val KEY_BMI_PREFS = "BMI_PREFS"
    }
}