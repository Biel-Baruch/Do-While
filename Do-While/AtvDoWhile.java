/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdowhile;

/**
 *
 * @author baruc
 */
public class AtvDoWhile {

    public static void main(String[] args) {
        
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("A contagem foi interrompida.");
            }
        }
        System.out.println("FIM!");
        
    }
}
