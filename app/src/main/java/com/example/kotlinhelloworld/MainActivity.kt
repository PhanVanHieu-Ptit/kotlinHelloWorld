package com.example.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun sum2number(a:Int, b: Int): Int{
        return a+b
    }
    fun sub2number(a:Int, b: Int): Int{
        return a-b
    }
    fun mul2number(a:Int, b: Int): Int{
        return a*b
    }
    fun div2number(a:Float, b: Float): Float{
        if(b!=0f) return a/b
        else return 0f
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnsum = findViewById<Button>(R.id.btnsum)
        var btnsub = findViewById<Button>(R.id.btnsub)
        var btnmul = findViewById<Button>(R.id.btnmul)
        var btndiv = findViewById<Button>(R.id.btndiv)
        var edta = findViewById<EditText>(R.id.edta)
        var edtb = findViewById<EditText>(R.id.edtb)
        btnsum.setOnClickListener {
            Toast.makeText(this,""+sum2number(edta.text.toString().toInt(),edtb.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        btnsub.setOnClickListener {
            Toast.makeText(this,""+sub2number(edta.text.toString().toInt(),edtb.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        btnmul.setOnClickListener {
            Toast.makeText(this,""+mul2number(edta.text.toString().toInt(),edtb.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        btndiv.setOnClickListener {
            Toast.makeText(this,""+div2number(edta.text.toString().toFloat(),edtb.text.toString().toFloat()),Toast.LENGTH_SHORT).show()
        }
    }
}