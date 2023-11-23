package br.com.agilizasus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class TelaLogin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

    val btnsitegov : Button = findViewById(R.id.btn_sitegov)
        val btnprimeirocadastro : Button = findViewById(R.id.btn_primeirocadastro)


        btnsitegov.setOnClickListener{

            val i = Intent(Intent.ACTION_VIEW, Uri.parse( uriString:, "https://sso.acesso.gov.br/login?client_id=www.gov.br&authorization_id=18beac91490"))
            startActivity(i)
        }

        btnprimeirocadastro.setOnClickListener{
            val i = Intent(this,TelaCadastro1::class.java)
            startActivity(i)
        }
    }
}
