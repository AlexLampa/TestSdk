package com.test.githubrepowithsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test1307.alexlibrary.TestClass1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestClass1.showLogs("qwert")

    }
}