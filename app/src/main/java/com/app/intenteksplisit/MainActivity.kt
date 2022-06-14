package com.app.intenteksplisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNim = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val btnProses = findViewById<Button>(R.id.btnProses)

        btnProses.setOnClickListener {
            if ("${etNim.text}".isNotEmpty() && "${etNama.text}".isNotEmpty()) {
                val i = Intent(this@MainActivity, TampilDataActivity::class.java)
                i.putExtra("Nim", "${etNim.text}")
                i.putExtra("Nama", "${etNama.text}")
                startActivity(i)
            } else
                Toast.makeText(this@MainActivity, "Nim atau Nama belum diisi", Toast.LENGTH_SHORT).show()
        }
    }
}