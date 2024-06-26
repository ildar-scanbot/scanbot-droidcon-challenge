package io.scanbot.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.scan_button).setOnClickListener {
            // TODO: Implement call to RTU UI screen here

        }

        // TODO: Use this text view to display the scanned barcode value
        resultTextView = findViewById(R.id.result_text_view)

        // This TextView will be used to display the result of the scan
        resultTextView.text = "The result of the barcode scan will be displayed here"
    }
}