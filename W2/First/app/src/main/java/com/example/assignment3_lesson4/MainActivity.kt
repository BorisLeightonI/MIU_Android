package com.example.assignment3_lesson4

import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addBtn.setOnClickListener{addRow(tblLayout)}
    }

    private fun addRow(table:TableLayout) {
        val row = TableRow(applicationContext)
        val layParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        row.layoutParams = layParams
        val text1 = TextView(this)
        val text2 = TextView(this)
        text1.text = androidVersion.text
        text2.text = androidCodeName.text
        row.addView(text1)
        row.addView(text2)
        table.addView(row)
    }
}