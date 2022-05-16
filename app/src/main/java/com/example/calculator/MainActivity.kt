package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            tvResult.text = ""
            val num1 = etNumber1.text.toString().toDouble()
            val num2 = etNumber2.text.toString().toDouble()
            add(num1, num2)
        }
        btnSubtract.setOnClickListener {
            val num1 = etNumber1.text.toString().toDouble()
            val num2 = etNumber2.text.toString().toDouble()
            subtract(num1, num2)
        }
        btnMultiply.setOnClickListener {
            val num1 = etNumber1.text.toString().toDouble()
            val num2 = etNumber2.text.toString().toDouble()
            multiply(num1, num2)
        }
        btnModulus.setOnClickListener {
            val num1 = etNumber1.text.toString().toDouble()
            val num2 = etNumber2.text.toString().toDouble()
            modulus(num1, num2)
        }
    }
    fun add(num1:Double, num2:Double){
        val result = num1 + num2
        tvResult.text = result.toString()
    }
    fun subtract(num1:Double, num2:Double){
        val result = num1 - num2
        tvResult.text = result.toString()
    }
    fun multiply(num1:Double, num2:Double){
        val result = num1 * num2
        tvResult.text = result.toString()
    }
    fun modulus(num1:Double, num2:Double){
        val result = num1 % num2
        tvResult.text = result.toString()
    }
}