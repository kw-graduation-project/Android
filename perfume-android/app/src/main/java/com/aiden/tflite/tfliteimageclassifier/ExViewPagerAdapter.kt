package com.aiden.tflite.tfliteimageclassifier

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.aiden.tflite.tfliteimageclassifier.databinding.ActivityMainBinding

class ExViewPagerAdapter(fa:FragmentActivity)  : FragmentStateAdapter(fa){
    var fragments = listOf<Fragment>()

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments.get(position)
    }
}