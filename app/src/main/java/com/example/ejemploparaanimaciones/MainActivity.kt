package com.example.ejemploparaanimaciones

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnTraslacion: Button
    private lateinit var btnRotacion: Button
    private lateinit var btnEscalado: Button
    private lateinit var btnAparicion: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtTraslacion = findViewById<TextView>(R.id.txtTraslacion)
        val txtRotacion = findViewById<TextView>(R.id.txtRotacion)
        val txtEscalado = findViewById<TextView>(R.id.txtEscalado)
        val txtAparicion = findViewById<TextView>(R.id.txtAparicion)

        btnTraslacion = findViewById(R.id.btnTraslacion)
        btnRotacion = findViewById(R.id.btnRotacion)
        btnEscalado = findViewById(R.id.btnEscalado)
        btnAparicion = findViewById(R.id.btnAparicion)

        btnTraslacion.setOnClickListener {
            val animacion = AnimationUtils.loadAnimation(this, R.anim.translate)
            txtTraslacion.startAnimation(animacion)
        }
        btnRotacion.setOnClickListener {
            val animacion = AnimationUtils.loadAnimation(this, R.anim.rotate)
            txtRotacion.startAnimation(animacion)
        }

        // Animación de escalado
        btnEscalado.setOnClickListener {
            val animacion = AnimationUtils.loadAnimation(this, R.anim.scale)
            txtEscalado.startAnimation(animacion)
        }

        // Animación de aparición
        btnAparicion.setOnClickListener {
            val animacion = AnimationUtils.loadAnimation(this, R.anim.alpha)
            txtAparicion.startAnimation(animacion)
        }


    }
}