package com.example.multiflavorlibrary

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivityLib : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editor: SharedPreferences.Editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
        editor.putString("name", "Elena");
        editor.putInt("idName", 12);
        editor.apply();
        Toast.makeText(this ,"HIIIIII Flavor 1" , Toast.LENGTH_LONG).show()

    }
}