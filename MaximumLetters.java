package searchForLongest;

import java.util.Scanner;

public class MaximumLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st word:");
        String fWord = scanner.nextLine();
        System.out.println("Enter 2nd word:");
        String sWord = scanner.nextLine();

        String finalWord = "";
        int internalCount;
        int externalCount = 0;
        String letterInProgress="";
        int tempCount=0;


        for(int i=0; i<fWord.length(); i++){
            internalCount = externalCount;
//            letterInProgress = "" + fWord.charAt(i);
            for (; internalCount<sWord.length();){
                if(fWord.charAt(i) == sWord.charAt(internalCount)){
                    tempCount = internalCount;
                    finalWord = finalWord + fWord.charAt(i);
//                    letterInProgress ="";
                    break;
                }

                internalCount++;
               if(internalCount == sWord.length()){
                   internalCount = tempCount;
                   break;
               }
            }
            internalCount++;
            externalCount = internalCount;
        }
        System.out.println(finalWord);
    }
}
