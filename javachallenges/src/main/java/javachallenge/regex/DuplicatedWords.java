package javachallenge.regex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicatedWords {

    public static void removeDuplicates(List<String> sentences) {

        String regex =  "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        sentences.forEach( input -> {

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        });
    }

    public static void main(String[] args){
        removeDuplicates(Arrays.asList(
                "Goodbye bye bye world world world",
                "Sam went went to to to his business",
                "Reya is is the the best player in eye eye game",
                "in inthe",
                "Hello hello Ab aB"
        ));
    }

}
