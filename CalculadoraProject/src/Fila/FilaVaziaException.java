/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 *
 * @author gianc
 */
public class FilaVaziaException extends RuntimeException {

    public FilaVaziaException() {
        System.out.println("Fila esta vazia");
    }
    
}
