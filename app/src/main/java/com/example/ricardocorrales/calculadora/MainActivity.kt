package com.example.ricardocorrales.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSomar = findViewById(R.id.btnSomar) as Button
        var btnSubtrair = findViewById(R.id.btnSubtrair) as Button
        var btnMultiplicar = findViewById(R.id.btnMultiplicar) as Button
        var btnDividir = findViewById(R.id.btnDividir) as Button

        btnSomar.setOnClickListener(this)
        btnSubtrair.setOnClickListener(this)
        btnMultiplicar.setOnClickListener(this)
        btnDividir.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var edtValor1 = findViewById(R.id.edtValor1) as EditText
        var edtValor2 = findViewById(R.id.edtValor2) as EditText
        var textView = findViewById(R.id.textViewResultado) as TextView

        var txtValor1 = edtValor1.text.toString()
        var txtValor2 = edtValor2.text.toString()

        var valor1 = txtValor1.toInt()
        var valor2 = txtValor2.toInt()

        //segunda forma de fazer
        textView.text = when(v?.id) {
            R.id.btnSomar -> "Resultado = ${valor1+valor2}"

            R.id.btnSubtrair -> "Resultado = ${valor1-valor2}"

            R.id.btnMultiplicar -> "Resultado = ${valor1*valor2}"

            R.id.btnDividir -> "Resultado = ${valor1/valor2}"
            else -> "Não foi possível realizar a operação"
        }

        //primeira forma de fazer
        /*when(v?.id) {
            R.id.btnSomar ->
                    textView.text = "Resultado = ${valor1+valor2}"

            R.id.btnSubtrair ->
                textView.text = "Resultado = ${valor1-valor2}"

            R.id.btnMultiplicar ->
                textView.text = "Resultado = ${valor1*valor2}"

            R.id.btnDividir ->
                textView.text = "Resultado = ${valor1/valor2}"
        }*/

    }

}
