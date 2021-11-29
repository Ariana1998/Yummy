package espinoza.ariana.yummy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DireccionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direcciones)

        val button: Button = findViewById(R.id.btn_guardardireccion)

        //button.setOnClickListener{
          //  var intent: Intent = Intent(this,//a donde debe mandar esto)
            //startActivity(intent)
        //}
    }
}