package com.example.neopetcarev1

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class RegistroBanios : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0

    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0
    var savedHour = 0
    var savedMinute = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_banios)


        pickDate()

    }
    private fun getDateTimneCalander(){
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_YEAR)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)

    }

    private fun pickDate(){
        val btnAddBanio = findViewById<Button>(R.id.btnAddBanios)

        btnAddBanio.setOnClickListener {
            getDateTimneCalander()

            DatePickerDialog(this,this, year, month, day).show()
        }
    }



    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay = dayOfMonth
        savedMonth = month
        savedYear = year

        getDateTimneCalander()
        TimePickerDialog(this, this, hour, minute, true).show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        val txt = findViewById<TextView>(R.id.txtNewTimer)

        savedHour = hourOfDay
        savedMinute = minute

        txt.text = "$savedDay-$savedMonth-$savedYear\t     $savedHour:$savedMinute"

    }


}