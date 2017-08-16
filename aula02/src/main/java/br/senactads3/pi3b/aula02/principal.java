/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senactads3.pi3b.aula02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaio.hvsantos
 */
public class principal {
    public static void main(String[] args) {
        int x =10;
        if(System.currentTimeMillis() %2==1){
        System.out.println("hello world PI3B");
    }else{
            System.out.println("ERRO");
        }
        try {
            Thread.sleep(3L);
        } catch (InterruptedException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
