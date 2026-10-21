package com.example.reto9

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.reto9.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.miCard.titulo = getString(R.string.txtTitulo)
        binding.miCard.subtitulo = getString(R.string.txtSubtitulo)
        binding.miCard.descripcion = getString(R.string.txtDescripcion)
        binding.miCard.textoBoton = getString(R.string.btnAccion)
        binding.miCard.textoBotonDerecho = getString(R.string.btnAccion)
        binding.miCard.setImagen(
            R.drawable.outline_assured_workload_24,
            getString(R.string.txtDescripcionSeguridad)
        )

        binding.miCard.setOnAccionClickListener {
            Toast.makeText(
                this, "¡Vamos al curso!",
                Toast.LENGTH_LONG
            ).show()
        }

        binding.miCard.setOnAccionDerechaClickListener {
            Toast.makeText(
                this, "¡Vamos al curso!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}