package com.backbase.assignment.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.backbase.assignment.R
import com.backbase.assignment.model.MovieResult
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_item.view.*
class MainAdapter(
    private val popularMovies: ArrayList<MovieResult>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movieResult: MovieResult) {
            itemView.title.text = movieResult.title
            itemView.releaseDate.text = movieResult.releaseDate

            Glide.with(itemView.poster.context)
                .load(movieResult.posterPath)
                .into(itemView.poster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.movie_item, parent,
                false
            )
        )

    override fun getItemCount(): Int = popularMovies.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(popularMovies[position])

    fun addData(list: List<MovieResult>) {
        popularMovies.addAll(list)
    }
}