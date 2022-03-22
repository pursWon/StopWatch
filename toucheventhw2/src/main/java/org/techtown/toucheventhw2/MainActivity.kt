package org.techtown.toucheventhw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang", "Touch down event x: ${event.x}, rawX: ${event.rawX}")
            }
        }
        return super.onTouchEvent(event)
    }
}
