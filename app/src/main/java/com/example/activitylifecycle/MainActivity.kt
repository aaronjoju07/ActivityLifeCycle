package com.example.activitylifecycle

import android.app.ActivityManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle","onCreate Invoked");
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "onStart Invoked")
        Toast.makeText(this,"onStart Invoked",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume Invoked")
        Toast.makeText(this,"onResume Invoked",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onPause Invoked")
        Toast.makeText(this,"onPause Invoked",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "onStop Invoked")
        Toast.makeText(this,"onStop Invoked",Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "onRestart Invoked")
        Toast.makeText(this,"onRestart Invoked",Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy Invoked")
        Toast.makeText(this,"onDestroy Invoked",Toast.LENGTH_LONG).show()

    }
}
