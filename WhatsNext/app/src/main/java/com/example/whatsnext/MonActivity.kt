package com.example.whatsnext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon)

        var mongroup: RadioGroup
        mongroup= findViewById(R.id.mongroup)

        var montimetv: TextView
        montimetv = findViewById(R.id.montimetv)

        var monnine: RadioButton
        monnine = findViewById(R.id.monnine)

        var monten: RadioButton
        monten = findViewById(R.id.monten)

        var moneleven: RadioButton
        moneleven = findViewById(R.id.moneleven)

        var montwelve: RadioButton
        montwelve = findViewById(R.id.montwelve)

        var monone: RadioButton
        monone = findViewById(R.id.monone)

        var montwo: RadioButton
        montwo = findViewById(R.id.montwo)

        var monthree: RadioButton
        monthree = findViewById(R.id.monthree)

        var monfour: RadioButton
        monfour = findViewById(R.id.monfour)

        mongroup.setOnCheckedChangeListener { daygroup, checkedId ->
            if (checkedId == R.id.monnine)
                montimetv.text = "AP Lab \n" +
                        "Sem 5 Div A \n" +
                        "Batch-2 \n" +
                        "Computer Lab-1"

            if (checkedId == R.id.monten)
                montimetv.text = "AP Lab \n" +
                        "Sem 5 Div A \n" +
                        "Batch-2 \n" +
                        "Computer Lab-1"

            if (checkedId == R.id.moneleven)
                montimetv.text = "Rest"

            if (checkedId == R.id.montwelve)
                montimetv.text = "AP \n" +
                        "Div B \n" +
                        "Class 219"

            if (checkedId == R.id.monone)
                montimetv.text = "Lunch Time"

            if (checkedId == R.id.montwo)
                montimetv.text = "J"

            if (checkedId == R.id.monthree)
                montimetv.text = "J"

            if (checkedId == R.id.monfour)
                montimetv.text = "Rest"
        }
    }
}

