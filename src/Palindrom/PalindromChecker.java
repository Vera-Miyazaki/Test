package Palindrom;

import java.util.ArrayList;

public class PalindromChecker {

    public static boolean checkPalindrom(ArrayList<Integer> numbers){
        if (numbers.indexOf(numbers)<=1){return true;}

        for (int i = 0; i<numbers.lastIndexOf(numbers)-1; i++){
            for (int j= 0; j< numbers.lastIndexOf(numbers);){
            if (numbers.get(i) == numbers.get(j)){ return true;}
        }
    }return false;
}}


