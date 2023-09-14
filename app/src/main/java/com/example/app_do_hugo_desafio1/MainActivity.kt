package com.example.app_do_hugo_desafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var texto: TextView = findViewById(R.id.text_nome)
        var myButton: Button = findViewById(R.id.butao)
        var campodetexto: EditText = findViewById(R.id.imp_nome)


        myButton.setOnClickListener{
            texto.setText("Bem vindo: " + campodetexto.text)
        }

    }
}