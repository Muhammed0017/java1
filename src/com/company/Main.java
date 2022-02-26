package com.company;
public class Main {
    public static void main(String[] args) {
        century(1, 2, 3, 4, 5, 6,7);
    }

    static void century(int... number) {
        int counter = 0 ;
        for (int i = 0; i < number.length;i++){
            counter += number[i];
        }
        System.out.println(counter);

    }
}