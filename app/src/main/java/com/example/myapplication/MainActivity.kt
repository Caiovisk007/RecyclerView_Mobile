package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapter.AdapterExercicio
import com.example.myapplication.model.Exercicio

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarIntermediario = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarIntermediario)

        val recyclerView_intermediario = findViewById<RecyclerView>(R.id.lista_intermediario)
        recyclerView_intermediario.layoutManager = LinearLayoutManager(this)
        recyclerView_intermediario.setHasFixedSize(true)

        val listaIntermediario: MutableList<Exercicio> = mutableListOf()
        val adapterIntermediario = AdapterExercicio(this,listaIntermediario)
        recyclerView_intermediario.adapter = adapterIntermediario

        val intermediario1 = Exercicio(
            "Intervalos",
            "Aplicação da escala e exercícios",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario1)

        val intermediario2 = Exercicio(
            "Escala diatônica",
            "Aplicação da escala e exercícios",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario2)

        val intermediario3 = Exercicio(
            "Acordes com pestana",
            "Aprenda a fazer a pestana",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario3)

        val intermediario4 = Exercicio(
            "Campo harmônico",
            "Entenda tudo por trás das tonalidades",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario4)

        val intermediario5 = Exercicio(
            "Principais técnicas",
            "Conheça as principais técnicas do violão",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario5)

        val intermediario6 = Exercicio(
            "Escala pentatônica",
            "Aplicação da escala e exercícios",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario6)

        val intermediario7 = Exercicio(
            "Harmônico natural",
            "Aprenda os harmônicos e execute em suas músicas",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario7)

        val intermediario8 = Exercicio(
            "Acordes relativos",
            "Entenda os acordes relativos e suas aplicações",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario8)

        val intermediario9 = Exercicio(
            "Arpejos",
            "Entenda o conceito de arpejos",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario9)

        val intermediario10 = Exercicio(
            "Variação de acordes",
            "Aprenda a variar os acordes ao longo do braço",
            R.drawable.seta
        )
        listaIntermediario.add(intermediario10)
    }
}