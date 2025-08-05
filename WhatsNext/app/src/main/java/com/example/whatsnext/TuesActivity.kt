package com.example.whatsnext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class TuesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tues)

        var tuesgroup: RadioGroup
        tuesgroup= findViewById(R.id.tuesgroup)

        var tuestimetv: TextView
        tuestimetv = findViewById(R.id.tuestimetv)

        var tuesnine: RadioButton
        tuesnine = findViewById(R.id.tuesnine)

        var tuesten: RadioButton
        tuesten = findViewById(R.id.tuesten)

        var tueseleven: RadioButton
        tueseleven = findViewById(R.id.tueseleven)

        var tuestwelve: RadioButton
        tuestwelve = findViewById(R.id.tuestwelve)

        var tuesone: RadioButton
        tuesone = findViewById(R.id.tuesone)

        var tuestwo: RadioButton
        tuestwo = findViewById(R.id.tuestwo)

        var tuesthree: RadioButton
        tuesthree = findViewById(R.id.tuesthree)

        var tuesfour: RadioButton
        tuesfour = findViewById(R.id.tuesfour)

        tuesgroup.setOnCheckedChangeListener { daygroup, checkedId ->
            if (checkedId == R.id.tuesnine)
                tuestimetv.text = "AP Lab \n" +
                        "Sem 5 Div A \n" +
                        "Batch-1 \n" +
                        "Computer Lab-1"

            if (checkedId == R.id.tuesten)
                tuestimetv.text = "AP Lab \n" +
                        "Sem 5 Div A \n" +
                        "Batch-1 \n" +
                        "Computer Lab-1"

            if (checkedId == R.id.tueseleven)
            tuestimetv.text = "Rest. Next slot is also free"

            if (checkedId == R.id.tuestwelve)
                tuestimetv.text = "Rest"

            if (checkedId == R.id.tuesone)
                tuestimetv.text = "It is Lunch Time"

            if (checkedId == R.id.tuestwo)
                tuestimetv.text = "J"

            if (checkedId == R.id.tuesthree)
                tuestimetv.text = "DS Lab \n" +
                        "Sem 3 Div C \n" +
                        "Batch-2 \n" +
                        "Computer Lab 4"

            if (checkedId == R.id.tuesfour)
                tuestimetv.text = "DS Lab \n" +
                        "Sem 3 Div C \n" +
                        "Batch-2 \n" +
                        "Computer Lab 4"
            }
    }
}