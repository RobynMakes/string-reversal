package robyn.stringReversal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringInput;
        ArrayList<Character> stringArray = new ArrayList<>();
        ArrayList<Character> reversedArray = new ArrayList<>();

        System.out.println("Please Enter A String: ");
        stringInput = input.next();

        input.close();

        for(int i = 0; i != stringInput.length() ; i++){
            stringArray.add((stringInput.charAt(i)));
        }

        for(int i = stringArray.size()-1; i >= 0; i--){
            reversedArray.add(stringArray.get(i));
        }

        for(int i = 0; i != reversedArray.size(); i++){
            System.out.print(reversedArray.get(i));
        }

    }
}
