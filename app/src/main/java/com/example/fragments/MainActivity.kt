package com.example.fragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ircalc = findViewById<Button>(R.id.ircalc)
        val irMC = findViewById<Button>(R.id.irmc)

        ircalc.setOnClickListener { remplazafrag(Calcu()) }
        irMC.setOnClickListener { remplazafrag(IndiceMC()) }

    }
    fun remplazafrag(framento: Fragment){
        val manager = supportFragmentManager
        var transaccion =manager.beginTransaction()
        transaccion.replace(R.id.fragmentContainerView,framento)
        transaccion.commit()
    }
}