package com.backbase.assignment.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.backbase.assignment.R
import com.backbase.assignment.model.MovieResult
import com.backbase.assignment.ui.movie.MoviesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel : MainViewModel by viewModels()

    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
        setupObserver()
    }


    private fun setupUI() {
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )

        recyclerView.adapter = mainAdapter
    }

    private fun setupObserver() {
        mainViewModel.popularMovies.observe(this, Observer {
          it.let { movies -> renderList(movies) }
        })
    }

    private fun renderList(movies: List<MovieResult>) {
        mainAdapter = MainAdapter(movies as ArrayList<MovieResult>)
        recyclerView.adapter = mainAdapter
        recyclerView.adapter?.notifyDataSetChanged()
    }



}
