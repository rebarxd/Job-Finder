package com.example.jobfinder.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jobfinder.Activity.DetailActivity
import com.example.jobfinder.Model.JobModel
import com.example.jobfinder.databinding.ViewholderJobBinding

class jobAdapter(private val items:List<JobModel>): RecyclerView.Adapter<jobAdapter.Viewholder>() {
    private lateinit var context:Context
    inner class Viewholder(val binding:ViewholderJobBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): jobAdapter.Viewholder {
        context=parent.context
        val binding=ViewholderJobBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: jobAdapter.Viewholder, position: Int) {
        val item=items[position]
        holder.binding.titleTxt.text=item.title
        holder.binding.companyTxt.text=item.company
        holder.binding.locationTxt.text=item.location
        holder.binding.timeTxt.text=item.time
        holder.binding.modelTxt.text=item.model
        holder.binding.levelTxt.text=item.level
        holder.binding.salaryTxt.text=item.salary

        val drawableResourceId=holder.itemView.resources
            .getIdentifier(item.picUrl,"drawable",holder.itemView.context.packageName )
        Glide.with(holder.itemView.context)
            .load(drawableResourceId)
            .into(holder.binding.pic)

        holder.itemView.setOnClickListener {
            val intent=Intent(context,DetailActivity::class.java)
            intent.putExtra("object",item)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = items.size
}