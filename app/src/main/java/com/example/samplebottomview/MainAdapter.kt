package com.example.samplebottomview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.samplebottomview.databinding.ItemMainListBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>(){
    var data = mutableListOf<MainListData>()

    class MainViewHolder(private val binding : ItemMainListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(testData : MainListData){
            binding.testText.text = testData.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ItemMainListBinding = ItemMainListBinding.inflate(layoutInflater,parent,false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

}