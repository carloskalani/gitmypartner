package com.sleipnir.mypartner.view.telainicial

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.sleipnir.mypartner.databinding.ActivityTelaInicialBinding
import com.sleipnir.mypartner.view.telameusdados.TelaMeusDados
import com.sleipnir.mypartner.view.telalogin.TelaLogin

class TelaInicial : AppCompatActivity() {


    private lateinit var binding: ActivityTelaInicialBinding
    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textArrowForward.setOnClickListener {
            val telaForward = Intent(this, TelaLogin::class.java)
            startActivity(telaForward)
        }

        binding.btnEntrar.setOnClickListener {view ->

            val snackbar = Snackbar.make(view, "Login", Snackbar.LENGTH_SHORT)
            snackbar.setBackgroundTint(Color.BLUE)
            snackbar.show()

            val intent = Intent(this, TelaLogin::class.java)
            startActivity(intent)

        }

        binding.textEsqueceuSenha.setOnClickListener {view ->

            val snackbar = Snackbar.make(view, "Reset senha", Snackbar.LENGTH_SHORT)
            snackbar.setBackgroundTint(Color.BLUE)
            snackbar.show()

        //
        //  Rotina para reset e cadastro de nova senha
        //  usar email para enviar o link
        //
        //    val intent = Intent(this, TelaResetSenha ::class.java)
        //    startActivity(intent)

        }

        binding.textCriarConta.setOnClickListener {view ->

            val snackbar = Snackbar.make(view, "Reset senha", Snackbar.LENGTH_SHORT)
            snackbar.setBackgroundTint(Color.BLUE)
            snackbar.show()

        //
        //  Rotina para criaxao de uma conta de acesso
        //
        //    val intent = Intent(this, TelaMeusDados ::class.java)
        //    startActivity(intent)


        }

    }


}