package com.example.whatsnext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class WedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wed)

        var mongroup: RadioGroup
        mongroup= findViewById(R.id.wedgroup)

        var wedtimetv: TextView
        wedtimetv = findViewById(R.id.wedtimetv)

        var wednine: RadioButton
        wednine = findViewById(R.id.wednine)

        var wedten: RadioButton
        wedten = findViewById(R.id.wedten)

        var wedeleven: RadioButton
        wedeleven = findViewById(R.id.wedeleven)

        var wedtwelve: RadioButton
        wedtwelve = findViewById(R.id.wedtwelve)

        var wedone: RadioButton
        wedone = findViewById(R.id.wedone)

        var wedtwo: RadioButton
        wedtwo = findViewById(R.id.wedtwo)

        var wedthree: RadioButton
        wedthree = findViewById(R.id.wedthree)

        var wedfour: RadioButton
        wedfour = findViewById(R.id.wedfour)

        mongroup.setOnCheckedChangeListener { daygroup, checkedId ->
            if (checkedId == R.id.wednine)
                wedtimetv.text = "AP Lab \n" +
                        "Sem 5 Div B \n" +
                        "Batch-1 \n" +
                        "Computer Lab-1"
            if (checkedId == R.id.wedten)
                wedtimetv.text = "AP Lab \n" +
                        "Sem 5 Div B \n" +
                        "Batch-1 \n" +
                        "Computer Lab-1"
            if (checkedId == R.id.wedeleven)
                wedtimetv.text = "DS Lab \n" +
                        "Sem 3 Div B \n" +
                        "Batch-2 \n" +
                        "Computer Lab 4"
            if (checkedId == R.id.wedtwelve)
                wedtimetv.text = "DS Lab \n" +
                        "Sem 3 Div B \n" +
                        "Batch-2 \n" +
                        "Computer Lab 4"
            if (checkedId == R.id.wedone)
                wedtimetv.text = "Lunch Time"
            if (checkedId == R.id.wedtwo)
                wedtimetv.text = "Rest"
            if (checkedId == R.id.wedthree)
                wedtimetv.text = "DS \n" +
                        "Div B \n" +
                        " 218"
            if (checkedId == R.id.wedfour)
                wedtimetv.text = "Rest"


        }

    }
}