package com.android.studyfork.ext

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.replaceFragment(fragment :Fragment,frameId : Int){
    supportFragmentManager.beginTransaction().apply {
        replace(frameId,fragment)
    }
}