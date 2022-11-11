/*
 * A simple Java source file
 */
package com.example.jse.m01.s02;

// import java.lang.Math; // java.lang implicitly imported
//import com.example.jse.m01.s05.*;
/**
 * A "hello" class
 * 
 * @author Emanuele Galli
 */
public class Simple {
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Bella lì, "); 
        //solo print senza ln stampa senza andare a capo
        // a different input argument leads to a different output
        if (args.length == 1) {
            System.out.println(args[0]);
        }
        //System.out.println(Variable.class);
        System.out.println(Math.PI);
    }
}

class PackageClass {
    // TODO: Not implemented (yet)
}
