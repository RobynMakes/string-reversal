package robyn.stringReversal;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class InputManagement {
    public static @NotNull
    ArrayList<Character> getInput(){
        Scanner input = new Scanner(System.in);
        String stringInput;
        ArrayList<Character> stringArray = new ArrayList<>();

        System.out.println("Please Enter A String: ");
        stringInput = input.next();

        input.close();

        for(int i = 0; i != stringInput.length() ; i++)
            stringArray.add((stringInput.charAt(i)));

        return stringArray;
    }

    public static ArrayList<Character> reversedArray(ArrayList<Character> targetArray){
        ArrayList<Character> reversedArray = new ArrayList<>();

        for(int i = targetArray.size()-1; i >= 0; i--)
            reversedArray.add(targetArray.get(i));

        return reversedArray;
    }

    public static void printArray(ArrayList<Character> targetArray){
        for(int i = 0; i != targetArray.size(); i++){
            System.out.print(targetArray.get(i));
        }
    }
}
