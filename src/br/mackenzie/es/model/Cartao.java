/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.es.model;

/**
 *
 * @author whoami
 */
public abstract class Cartao {
    protected String numero;
    protected String bandeira;
    protected String senha;

    public Cartao() {
    }

    public Cartao(String numero, String bandeira, String senha) {
        this.numero = numero;
        this.bandeira = bandeira;
        this.senha = senha;
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
