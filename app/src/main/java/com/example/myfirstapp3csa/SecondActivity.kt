package com.example.myfirstapp3csa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var username = findViewById<TextView>(R.id.usernameTV)
        var password = findViewById<TextView>(R.id.passwordTV)

        val bundle = intent.extras
        if(bundle != null){
            username.text = "${bundle.getString("username")}"
            password.text = "${bundle.getString("password")}"
        }
    }
    fun toHomePage(view: View){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}