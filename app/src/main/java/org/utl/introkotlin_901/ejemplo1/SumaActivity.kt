package org.utl.introkotlin_901.ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.utl.introkotlin_901.R

class SumaActivity : AppCompatActivity() {
    /**/
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView
    private lateinit var rgOperaciones: RadioGroup
    private lateinit var btn1: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suma)

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        tv1 = findViewById(R.id.tv1)
        rgOperaciones = findViewById(R.id.rgOperaciones)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener { calcular() }

    }

    fun calcular() {
        val num1 = et1.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = et2.text.toString().toDoubleOrNull() ?: 0.0
        var resultado = 0.0

        when (rgOperaciones.checkedRadioButtonId) {
            R.id.rbSuma -> {
                resultado = num1 + num2
            }
            R.id.rbResta -> {
                resultado = num1 - num2
            }
            R.id.rbMultiplicacion -> {
                resultado = num1 * num2
            }
            R.id.rbDivision -> {
                resultado = if (num2 != 0.0) num1 / num2 else Double.NaN
            }
        }

        tv1.text = "Resultado = $resultado"
    }
}
