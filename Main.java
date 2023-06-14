// Problem Statement
// Using Java Stack, create a program that will determine whether a set of parenthesis ((,{) is balance
// or not
// Input
// Input starts with a number N and is followed by N sets of parenthesis
// Output
// Print BALANCED in the parenthesis is balanced, NOT BALANCED otherwise.

import java.util.*;


public class Main {
    public static void main(String args[]){
        Stack<String> stackLeft = new Stack<String>();
        Scanner inputScan = new Scanner(System.in);
        boolean equalOrNot = true;
        String outputPush;

        System.out.println("Enter Input:");
        String inputGet = inputScan.nextLine();

        for(int i = 0; i <inputGet.length(); i++){
            String letter = String.valueOf(inputGet.charAt(i));
            if(letter == "{" || letter == "(" || letter == "["){
                stackLeft.push(letter);
                continue;
            }
            String check;

            switch(letter) {
                case "}":
                    check = stackLeft.pop();
                    if(check == "("  || check == "[") equalOrNot = false;
                    break;
                case ")":
                    check = stackLeft.pop();
                    if(check == "{"  || check == "[") equalOrNot = false;
                    break;
                case "]":
                    check = stackLeft.pop();
                    if(check == "{"  || check == "(") equalOrNot = false;
                    break;
            }      
        }

        if(equalOrNot)outputPush = "BALANCED";
        else outputPush = "NOT BALANCED";

        System.out.println(inputGet +  "is" + outputPush);


    }
}