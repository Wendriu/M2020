/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona2020.aquecimento.p2;

/**
 *
 * @author Wendriu
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double A, X;
        
        A = Double.parseDouble(in.readLine());
      
        X = 3.145159 * (A*A);
        
        System.out.printf("X = %d\n", X);
        
    }
    
}