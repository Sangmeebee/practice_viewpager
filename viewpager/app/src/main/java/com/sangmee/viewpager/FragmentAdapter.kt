package com.sangmee.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> OneFragment()
            else -> TwoFragment()
        }
    }
}
