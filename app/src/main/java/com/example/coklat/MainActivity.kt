package com.example.coklat

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textViewSteps: TextView
    private lateinit var buttonYes: Button
    private lateinit var buttonNo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   }

    private fun displayCoklatSteps() {
        // Display steps to make coklat in the TextView
        val coklatSteps = """
            1. Jalan ke dapur
            2. Siapkan bahan seperti bubuk susu coklat, 1 gelas susu, gula secukupnya
            3. Siapkan kompor, panci, dan sendok makan
            4. Siapkan panci ke atas kompor lalu nyalakan kompor
            5. Masukkan susu kedalam panci yang telah di panaskan dan aduklah menggunakan sendok makan
            6. Tambahkan bubuk coklat ke dalam susu yang telah dipanaskan dan aduk menggunakan sendok makan hingga larut
            7. Tambahkan gula dengan cara menuangkannya dengan sendok makan sesuai selera dan sambil di aduk dengan merata
            8. Matikan kompor
            9. Tuangkan susu yang ada di panci kedalam gelas
            10. Susu siap dihidangkan
        """.trimIndent()

        textViewSteps.text = coklatSteps
    }

    private fun displayBeliAjaSanaMessage() {
        // Display a message in the TextView
        textViewSteps.text = "beli aja sana!"
    }
}
