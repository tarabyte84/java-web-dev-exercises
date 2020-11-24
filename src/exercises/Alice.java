package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentenceUpper = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String sentence = sentenceUpper.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a term to search:");

        String searchTerm = input.next();
        searchTerm = searchTerm.toLowerCase();
        Boolean containsSearchTerm = sentence.contains(searchTerm);
        int termLocation = sentenceUpper.indexOf(searchTerm);

        System.out.println(containsSearchTerm);
        System.out.println("The term you searched is located at index " +termLocation +" and is " +searchTerm.length() +" characters long.");
        String termRemoved = sentenceUpper.replace(sentenceUpper.substring(termLocation, (termLocation+searchTerm.length()+1)), "");
        System.out.println(termRemoved);

    }

}
