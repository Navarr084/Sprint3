package com.example.reto7

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.reto7.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    /*
    * ACCESIBILIDAD
    * - La imagen tiene contentDescription para que talkBack pueda describirlas para personas ciegas.
    * - Los textos son sp para que no se modifique sea el dispositivo que sea.
    * - El botón es lo suficientemente grande para la persona con movilidad reducida
    * - El texto del botón es negro para que se vea mejor con el contraste de los colores del fondo
    *
    * UI + UX
    * - Jerarquía vidual: el título grande y en negrita para que destaque y el subtítulo más pequeño y en cursiva para que se diferencie
    * - Orden de visualización: imagen, título, subtítulo y botón
    * - Todo esta centrado y con márgenes múltiplo de 8 (16,24, 48dp) para que las pantallas se vean ordenadas
    * - El boton es especifico para que no de a la confusión
    *
    * PERSONALIZACIÓN COMPONENTES
    * - Botón: Creación shape con las esquinas de arriba redondeadas y fondo degradado.
    * - Imagen: Cración shape de la imagen con las 4 esquinas redondeadas y un borde rojo.
    *
    * BUENAS PACTICAS
    * - Los textos y el color creados en sus xml
    * - Uso de Binding: porque es más limpio y seguro.
    * - Uso de ConstraintLayout en los margenes para que se adapate a cualquier dispositivo.
    * - Los shape estan en la carpeta drawable para poder reutilizarlos.
    */

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Recorta la imagen con la forma del shape para que se vean las esquinas redondeadas
        binding.imagenVelada.clipToOutline = true

        // Al pulsar el botón aviso con un Toast de que la función aún no está disponible
        binding.boton.setOnClickListener {
            Toast.makeText(this, getString(R.string.textoBoton), Toast.LENGTH_SHORT).show()
        }
    }
}
