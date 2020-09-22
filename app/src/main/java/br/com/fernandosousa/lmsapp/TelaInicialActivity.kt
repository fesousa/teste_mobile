package br.com.fernandosousa.lmsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaInicialActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val args = intent.extras
        val nome_usuario = args?.getString("nome_usuario")
        Toast.makeText(this, "Usuário: $nome_usuario", Toast.LENGTH_LONG).show()


        setSupportActionBar(toolbar_view)
        supportActionBar?.title = "Disciplinas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Ao terminar o Fast Quiz Faça:
        // Coloque um campo de texto no layout activity_tela_inicial, utilizando o editor visual
        // Em TelaInicialActivity, altere o texto do campo com o nome do usuário
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val itemId = item?.itemId

        if (itemId == R.id.action_buscar) {
            Toast.makeText(this, "Botão Buscar", Toast.LENGTH_LONG).show()
        } else if (itemId == R.id.action_atualizar) {
            Toast.makeText(this, "Botão Atualizar", Toast.LENGTH_LONG).show()
        } else if (itemId == R.id.action_config) {
            Toast.makeText(this, "Botão Config", Toast.LENGTH_LONG).show()
            // Abrir uma nova tela quando clicar em configuração
        } else if (itemId == android.R.id.home){
            // voltar para a tela inicial
            // Dica: a activity atual deve ser destruída
            finish()
        }

        return super.onOptionsItemSelected(item)
    }

}