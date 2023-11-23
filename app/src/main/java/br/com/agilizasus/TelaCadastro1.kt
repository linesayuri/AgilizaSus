package br.com.agilizasus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class TelaCadastro1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_cadastro1)

        val btncadastroproximo: Button = findViewById(R.id.btncadastroproximo)

        btncadastroproximo.setOnClickListener{
            val i = Intent(this,TelaCadastro2::class.java)
            startActivity(i)
        }

    }
}
