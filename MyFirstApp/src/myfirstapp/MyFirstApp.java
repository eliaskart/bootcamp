/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author arxid
 */
public class MyFirstApp {
    
    //Indentation=Εσοχή, οτι ολα μπαίνουν μέσα
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello!!");
        System.out.println("");
        System.out.print("Liakos");
        System.out.print("Liakos");
        System.out.println(5+2);
        System.out.println(5-2);
        System.out.println(5*2);
        System.out.println(5/2);  
        System.out.println(5%2);     //Υπόλοιπο
        System.out.println(10.0/3);  //Πρέπει να τον δηλώσεις ακέραιο
        
        System.out.print("The result of 10+5=");
        System.out.println(10+5);
        
        System.out.println("The result of 10+5=" + (10+5));
        
        
        //Variables
        int a = 1012;
        
        //memory variables
        byte x1 = 127;      //8bits
        short x2 = 13;      //16bits
        int x3 = 14;        //32bits
        long x4 = 20;       //64bits
        
        float x5 = 34.3f;
        double b = 230.223;
        
        boolean correct = false;
        String word = "Prophet";
        
        char symbol = 'n';        //Ποια είναι η διαφορά σε αυτές τις 2 γραμμές;
        int symbol2 = 'a';
        
        System.out.println("The value of variable a is " + a);
        System.out.println("The value of variable b is "+ b);
        System.out.println(correct + " " + word );
        System.out.println(symbol);
        System.out.println(symbol2);                              //unicode-table.com (Θεση στη σειρα ακεραιων)
               
        
    }
    
}
