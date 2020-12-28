package com.example.samplebottomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.lottie.LottieAnimationView
import com.example.samplebottomview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testLottie.playAnimation()
        val adapter = MainAdapter()
        setAdapterData(adapter)
        setAdapter(binding,adapter)
        setConstraintAnimation(binding)
    }

    private fun setConstraintAnimation(binding: ActivityMainBinding) {

    }

    private fun setAdapterData(adapter: MainAdapter) {
        adapter.data = mutableListOf(
            MainListData("안녕"),
            MainListData("반가워"),
            MainListData("잘가"),
            MainListData("반가워"),
            MainListData("반가워"),
            MainListData("반가워"),
            MainListData("반가워")
        )
    }

    private fun setAdapter(binding: ActivityMainBinding, mainAdapter: MainAdapter) {
        binding.mainList.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(this@MainActivity).also {
                it.orientation = LinearLayoutManager.HORIZONTAL
            }

        }
    }
}