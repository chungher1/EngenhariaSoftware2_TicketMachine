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
public class PapelMoeda {
    
    private double valor;

    public PapelMoeda(double valor) {
        this.valor = valor;
        
    }
    
    public double pagaDinehiro(String dinheiro) {
        
        double d = Double.parseDouble(dinheiro);
        
        double troco;
        
        troco = d - valor;
        
        return new Troco(troco).darTroco(); 
    }
}
