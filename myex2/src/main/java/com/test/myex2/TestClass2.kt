package com.test.myex2

import android.content.Context
import android.util.Log
import android.widget.Toast

class TestClass2 {

    companion object {

        fun showLogs(message: String?) {
            Log.v("TestClass1", "Attention! $message")
        }

    }

    fun showToastt(context: Context, message: String?) {
        val a = "Secret code, nobody will see that!"
        Toast.makeText(context, "Attention! $message ${hashCode()}", Toast.LENGTH_LONG).show()
    }


}