package ca.gerogian.comp3025_wk1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val HelloWorldLabel = findViewById(R.id.Hello_World_Label) as TextView
        val ClickMeButton = findViewById(R.id.Click_Me_Button) as Button

        ClickMeButton.setOnClickListener {
            HelloWorldLabel.text = "Clicked!"
        }
    }
}