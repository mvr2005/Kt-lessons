package com.mikhail.lesson1

import android.content.res.ColorStateList
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.util.Log
import android.view.View
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

   private lateinit var tx1 : TextView
   private lateinit var bt1 : Button
   private lateinit var bt2 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tx1 = findViewById(R.id.tx_1)
        bt1 = findViewById(R.id.btColor)
        bt2 = findViewById(R.id.bt2)

        bt1.setOnClickListener{
            tx1.text = getText(R.string.By)
            bt1.visibility = View.GONE
            bt2.visibility = VISIBLE
            val textSecond = "oooooo"
            val num = "F".toCharArray()
            Log.d("MyLog", "bt $textSecond")
            Log.d("MyLog", "f $num")
        }
       Log.d("MyLog", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","onRestart")
    }

}
