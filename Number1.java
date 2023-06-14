// Problem Statement
// Using Java Stack, create a program that will determine whether a set of parenthesis ((,{) is balance
// or not
// Input
// Input starts with a number N and is followed by N sets of parenthesis
// Output
// Print BALANCED in the parenthesis is balanced, NOT BALANCED otherwise.

import java.util.Stack;
import java.util.Scanner;


public class Number1 {
    public static boolean checkForBalance(String inputStr){
        Stack<Character> stackLeft = new Stack<>();
        for(int i = 0; i < inputStr.length(); i++){
            char letter = inputStr.charAt(i);
            if(letter == '{' || letter == '(' || letter == '['){
                stackLeft.push(letter);
                continue;
            }
            if (stackLeft.isEmpty()) return false;
            char check;
            switch(letter) {
                case '}':
                    check = stackLeft.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ')':
                    check = stackLeft.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case ']':
                    check = stackLeft.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }      
        }
    return (stackLeft.isEmpty());
    }
    
    public static void main(String[] args){
        Scanner inputScan = new Scanner(System.in);
        String outputPush;
        String inputGet;

        System.out.println("Enter Input:");
        inputGet = inputScan.nextLine();

        if(checkForBalance(inputGet))outputPush = "BALANCED";
        else outputPush = "NOT BALANCED";

        System.out.println(inputGet +  " is " + outputPush);


    }
}