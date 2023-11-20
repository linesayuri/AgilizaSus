package br.com.agilizasus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnfilavirtual : Button = findViewById<Button>(R.id.btnfilavirtual)
        val btntelemedicina : Button = findViewById<Button>(R.id.btntelemedicina)
        val btnagendamentos : Button = findViewById<Button>(R.id.btnagendamentos)
        val btnexames : Button = findViewById<Button>(R.id.btnexames)
        val btnguiasepedidos : Button = findViewById<Button>(R.id.btnguiasepedidos)
        val btnhistoricodeconsultas : Button = findViewById<Button>(R.id.btnhistoricodeconsultas)
        val btnunidadesproximas : Button = findViewById<Button>(R.id.btnunidadesproximas)

        btnfilavirtual.setOnClickListener{
            val i = Intent(this,TelaFilaVirtualPostos::class.java)
            startActivity(i)
        }

        btntelemedicina.setOnClickListener{
            val i = Intent(this,TelaTelemedicina::class.java)
            startActivity(i)
        }

        btnagendamentos.setOnClickListener{
            val i = Intent(this,TelaAgendamentos::class.java)
            startActivity(i)
        }

        btnexames.setOnClickListener{
            val i = Intent(this,TelaExames::class.java)
            startActivity(i)
        }

        btnguiasepedidos.setOnClickListener{
            val i = Intent(this,TelaGuiasePedidos::class.java)
            startActivity(i)
        }

        btnhistoricodeconsultas.setOnClickListener{
            val i = Intent(this,TelaHistoricodeConsultas::class.java)
            startActivity(i)
        }

        btnunidadesproximas.setOnClickListener{
            val i = Intent(this,TelaUnidadesProximas::class.java)
            startActivity(i)
        }

    }
}
