package com.example.test

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener {
            val bldr = AlertDialog.Builder(this)
            bldr.setTitle("Exit")
            bldr.setIcon(R.drawable.baseline_clear_24)
            bldr.setMessage("Are you sure you want to exit?")
            bldr.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            bldr.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            bldr.show()
        }

        binding.cv1.setOnClickListener {
            val options = arrayOf("2", "3", "4", "5")
            val bldr = AlertDialog.Builder(this)
            bldr.setTitle("What is 2+3?")
            bldr.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                val str = options[which]
            })
            bldr.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Correct Answer is 5", Toast.LENGTH_SHORT).show()
            })
            bldr.setNegativeButton("Cancel" , DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            bldr.show()
        }

        binding.cv2.setOnClickListener {
            val options = arrayOf("2", "3", "4", "5")
            val bldr = AlertDialog.Builder(this)
            bldr.setTitle("What is 1+3?")
            bldr.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->

            })
            bldr.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Correct Answer is 4", Toast.LENGTH_SHORT).show()
            })
            bldr.setNegativeButton("Cancel" , DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            bldr.show()
        }

        binding.cv3.setOnClickListener {
            val options = arrayOf("2", "30", "14", "5", "12")
            val bldr = AlertDialog.Builder(this)
            bldr.setTitle("What is 6*5?")
            bldr.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->

            })
            bldr.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Correct Answer is 30", Toast.LENGTH_SHORT).show()
            })
            bldr.setNegativeButton("Cancel" , DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            bldr.show()
        }

        binding.cv4.setOnClickListener {
            val options = arrayOf("*", "+", "/", "%")
            val bldr = AlertDialog.Builder(this)
            bldr.setTitle("What gives: 2 _ 2 = 4?")
            bldr.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->

            })
            bldr.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which->
                Toast.makeText(this, "Correct Answers are + & *", Toast.LENGTH_SHORT).show()
            })
            bldr.setNegativeButton("Cancel" , DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            bldr.show()
        }

    }
}