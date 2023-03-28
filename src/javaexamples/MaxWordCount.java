package javaexamples;

import java.util.Scanner;

public class MaxWordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        
        String[] words = sentence.split("\\s+");
        int maxCount = 0;
        String maxWord = "";
        
        for (String word : words) {
            int count = countOccurrences(words, word);
            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
        }
        
        System.out.println("The maximum word is '" + maxWord + "' with a count of " + maxCount);
    }
    
    public static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String word : arr) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}

