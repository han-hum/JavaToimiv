package week7;
import java.util.Scanner;

import java.util.Scanner;

public class TextUserInterface {

    private Dictionary dictionary;
    private Scanner reader;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
        this.dictionary.add("add", "adds a word pair to the dictionary");
        this.dictionary.add("translate", "asks a word and prints its translation");
        this.dictionary.add("quit", "quit the text user interface");
    }
    public void start() {
        System.out.println("Statement: ");
        for (String statement: this.dictionary.translationList()) {
            System.out.println(statement);
        }
        while(true){
            System.out.println("Statement: ");
            String input = reader.nextLine();
            if(this.dictionary.translate(input) == null){
                System.out.println("Unknown statement");
            } else {
                if(input.equals("add")){
                    System.out.println("In Finnish:");
                    String word = reader.nextLine();
                    System.out.println("Translation:");
                    String translation = reader.nextLine();
                    this.dictionary.add(word, translation);
                } if(input.equals("translate")){
                    System.out.println("Give a word:");
                    String word = reader.nextLine();
                    System.out.println("Translation:");
                    System.out.println(this.dictionary.translate(word));
                }
                if(input.equals("quit")){
                    System.out.println("Cheers!");
                    break;
                }
            }
        }
    }
}