package com.example.shuttle.details

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.shuttle.fragments.FragmentAdapter

class DetailAdapter( fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> DetailFragment1()
            1 -> DetailFragment2()
            else -> DetailFragment3()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "상세 정보"
            1 -> "???"
            else -> "리 뷰"
        }
    }

}