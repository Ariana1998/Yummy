package espinoza.ariana.yummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.view.View

class MetodosPagoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metodospago)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.opcionefectivo ->
                    if (checked) {
                        // Pirates are the best
                    }
                R.id.opciontarjeta ->
                    if (checked) {
                        // Ninjas rule
                    }
            }
        }
    }
}