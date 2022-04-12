package com.aiden.tflite.tfliteimageclassifier

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.aiden.tflite.tfliteimageclassifier.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater, null, false) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 페이지 배경색 정보가 담긴 리스트
        val bgColors: MutableList<Int> = mutableListOf(
            android.R.color.holo_green_light,
            android.R.color.holo_blue_dark
        )


        setContentView(binding.root)

        var fragmentList = listOf(Fragment1(), Fragment2(), Fragment3())
        val adapter = ExViewPagerAdapter(this)
        adapter.fragments = fragmentList
        val pager = findViewById<ViewPager2>(R.id.pager)
        pager.adapter = adapter

        binding.run {
            btnGallery.setOnClickListener {
                startActivity(Intent(this@MainActivity, GalleryActivity::class.java))
            }

            btnHistory.setOnClickListener {
                startActivity(Intent(this@MainActivity, HistoryActivity::class.java))
            }

            btnCamera.setOnClickListener {
                startActivity(Intent(this@MainActivity, CameraActivity::class.java))
            }
        }

    }
}