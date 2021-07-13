package com.test.githubrepowithsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.myex2.TestClass2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestClass2().showToastt(this, "adas")

    }
}