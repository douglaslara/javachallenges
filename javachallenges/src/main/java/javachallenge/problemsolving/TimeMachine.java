package javachallenge.problemsolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.time.LocalDate.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TimeMachine {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int remainingTo256 = 256;
        Month[] months = Month.values();
        int i = 0;
        while(remainingTo256 > months[i].numberOfDays.apply(year)){
            remainingTo256 -= months[i].numberOfDays.apply(year);
            i++;
        }
        LocalDate ld = LocalDate.of(year, i + 1, remainingTo256);
        return DateTimeFormatter.ofPattern("MM.dd.yyyy").format(ld);
    }

    public static void main(String[] args) throws IOException {

        int year = 1800;

        System.out.println(dayOfProgrammer(year));
    }

    public enum Month {
        JANUARY(year -> {return 31;}),
        FEBRUARY(year -> {
            if(year == 1918){
                return 15;
            }
            if(year > 1918){
                if(year%400 == 0){
                    return 29;
                }
                if((year%4 == 0) && (year%100 >0)){
                    return 29;
                }
            }
            if(year < 1918 && year%4 == 0){
                return 29;
            }
            return 28;
        }),
        MARCH(year -> {return 31;}),
        APRIL(year -> {return 30;}),
        MAY(year -> {return 31;}),
        JUNE(year -> {return 30;}),
        JULY(year -> {return 31;}),
        AUGUST(year -> {return 31;}),
        SEPTEMBER(year -> {return 30;}),
        OCTOBER(year -> {return 31;}),
        NOVEMBER(year -> {return 30;}),
        DECEMBER(year -> {return 31;});

        public Function<Integer, Integer> numberOfDays;

        Month(Function<Integer, Integer> numberOfDays) {
            this.numberOfDays = numberOfDays;
        }
    }
}
