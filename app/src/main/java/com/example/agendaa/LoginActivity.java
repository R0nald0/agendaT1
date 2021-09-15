package com.example.agendaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button btEntrar =(Button) findViewById(R.id.btnEntrar);
        Button btCadastrar =(Button) findViewById(R.id.btnCadastro);
        email =(EditText)  findViewById(R.id.edtEmail);
        senha =(EditText) findViewById(R.id.edtSenha);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().length() !=0 && senha.getText().length() !=0){
                    Toast.makeText(getApplicationContext(),"Abrindo",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this,Inicio.class));
                }else {
                    Toast.makeText(getApplicationContext(),"Email ou Senha Inválidos",Toast.LENGTH_LONG).show();
                }
            }
        });

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,Cadastro.class));
            }
        });

    }
}