package com.example.androidrainbow

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    red.setOnClickListener{
        println("Red click Successful")
        red.setBackgroundColor(Color.RED)
    }
        blue.setOnClickListener{
            println("Blue click Successful")
            blue.setBackgroundColor(Color.BLUE)
        }

        green.setOnClickListener{
            println("Green Click Successful")
            green.setBackgroundColor(Color.GREEN)
        }

        cyan.setOnClickListener{
            println("Cyan Click Successful")
            cyan.setBackgroundColor(Color.CYAN)
        }

        yellow.setOnClickListener{
            println("Yellow click Successful")
            yellow.setBackgroundColor(Color.YELLOW)
        }

        magenta.setOnClickListener{
            println("Violet click Successful")
            magenta.setBackgroundColor(Color.MAGENTA)
        }
    }
}
