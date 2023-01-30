package com.example.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 1번 방식 - findviewid
        val btn =findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }

        //2번 방식 -databinging
    }
}