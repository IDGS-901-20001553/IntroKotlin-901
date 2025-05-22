package org.utl.introkotlin_901.Cinepolis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.utl.introkotlin_901.R

class cinepolis : AppCompatActivity() {

    private lateinit var edtNombre: EditText
    private lateinit var edtPersonas: EditText
    private lateinit var edtBoletos: EditText
    private lateinit var rbSi: RadioButton
    private lateinit var rbNo: RadioButton
    private lateinit var txtTotal: TextView
    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)

        edtNombre = findViewById(R.id.edtNombre)
        edtPersonas = findViewById(R.id.edtPersonas)
        edtBoletos = findViewById(R.id.edtBoletos)
        rbSi = findViewById(R.id.rbSi)
        rbNo = findViewById(R.id.rbNo)
        txtTotal = findViewById(R.id.txtTotal)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener { calcularTotal() }


    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun calcularTotal() {
        val nombre = edtNombre.text.toString()
        val cantidadPersonas = edtPersonas.text.toString().toIntOrNull() ?: 0
        val cantidadBoletos = edtBoletos.text.toString().toIntOrNull() ?: 0
        val tarjeta = rbSi.isChecked

        val maxBoletos = cantidadPersonas * 7

        if (cantidadBoletos > maxBoletos) {
            txtTotal.text = "Solo puedes comprar hasta $maxBoletos boletos."
            return
        }

        val precio = 12.0
        var total = cantidadBoletos * precio

        when {
            cantidadBoletos > 5 -> total *= 0.85
            cantidadBoletos >= 3 -> total *= 0.90
        }

        if (tarjeta) {
            total *= 0.90
        }

        txtTotal.text = "Total a pagar: $${"%.2f".format(total)}"
    }


}