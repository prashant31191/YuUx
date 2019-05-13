package com.burhanrashid52.player.trending

import android.os.Bundle
import android.view.View
import com.burhanrashid52.player.R
import com.view.tablayout.AnimatedTabLayout
import ja.burhanrashid52.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_trending.*

class TrendingFragment : BaseFragment() {

    companion object {
        val TAG = TrendingFragment::class.java.simpleName
        fun newInstance() = TrendingFragment()
    }

    override fun getLayoutId() = R.layout.fragment_trending

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtLabel.text = "Trending Videos"

       // val viewpager = findViewById<ViewPager>(R.id.viewpager)
       // val atl = findViewById<AnimatedTabLayout>(R.id.atl)

        val adapter = PagerAdapter(activity?.getSupportFragmentManager())
        viewpager.adapter = adapter
        atl.setupViewPager(viewpager)
        atl.setTabChangeListener(object : AnimatedTabLayout.OnChangeListener {
            override fun onChanged(position: Int) {
            }
        })
    }
}