package com.mehmetbalbay.customdialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = CustomLoginPopup(this, R.style.Theme_Dialog_Light)
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)


        val buttonShow = findViewById<Button>(R.id.show_btn)

        buttonShow.setOnClickListener { dialog.show() }


    }
}