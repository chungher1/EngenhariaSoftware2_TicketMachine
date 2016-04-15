/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.es.controller;

import br.mackenzie.es.model.PapelMoeda;

/**
 *
 * @author 41419634
 */
public class Controller {
    public static void evniarDinheiro(String valor) {
        
        PapelMoeda a = new PapelMoeda(Double.parseDouble(valor));

        
    }
}
