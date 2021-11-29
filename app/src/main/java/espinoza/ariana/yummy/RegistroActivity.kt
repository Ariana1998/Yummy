package espinoza.ariana.yummy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val button: Button = findViewById(R.id.btn_registro)

        button.setOnClickListener{
            var intent: Intent = Intent(this,MenuPrincipalActivity::class.java)
            startActivity(intent)
        }
    }
}