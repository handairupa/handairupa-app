package com.example.handairupaapps.akun

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.example.handairupaapps.button.LoginButton
import com.example.handairupaapps.databinding.ActivityLoginBinding
import com.example.handairupaapps.edittext.EmailEt
import com.example.handairupaapps.edittext.PasswordEt

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private lateinit var button: LoginButton
    private lateinit var etEmail: EmailEt
    private lateinit var etPassword: PasswordEt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button = binding.loginbtn
        etEmail = binding.etemail
        etPassword = binding.etpassword

        setMyButtonEnable()

        binding.tap.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.forget.setOnClickListener {
            startActivity(Intent(this, ResetActivity::class.java))
        }

        etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                setMyButtonEnable()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        etPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                setMyButtonEnable()
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

    }


    private fun setMyButtonEnable() {
        val resultemail = etEmail.text
        val resultpw = etPassword.text

        button.isEnabled = resultemail != null && resultemail.toString()
            .isNotEmpty() && resultpw != null && resultpw.toString().length > 5

    }
}