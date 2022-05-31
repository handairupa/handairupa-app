package com.example.handairupaapps.akun

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.example.handairupaapps.button.RegisterButton
import com.example.handairupaapps.databinding.ActivityRegisterBinding
import com.example.handairupaapps.edittext.EmailEt
import com.example.handairupaapps.edittext.NameEt
import com.example.handairupaapps.edittext.PasswordEt

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    private lateinit var button: RegisterButton
    private lateinit var etName: NameEt
    private lateinit var etEmail: EmailEt
    private lateinit var etPassword: PasswordEt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button = binding.regisbtn
        etName = binding.etname
        etEmail = binding.etemail
        etPassword = binding.etpassword

        setMyButtonEnable()
//
//        binding.tap.setOnClickListener {
//            startActivity(Intent(this, RegisterActivity::class.java))
//        }
        etName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                setMyButtonEnable()
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

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
        val resultname = etName.text
        val resultemail = etEmail.text
        val resultpw = etPassword.text

        button.isEnabled = resultname != null && resultname.toString()
            .isNotEmpty() && resultemail != null && resultemail.toString()
            .isNotEmpty() && resultpw != null && resultpw.toString().length > 5

    }
}