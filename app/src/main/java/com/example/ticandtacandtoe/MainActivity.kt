package com.example.ticandtacandtoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var button1 : Button
    lateinit var resetbutton : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button
    lateinit var button5 : Button
    lateinit var button6 : Button
    lateinit var button7 : Button
    lateinit var button8 : Button
    lateinit var button9 : Button

    var activePlayer = 0
    var winner = 0
    var firstplayer = ArrayList<Int>()
    var secondplayer = ArrayList<Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        resetbutton = findViewById(R.id.ResetB)




        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        resetbutton.setOnClickListener(this)


    }


    override fun onClick(clickedView: View?) {
        clickedView as Button
        if(clickedView == resetbutton){
            resetfun()
        }
        var buttonNumber = 0
        when(clickedView.id){
            R.id.button1 -> buttonNumber = 1
            R.id.button2 -> buttonNumber = 2
            R.id.button3 -> buttonNumber = 3
            R.id.button4 -> buttonNumber = 4
            R.id.button5 -> buttonNumber = 5
            R.id.button6 -> buttonNumber = 6
            R.id.button7 -> buttonNumber = 7
            R.id.button8 -> buttonNumber = 8
            R.id.button9 -> buttonNumber = 9
        }
        if(buttonNumber!= 0){
            play(clickedView, buttonNumber)
        }




    }
    fun resetfun(){
        winner = 0
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
        activePlayer = 0
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true
        firstplayer.clear()
        secondplayer.clear()
    }



    fun check(){
        var totalPlays = firstplayer + secondplayer
        var timesPlayed = 0
        for (x in totalPlays){
            timesPlayed = timesPlayed + 1
        }
        if(firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)){
        Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }

        if(firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(firstplayer.contains(9) && firstplayer.contains(5) && firstplayer.contains(1)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(firstplayer.contains(3) && firstplayer.contains(5) && firstplayer.contains(7)){
            Toast.makeText(this, "stoprcentni pirvelma moigo", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(1) && secondplayer.contains(2) && secondplayer.contains(3)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(4) && secondplayer.contains(5) && secondplayer.contains(6)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(7) && secondplayer.contains(8) && secondplayer.contains(9)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(1) && secondplayer.contains(4) && secondplayer.contains(7)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(2) && secondplayer.contains(5) && secondplayer.contains(8)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(3) && secondplayer.contains(6) && secondplayer.contains(9)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(3) && secondplayer.contains(5) && secondplayer.contains(7)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }
        if(secondplayer.contains(1) && secondplayer.contains(5) && secondplayer.contains(9)){
            Toast.makeText(this, "meore gagvechita marjve 0_0", Toast.LENGTH_SHORT).show()
            winner = 1
        }

        if(winner == 1){
            button1.isEnabled = false
            button2.isEnabled = false
            button3.isEnabled = false
            button4.isEnabled = false
            button5.isEnabled = false
            button6.isEnabled = false
            button7.isEnabled = false
            button8.isEnabled = false
            button9.isEnabled = false
        } else if(timesPlayed == 9){
            button1.isEnabled = false
            button2.isEnabled = false
            button3.isEnabled = false
            button4.isEnabled = false
            button5.isEnabled = false
            button6.isEnabled = false
            button7.isEnabled = false
            button8.isEnabled = false
            button9.isEnabled = false
            Toast.makeText(this, "TIE, ITS A TIE BOYS !!", Toast.LENGTH_SHORT).show()
        }
    }

    fun play(clickedView: View?, buttonNumber: Int){
        clickedView as Button
        if(clickedView is View){
            if (activePlayer == 0){
                clickedView.text = "X"
                activePlayer = 1
                firstplayer.add(buttonNumber)
            }
            else if (activePlayer == 1){
                clickedView.text = "O"
                activePlayer = 0
                secondplayer.add(buttonNumber)
            }
            clickedView.isEnabled = false
        }
        check()
    }
}
