package com.example.assignment5lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var count: Double = 0.0
//https://developer.android.com/develop/ui/views/components/checkbox
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBox -> {
                    if (checked) {
                        // Put some meat on the sandwich
                        Toast.makeText(this, "first checked", Toast.LENGTH_SHORT).show()
                    } else {
                        // Remove the meat
                    }
                }
                R.id.checkBox2 -> {
                    if (checked) {
                        // Cheese me
                        Toast.makeText(this, "second checked", Toast.LENGTH_SHORT).show()
                    } else {
                        // I'm lactose intolerant
                    }

                }
                R.id.checkBox3 -> {
                    if (checked) {
                        // Cheese me
                        count += 0.5
                        Toast.makeText(this, "third checked you have ${count*100}%", Toast.LENGTH_SHORT).show()
                    } else {
                        // I'm lactose intolerant
                        count -= 0.5
                    }

                }
                // TODO: Elses
            }
        }
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioButton ->
                    if (checked) {
                        // Pirates are the best
                        Toast.makeText(this, "is not the answer", Toast.LENGTH_SHORT).show()
                    }
                R.id.radioButton2 ->
                    if (checked) {
                        // Ninjas rule
                        Toast.makeText(this, "is not the answer", Toast.LENGTH_SHORT).show()
                    }
                R.id.radioButton3 ->
                    if (checked) {
                        // Ninjas rule
                        count += 0.5
                        Toast.makeText(this, "it is the answer! you have ${count*100}%", Toast.LENGTH_SHORT).show()
                    }else {
                        count -= 0.5
                    }
            }
        }
    }
}