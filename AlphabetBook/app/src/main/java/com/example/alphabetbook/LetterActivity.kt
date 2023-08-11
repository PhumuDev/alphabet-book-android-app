package com.example.alphabetbook



import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView

class LetterActivity : AppCompatActivity() {

    private var currentCount=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true) //enable back button
        supportActionBar!!.title="Letter Page"

        var message = intent.getIntExtra("EXTRA_MESSAGE",0) //get letter number from main activity
        currentCount=message
        display(message)

        val buttonNext = findViewById<Button>(R.id.buttonNext) //view next letter
        buttonNext.setOnClickListener{
            if (message<26) //if not on the last letter
            {
                message++
                currentCount=message
                updatePreferences()
                display(message)
            }
        }
        val buttonPrev = findViewById<Button>(R.id.buttonPrev) //view previous letter
        buttonPrev.setOnClickListener{
            if (message>1) //if not on the first letter
            {
                message--
                currentCount=message
                updatePreferences()
                display(message)
            }
        }
        val buttonZ2 = findViewById<Button>(R.id.buttonZ2) //view last letter
        buttonZ2.setOnClickListener{
            message=26
            currentCount=message
            updatePreferences()
            display(message)
        }
        val buttonA2 = findViewById<Button>(R.id.buttonA2) //view first letter
        buttonA2.setOnClickListener{
            message=1
            currentCount=message
            updatePreferences()
            display(message)
        }

    }

    private fun display(message: Int) //display the corresponding letter
    {
        if (message==1)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide01)
        }
        if (message==2)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide02)
        }
        if (message==3)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide03)
        }
        if (message==4)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide04)
        }
        if (message==5)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide05)
        }
        if (message==6)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide06)
        }
        if (message==7)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide07)
        }
        if (message==8)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide08)
        }
        if (message==9)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide09)
        }
        if (message==10)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide10)
        }
        if (message==11)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide11)
        }
        if (message==12)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide12)
        }
        if (message==13)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide13)
        }
        if (message==14)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide14)
        }
        if (message==15)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide15)
        }
        if (message==16)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide16)
        }
        if (message==17)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide17)
        }
        if (message==18)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide18)
        }
        if (message==19)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide19)
        }
        if (message==20)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide20)
        }
        if (message==21)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide21)
        }
        if (message==22)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide22)
        }
        if (message==23)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide23)
        }
        if (message==24)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide24)
        }
        if (message==25)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide25)
        }
        if (message==26)
        {
            val myImage: ImageView = findViewById(R.id.imageView)
            myImage.setImageResource(R.drawable.slide26)
        }

    }

    override fun onResume() { //keep track of letter shown on screen
        super.onResume()
        updatePreferences()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { //override back button to change preferences
        val pref = getSharedPreferences("PREF", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = pref.edit()
        editor.putString("LastOpened", "mainAct")
        editor.commit()
        return super.onOptionsItemSelected(item)
    }

    private fun updatePreferences() //keep track of last letter shown on screen
    {
        val pref = getSharedPreferences("PREF", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = pref.edit()
        editor.putString("LastOpened", "letterAct")
        editor.putInt("LastLetter",currentCount)
        editor.commit()
    }








}
