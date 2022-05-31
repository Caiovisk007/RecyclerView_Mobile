package com.example.myapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Exercicio

class AdapterExercicio(private val context: Context, private val exercicios: MutableList<Exercicio>) : RecyclerView.Adapter<AdapterExercicio.ExercicioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExercicioViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.exercicio_item,parent,false)
        val holder = ExercicioViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ExercicioViewHolder, position: Int) {
        holder.nome.text = exercicios[position].nome
        holder.descricao.text = exercicios[position].descricao
        holder.foto.setImageResource(exercicios[position].imageSeta)
    }

    override fun getItemCount(): Int = exercicios.size

    inner class ExercicioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome = itemView.findViewById<TextView>(R.id.nomeExercicio)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoExercicio)
        val foto = itemView.findViewById<ImageView>(R.id.imagemSeta)
    }
}