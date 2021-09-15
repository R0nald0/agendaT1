package com.example.agendaa;

import java.io.Serializable;

public class Contato implements Serializable {

    private String contatoNome;
    private String contatoEndereco;
    private int    contatoTelefone;



    public String getContatoNome() {
        return contatoNome;
    }

    public void setContatoNome(String contatoNome) {
        this.contatoNome = contatoNome;
    }

    public String getContatoEndereco() {
        return contatoEndereco;
    }

    public void setContatoEndereco(String contatoEndereco) {
        this.contatoEndereco = contatoEndereco;
    }

    public int getContatoTelefone() {
        return contatoTelefone;
    }

    public void setContatoTelefone(int contatoTelefone) {
        this.contatoTelefone = contatoTelefone;
    }
}
