package com.example.agendaa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Cadastro extends AppCompatActivity {

    private EditText email ;
    private EditText nome;
    private EditText senha;
    private Spinner estados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        this.email = (EditText) findViewById(R.id.etEmail);
        this.nome =(EditText)  findViewById(R.id.edtTxNome);
        this.senha =(EditText) findViewById(R.id.EdtSenhaCad);
        Button btnCads= (Button) findViewById(R.id.btnCad);
        this.estados = (Spinner) findViewById(R.id.SpEstados);


        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.estados,
                android.R.layout.simple_spinner_item
         );

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        estados.setAdapter(adapter);

        btnCads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nome.getText().length() ==0){
                    nome.setError("Preencha este campo");
                }else if (email.getText().length() ==0){
                    email.setError("Preencha este campo");

                }else if (senha.getText().length() ==0){
                    senha.setError("Preencha Este Campo");
                }
                else {
                    startActivity(new Intent(Cadastro.this,Inicio.class));
                }
            }
        });

    }

}