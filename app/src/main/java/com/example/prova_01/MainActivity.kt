package com.example.prova_01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtOperador = findViewById<EditText>(R.id.textOperador)
        val edtLinhaProducao = findViewById<EditText>(R.id.textLinhaProducao)
        val textPecas = findViewById<TextView>(R.id.txtPecas)

        val btnIniciarProducao = findViewById<Button>(R.id.btnIniciarProducao)
        val btnRegistarPeca = findViewById<Button>(R.id.btnRegistrarPeca)
        val btnFinalizarProducao = findViewById<Button>(R.id.btnFinalizarProducao)

        var contador = 0
        var ultimoClique = 0L
        var intervalo = 0L

        btnIniciarProducao.setOnClickListener {

        }

        btnRegistarPeca.setOnClickListener {
            contador++

            val atual = System.currentTimeMillis()

            intervalo += atual - ultimoClique

            ultimoClique = atual

            textPecas.text = "${"Peças: " + contador }"
        }

    }
}