package com.sangmee.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = FragmentAdapter(this)

        TabLayoutMediator(tl_container, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "게시물"
                else -> tab.text = "저장함"
            }
        }.attach()
    }
}
