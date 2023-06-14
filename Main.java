// Problem Statement
// Using Java Stack, create a program that will determine whether a set of parenthesis ((,{) is balance
// or not
// Input
// Input starts with a number N and is followed by N sets of parenthesis
// Output
// Print BALANCED in the parenthesis is balanced, NOT BALANCED otherwise.

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static main(String args[]){
        Stack<String> stackLeft = new Stack<String>();
        Scanner inputScan = new Scanner(System.in);

        System.out.Println("Enter Input:");
        String inputGet = inputScan.nextLine();

        for(i = 0; i <inputGet.length(); i++){
            char letter = inputGet.charAt(i);
            if(letter == "{" || letter == "(" || letter == "["){
                stackLeft.push(letter);
                continue;
            }
            if(letter == "}" || letter == ")" || letter == "]"){
                stackLeft.pop();
            }
        }



    }
}