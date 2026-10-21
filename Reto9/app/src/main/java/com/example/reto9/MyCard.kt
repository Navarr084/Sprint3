package com.example.reto9

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.reto9.databinding.ViewMyCardBinding


class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context),
        this, true
    )

    var titulo: String
        get() = binding.txtTitulo.text.toString()
        set(value) {
            binding.txtTitulo.text = value
        }

    var subtitulo: String
        get() = binding.txtSubtitulo.text.toString()
        set(value) {
            binding.txtSubtitulo.text = value
        }

    var descripcion: String
        get() = binding.txtDescripcion.text.toString()
        set(value) {
            binding.txtDescripcion.text = value
        }

    var textoBoton: String
        get() = binding.btnAccion.text.toString()
        set(value) {
            binding.btnAccion.text = value
        }

    var textoBotonDerecho: String
        get() = binding.btnAccionD.text.toString()
        set(value) {
            binding.btnAccionD.text = value
        }

    fun setImagen(imagen: Int, descripcion: String) {
        binding.imagenSeguridad.setImageResource(imagen)
        binding.imagenSeguridad.contentDescription = descripcion
    }

    fun setOnAccionClickListener(listener: () -> Unit) {
        binding.btnAccion.setOnClickListener {
            listener()
        }
    }

    fun setOnAccionDerechaClickListener(listener: () -> Unit) {
        binding.btnAccionD.setOnClickListener {
            listener()
        }
    }
}