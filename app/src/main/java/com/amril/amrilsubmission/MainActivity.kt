package com.amril.amrilsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var c: Button //tombol tutup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        c = findViewById(R.id.btnkeluar)
        c.setOnClickListener(this)
    }

    override fun onClick(view: View) {
       when(view.id){
           R.id.btnkeluar->finish()
       }
    }
}