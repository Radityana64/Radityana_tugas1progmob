package a.radityana_tugas1progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {

    private lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username = findViewById(R.id.tvselamat)

        val showUsername = intent.getStringExtra("yusername")

        username.text = "Selamat Datang\n $showUsername"

        var buttonhome = findViewById<Button>(R.id.buttonback)
        buttonhome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}