package robyn.stringReversal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringInput;
        ArrayList<Character> stringArray = new ArrayList<Character>();

        System.out.println("Please Enter A String: ");
        stringInput = input.next();

        for(int i = 0; i != stringInput.length() ; i++){
            stringArray.add((char) stringInput.indexOf(i));
        }
    }
}
