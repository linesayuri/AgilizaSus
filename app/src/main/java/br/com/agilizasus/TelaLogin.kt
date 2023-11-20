package br.com.agilizasus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.agilizasus.ui.theme.AgilizaSusTheme

class TelaLogin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

    val btn_sitegov : Button = findViewById<Button>(R.id.btn_sitegov)
        val btn_primeirocadastro : Button = findViewById<Button>(R.id.btn_primeirocadastro)


        btn_sitegov.setOnClickListener{
            val uriString
            val i = Intent(Intent.ACTION_VIEW, Uri.parse( uriString: "https://sso.acesso.gov.br/login?client_id=www.gov.br&authorization_id=18beac91490"))
            startActivity(i)
        }

        btn_primeirocadastro.setOnClickListener{
            val i = Intent(this,TelaCadastro1::class.java)
            startActivity(i)
        }
    }
}
