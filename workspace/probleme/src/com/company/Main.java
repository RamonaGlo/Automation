package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Write a program that prints ‘Hello World’ to the screen.
public class Main {

    public static void main(String[] args) {
//	    System.out.print ("Hello World");
//	    Integer suma =  getSum(10);
//        System.out.print(suma);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(44);
        lista.add(20);
        lista.add(120);
        lista.add(12);
// ++++++++++++++
        List<String> listaDeS =  Arrays.asList("dasda", "dsadasd", "dasda");

        listaDeS.contains("dasda");
        System.out.println(getMax(lista));

    }

// Write a program that prints the sum of the first n numbers [ 1 + 2 + 3 +….+ n ]
     static public Integer getSum(Integer n){
        Integer result = 0;
        for (int i = 1; i <= n; i++){
            result = result + i;
        }
        return result;
    }
//Write a program that prints the  largest prime number less than a given positive N .
    static public Boolean isPrime(Integer n){
        for (int i = 2; i <= n-1; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }


// Write a function that returns the largest element in a list.
    static public Integer getMax (List<Integer> list){
        Integer max = 0;
        for (int i = 0; i <= list.size()-1; i++){
            if(list.get(i) > max ){
                max = list.get(i);
            }
        }
        return max;
    }

    //Write function that reverses a list, preferably in place.

main
}
