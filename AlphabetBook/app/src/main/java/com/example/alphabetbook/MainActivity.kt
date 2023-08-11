package com.example.alphabetbook

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = getSharedPreferences("PREF", MODE_PRIVATE)
        if (pref.getString("LastOpened","x")=="letterAct"){ //open LetterActivity if it was last opened
            callActivity(pref.getInt("LastLetter",0))
        }

        //display LetterActivity when buttons are clicked
        val buttonA = findViewById<Button>(R.id.buttonA)
        buttonA.setOnClickListener{
            callActivity(1)
        }

        val buttonB = findViewById<Button>(R.id.buttonB)
        buttonB.setOnClickListener{
            callActivity(2)
        }

        val buttonC = findViewById<Button>(R.id.buttonC)
        buttonC.setOnClickListener{
            callActivity(3)
        }

        val buttonD = findViewById<Button>(R.id.buttonD)
        buttonD.setOnClickListener{
            callActivity(4)
        }

        val buttonE = findViewById<Button>(R.id.buttonE)
        buttonE.setOnClickListener{
            callActivity(5)
        }

        val buttonF = findViewById<Button>(R.id.buttonF)
        buttonF.setOnClickListener{
            callActivity(6)
        }

        val buttonG = findViewById<Button>(R.id.buttonG)
        buttonG.setOnClickListener{
            callActivity(7)
        }

        val buttonH = findViewById<Button>(R.id.buttonH)
        buttonH.setOnClickListener{
            callActivity(8)
        }

        val buttonI = findViewById<Button>(R.id.buttonI)
        buttonI.setOnClickListener{
            callActivity(9)
        }

        val buttonJ = findViewById<Button>(R.id.buttonJ)
        buttonJ.setOnClickListener{
            callActivity(10)
        }

        val buttonK = findViewById<Button>(R.id.buttonK)
        buttonK.setOnClickListener{
            callActivity(11)
        }

        val buttonL = findViewById<Button>(R.id.buttonL)
        buttonL.setOnClickListener{
            callActivity(12)
        }

        val buttonM = findViewById<Button>(R.id.buttonM)
        buttonM.setOnClickListener{
            callActivity(13)
        }

        val buttonN = findViewById<Button>(R.id.buttonN)
        buttonN.setOnClickListener{
            callActivity(14)
        }

        val buttonO = findViewById<Button>(R.id.buttonO)
        buttonO.setOnClickListener{
            callActivity(15)
        }

        val buttonP = findViewById<Button>(R.id.buttonP)
        buttonP.setOnClickListener{
            callActivity(16)
        }

        val buttonQ = findViewById<Button>(R.id.buttonQ)
        buttonQ.setOnClickListener{
            callActivity(17)
        }

        val buttonR = findViewById<Button>(R.id.buttonR)
        buttonR.setOnClickListener{
            callActivity(18)
        }

        val buttonS = findViewById<Button>(R.id.buttonS)
        buttonS.setOnClickListener{
            callActivity(19)
        }

        val buttonT = findViewById<Button>(R.id.buttonT)
        buttonT.setOnClickListener{
            callActivity(20)
        }

        val buttonU = findViewById<Button>(R.id.buttonU)
        buttonU.setOnClickListener{
            callActivity(21)
        }

        val buttonV = findViewById<Button>(R.id.buttonV)
        buttonV.setOnClickListener{
            callActivity(22)
        }

        val buttonW = findViewById<Button>(R.id.buttonW)
        buttonW.setOnClickListener{
            callActivity(23)
        }

        val buttonX = findViewById<Button>(R.id.buttonX)
        buttonX.setOnClickListener{
            callActivity(24)
        }

        val buttonY = findViewById<Button>(R.id.buttonY)
        buttonY.setOnClickListener{
            callActivity(25)
        }

        val buttonZ = findViewById<Button>(R.id.buttonZ)
        buttonZ.setOnClickListener{
            callActivity(26)
        }

    }

    private fun callActivity(message:Int){ //open new activity and send value to it

        val intent = Intent(this, LetterActivity::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
    }

    override fun onResume() { //keep track of last activity opened
        super.onResume()
        val pref = getSharedPreferences("PREF", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = pref.edit()
        editor.putString("LastOpened", "mainAct")
        editor.commit()
    }




}