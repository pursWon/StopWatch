package org.techtown.toucheventhw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("kkang", "onKeyDown")
        return super.onKeyDown(keyCode, event)
    }
    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("kkang", "oneKeyUp")
        return super.onKeyUp(keyCode, event)
    }
}