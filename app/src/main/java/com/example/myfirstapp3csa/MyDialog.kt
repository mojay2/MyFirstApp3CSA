package com.example.myfirstapp3csa

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(this.requireActivity())
        builder.setMessage("Do you want to exit the app?")
        builder.setPositiveButton("Yes", {dialog, id ->

        })

        builder.setNegativeButton("No", {dialog, id ->

        })

        return builder.create()
//        return super.onCreateDialog(savedInstanceState)
    }
}