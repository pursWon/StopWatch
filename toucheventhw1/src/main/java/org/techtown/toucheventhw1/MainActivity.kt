package org.techtown.toucheventhw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang", "Touch down event")
            }
            MotionEvent.ACTION_UP -> {
            Log.d("kkang", "Touch up event")
            }
        }
        return super.onTouchEvent(event)
    }
}