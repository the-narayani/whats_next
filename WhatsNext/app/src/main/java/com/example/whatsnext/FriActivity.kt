package com.example.whatsnext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class FriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fri)

        var frigroup: RadioGroup
        frigroup= findViewById(R.id.frigroup)

        var fritimetv: TextView
        fritimetv = findViewById(R.id.fritimetv)

        var frinine: RadioButton
        frinine = findViewById(R.id.frinine)

        var friten: RadioButton
        friten = findViewById(R.id.friten)

        var frieleven: RadioButton
        frieleven = findViewById(R.id.frieleven)

        var fritwelve: RadioButton
        fritwelve = findViewById(R.id.fritwelve)

        var frione: RadioButton
        frione = findViewById(R.id.frione)

        var fritwo: RadioButton
        fritwo = findViewById(R.id.fritwo)

        var frithree: RadioButton
        frithree = findViewById(R.id.frithree)

        var frifour: RadioButton
        frifour = findViewById(R.id.frifour)

        frigroup.setOnCheckedChangeListener { daygroup, checkedId ->
            if (checkedId == R.id.frinine)
                fritimetv.text = "Rest"

            if (checkedId == R.id.friten)
                fritimetv.text = "DS \n" +
                        "Sem 3 Div B \n" +
                        "218"

            if (checkedId == R.id.frieleven)
                fritimetv.text = "DS Lab \n" +
                        "Sem 3 Div B \n" +
                        "Batch-1 \n" +
                        "218"

            if (checkedId == R.id.fritwelve)
                fritimetv.text = "DS Lab \n" +
                        "Sem 3 Div B \n" +
                        "Batch-1 \n" +
                        "218"

            if (checkedId == R.id.frione)
                fritimetv.text = "Lunch"

            if (checkedId == R.id.fritwo)
                fritimetv.text = "Rest.\n" +
                        "Next slot is also free"

            if (checkedId == R.id.frithree)
                fritimetv.text = "Rest"

            if (checkedId == R.id.frifour)
                fritimetv.text = "AP \n" +
                        "Sem 5 Div A \n" +
                        "217"

        }

    }
}