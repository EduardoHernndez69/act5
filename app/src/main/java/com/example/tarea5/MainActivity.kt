package com.example.tarea5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextText)
        val textView = findViewById<TextView>(R.id.textView2)
        val botton = findViewById<Button>(R.id.button)

        botton.setOnClickListener{
            val textoIngresado = editText.text.toString()
            textView.text = "Bienvenido $textoIngresado programador de Apps"
        }
    }
}