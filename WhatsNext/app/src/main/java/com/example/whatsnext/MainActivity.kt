package com.example.whatsnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var daygroup: RadioGroup
        daygroup = findViewById(R.id.daygroup)

        var daytv: TextView
        daytv = findViewById(R.id.daytv)

        var mon: RadioButton
        mon = findViewById(R.id.mon)

        var tues: RadioButton
        tues = findViewById(R.id.tues)

        var wed: RadioButton
        wed = findViewById(R.id.wed)

        var thurs: RadioButton
        thurs = findViewById(R.id.thurs)

        var fri: RadioButton
        fri = findViewById(R.id.fri)


        daygroup.setOnCheckedChangeListener { daygroup, checkedId ->

            if (checkedId == R.id.mon)
                mon.setOnClickListener {
                    val intent1 = Intent(this, MonActivity::class.java)
                    startActivity(intent1)
                }



            if (checkedId == R.id.tues)
                tues.setOnClickListener {
                    val intent2 = Intent(this, TuesActivity::class.java)
                    startActivity(intent2)
                }


            if (checkedId == R.id.wed)
                wed.setOnClickListener {
                    val intent3 = Intent(this, WedActivity::class.java)
                    startActivity(intent3)
                }

            if (checkedId == R.id.thurs)
                thurs.setOnClickListener {
                    val intent4 = Intent(this, ThursActivity::class.java)
                    startActivity(intent4)
                }

            if (checkedId == R.id.fri)
                fri.setOnClickListener {
                    val intent5 = Intent(this, FriActivity::class.java)
                    startActivity(intent5)
                }


        }
    }
}


