package com.example.myfirstapp3csa

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDialog  = findViewById<Button>(R.id.btnCompute)

        myDialog.setOnClickListener{
            val message = "Do you want to logout?"
            showCustomDialogBox(message)
        }
//        myDialog.setOnClickListener{
//            //IF class
////            val displayDialog = MyDialog()
////            displayDialog.show(supportFragmentManager, "123")
//            //Else
//            val builder = AlertDialog.Builder(this)
//            builder
//                .setMessage("Are you sure?")
//                .setNegativeButton("Deins boss") {dialog, which ->
//                    Toast.makeText(this, "No ", Toast.LENGTH_LONG).show()
//                }
//                .setPositiveButton("Omsim boss") {dialog, which ->
//                    Toast.makeText(this, "Yes ", Toast.LENGTH_LONG).show()
//                }
//                .setNeutralButton("Baka?") {dialog, which ->
//                    Toast.makeText(this, "Maybe ", Toast.LENGTH_LONG).show()
//                }
//                .show()
//
////                .setNegativeButton("No") {dialog, which ->
////                }
//        }

    }

    private fun showCustomDialogBox(message: String) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val tvMessage = dialog.findViewById<TextView>(R.id.tvMessage)
        val btnYes = dialog.findViewById<Button>(R.id.btnYes)
        val btnNo = dialog.findViewById<Button>(R.id.btnNo)

        tvMessage.text = message
        btnYes.setOnClickListener{
            Toast.makeText(this, "Logged Out.", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        btnNo.setOnClickListener{
            Toast.makeText(this, "Logged Out.", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        dialog.show()
    }

//    fun toSecondActivity(view: View){
//        var username = findViewById<EditText>(R.id.usernameET)
//        var password = findViewById<EditText>(R.id.passwordET)
//
//        var uname = username.text.toString()
//        var pass = password.text.toString()
//
//        if(uname == "user" && pass=="pass"){
//            val bundle = Bundle()
//            bundle.putString("username", uname)
//            bundle.putString("password", pass)
//
//            val i = Intent(this, SecondActivity::class.java)
//            i.putExtras(bundle)
//            startActivity(i)
//        }else{
//            Toast.makeText(this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
//        }
//    }

    fun compute(view: View){
        val website = findViewById<EditText>(R.id.etWebsite)
        var url = website.text.toString()
        var urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://$url"))
        startActivity(urlIntent)
    }

    fun add(view: View) {
        val firstNum = findViewById<EditText>(R.id.etFirstNum)
        val secondNum = findViewById<EditText>(R.id.etSecondNum)
        val result = findViewById<TextView>(R.id.Result)
        var fNum = firstNum.text.toString().toDouble()
        var sNum = secondNum.text.toString().toDouble()
        var sum = fNum + sNum
        result.text = sum.toString()
    }




//    Toast.makeText(this, "In onCreate", Toast.LENGTH_SHORT).show();
//    Log.i("info", "In onCreate");
//    override fun onStart(){
//        super.onStart()
//        Toast.makeText(this, "In onStart", Toast.LENGTH_SHORT).show();
//        Log.i("info", "In onStart");
//    }
//
//    override fun onResume(){
//        super.onResume()
//        Toast.makeText(this, "In onResume", Toast.LENGTH_SHORT).show();
//        Log.i("info", "In onResume");
//    }
//
//    override fun onPause(){
//        super.onPause()
//        Toast.makeText(this, "In onPause", Toast.LENGTH_SHORT).show();
//        Log.i("info", "In onPause");
//    }
//
//    override fun onStop(){
//        super.onStop()
//        Toast.makeText(this, "In onStop", Toast.LENGTH_SHORT).show();
//        Log.i("info", "In onStop");
//    }
//
//    override fun onDestroy(){
//        super.onDestroy()
//        Toast.makeText(this, "In onDestroy", Toast.LENGTH_SHORT).show();
//        Log.i("info", "In onDestroy");
//    }

//    fun toastMsg(view: View) {
//        Toast.makeText(this , "This is a toast!", Toast.LENGTH_LONG).show()
//    }
}

//          Inside oncreatea
//        val button = findViewById<Button>(R.id.button);
//        button.setOnClickListener{
//            Toast.makeText(applicationContext, "This is a toast!", Toast.LENGTH_LONG).show()
//        }

//        btnCompute.setOnClickListener {
////            var sum = firstNum.text.toString().toDouble() + secondNum.text.toString().toDouble()
////            var fNum = firstNum.text.toString().toDouble()
////            var sNum = secondNum.text.toString().toDouble()
////            var sum = fNum + sNum
////            result.text = sum.toString()
//            compute(it)
//        }