package espinoza.ariana.yummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button= findViewById(R.id.btn_login)

        button.setOnClickListener{
            var intent: Intent= Intent(this,RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}