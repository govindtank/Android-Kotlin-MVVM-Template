package com.silverlotus.kmvvm.ui.main

import android.os.Bundle
import com.silverlotus.kmvp.R
import com.silverlotus.kmvvm.root.RootActivity

/**
 * Created by Gian Patrick Quintana on 1/22/2018.
 */
class MainActivity : RootActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, MainFragment())
                .commit()

    }
}