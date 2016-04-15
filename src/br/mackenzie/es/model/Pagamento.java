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
public class Pagamento {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public boolean realizaPagamento(double valor,String tipo,String numero, String bandeira, String senha) {
        this.valor = valor;
        
        if (tipo.equals("debito")){
        Cartao c = new CDebito();
            c.setBandeira(bandeira);
            c.setNumero(numero);
            c.setSenha(senha);
        }
        else { 
            Cartao c = new CCredito();
            c.setBandeira(bandeira);
            c.setNumero(numero);
            c.setSenha(senha);
        }
        
        return true;
    }
}
