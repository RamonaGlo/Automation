package com.company;

import java.util.*;

public class test {

    //Write a program that prints ‘Hello World’ to the screen.
// public static void main(String []args){
//  System.out.print("Hello world");
// }

    //Write a program that prints the sum of the first n numbers [ 1 + 2 + 3 +….+ n ]

//    public static void main(String[]args) {
//        Integer suma = getSum(10);
//        System.out.print(suma);
//    }
//
//  static public Integer getSum(Integer n){
//      Integer result = 0;
//      for(int i=1 ; i <= n; i++) {
//          result = result + i;
//      }
//       return result;
//        }
//
    //   Write a program that prints the  largest prime number less than a given positive N .
//    public static void main(String[] args){
//        int n = 7;
//        int result = 1;
//        for (int i = 1; i <= n-1; i++) {
//            if(isPrime (i)){
//               result = i;
//            }
//        }
//        System.out.print(result);
//    }
//    static public Boolean isPrime(Integer n) {
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    }
    // Write a function that returns the largest element in a list.

//    public static void main (String [] args){
//       ArrayList<Integer> lista = new ArrayList<>();
//        lista.add(1);
//        lista.add(3);
//        lista.add(44);
//        lista.add(20);
//        lista.add(120);
//        lista.add(12);
//
//        System.out.println(getMax(lista));
//    }
//
//    static public Integer getMax (List<Integer> list){
//        Integer max = 0;
//        for (int i = 0; i <= list.size()-1; i++){
//            if(list.get(i) > max ){
//                max = list.get(i);
//            }
//        }
//        return max;
//    }


    //    Write function that reverses a list, preferably in place.
//
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Andrew");
//        names.add("John");
//        names.add("Mary");
//
//        ArrayList<String> newNames = reverse(names);
//        System.out.println(newNames);
//    }
//
//    public static ArrayList<String> reverse(ArrayList<String> names) {
//        ArrayList<String> result = new ArrayList<>();
//
//        for (int i = names.size() - 1; i >= 0; i--) {
//            result.add(names.get(i));
//        }
//
//        return result;
//    }
    //    Write a function that checks whether an element occurs in a list.
//
//    public static void main(String[] args) {
//        List<Integer> arrlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        System.out.println(retval(arrlist,2));
//    }
//    public static Boolean retval (List<Integer> list, Integer value){
//
//        for (int i = 0; i <= list.size() -1; i++) {
//            if (list.get(i) == value) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    }


    // Write a function that returns the elements on odd positions in a list.

//    public static void main(String[] args) {
//        List<Integer> arrlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> result = getOddPositionValues(arrlist);
//        System.out.println(result);
//        }
//
//    private static List<Integer> getOddPositionValues(List<Integer> arrlist) {
//        List<Integer> result = new ArrayList<>();
//
//        for(int i = 0; i<= arrlist.size()-1; i++){
//            if (i % 2 != 0){
//                result.add(arrlist.get(i));
//            }
//        }
//
//        return result;
//    }
//}

            // Write a function that computes the running total of a list.

//    public static void main(String[] args) {
//
//        List<Integer> arrlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> result = getSum(arrlist);
//        System.out.println(result);
//    }
//
//    private static List<Integer> getSum(List<Integer> arrlist) {
//        List<Integer> rest = new ArrayList<>();
//        int sum = 0;
//        for (int i : arrlist) {
//            sum += i;
//        }
//
//        return Collections.singletonList(sum);
//    }
//
//
//}

            // Write a function that tests whether a string is a palindrome.

//    public static void main(String[]args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a String");
//
//        String str = scan.nextLine();
//        String reverse = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse += str.charAt(i);
//        }
//        if (reverse.equalsIgnoreCase(str))
//            System.out.print("Palindrome!");
//
//         else System.out.println("Not Palindrome");
//    }
//}






