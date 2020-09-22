package br.com.fernandosousa.lmsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_constraint)

        //imgLogin.setImageResource(R.drawable.imagem_login)
        textoInicial.setText(R.string.mensagem_login)

        botaoLogin.setOnClickListener {

            progress.visibility = View.VISIBLE

            val valorUsuario = campoUsuario.text.toString()
            var valorSenha = campoSenha.text.toString()
            //Toast.makeText(this, "Usuário $valorUsuario; Senha $valorSenha", Toast.LENGTH_LONG).show()


            val intent = Intent(this, TelaInicialActivity::class.java)
            val params = Bundle()
            params.putString("nome_usuario", valorUsuario)
            params.putInt("numero", 10)

            intent.putExtras(params)

            startActivity(intent)

            //progress.visibility = View.GONE


        }

    }
}