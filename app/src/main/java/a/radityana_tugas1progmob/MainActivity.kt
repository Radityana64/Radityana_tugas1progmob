package a.radityana_tugas1progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var masuk: Button

    private fun initComp() {
        username = findViewById(R.id.nama)
        masuk = findViewById(R.id.buttonM)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        initComp()

        masuk.setOnClickListener {
            startActivity(
                Intent(this, login::class.java)
                    .putExtra("yusername", username.text.toString())
            )
        }

    }
}


