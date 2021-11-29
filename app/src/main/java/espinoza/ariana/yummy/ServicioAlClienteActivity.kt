package espinoza.ariana.yummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServicioAlClienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicioalcliente)

        val button: Button = findViewById(R.id.btn_guardardireccion)

        //button.setOnClickListener{
        //  var intent: Intent = Intent(this,//a donde debe mandar esto)
        //startActivity(intent)
        //}
    }
}