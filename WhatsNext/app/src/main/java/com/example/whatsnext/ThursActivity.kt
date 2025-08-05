package com.example.whatsnext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class ThursActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thurs)

        var thursgroup: RadioGroup
        thursgroup= findViewById(R.id.thursgroup)

        var thurstimetv: TextView
        thurstimetv = findViewById(R.id.thurstimetv)

        var thursnine: RadioButton
        thursnine = findViewById(R.id.thursnine)

        var thursten: RadioButton
        thursten = findViewById(R.id.thursten)

        var thurseleven: RadioButton
        thurseleven = findViewById(R.id.thurseleven)

        var thurstwelve: RadioButton
        thurstwelve = findViewById(R.id.thurstwelve)

        var thursone: RadioButton
        thursone = findViewById(R.id.thursone)

        var thurstwo: RadioButton
        thurstwo = findViewById(R.id.thurstwo)

        var thursthree: RadioButton
        thursthree = findViewById(R.id.thursthree)

        var thursfour: RadioButton
        thursfour = findViewById(R.id.thursfour)

        thursgroup.setOnCheckedChangeListener { daygroup, checkedId ->
            if (checkedId == R.id.thursnine)
                thurstimetv.text = "AP Lab \n" +
                        "Sem 5 Div B \n" +
                        "Batch-2 \n" +
                        "Computer Lab-1"

            if (checkedId == R.id.thursten)
                thurstimetv.text = "AP Lab \n" +
                        "Sem 5 Div B \n" +
                        "Batch-2 \n" +
                        "Computer Lab-1"

            if (checkedId == R.id.thurseleven)
                thurstimetv.text = "J"

            if (checkedId == R.id.thurstwelve)
                thurstimetv.text = "DS \n" +
                        " Sem 3 Div B \n" +
                        "218"

            if (checkedId == R.id.thursone)
                thurstimetv.text = "Lunch Time. Next Three slots are free."

            if (checkedId == R.id.thurstwo)
                thurstimetv.text = "You are now free for the day"

            if (checkedId == R.id.thursthree)
                thurstimetv.text = "You are now free for the day"

            if (checkedId == R.id.thursfour)
                thurstimetv.text = "You are now free for the day"


        }

    }
}