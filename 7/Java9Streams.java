/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess7Codes;

/**
 *
 * @author Admin3
 */
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java9Streams {

    public static void main(String[] args) {
        Stream.of("h", "e", "l", "", "l", "o").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
        System.out.println("");
        Stream.of("h", "e", "l", "", "l", "o").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
        System.out.println("");
        Stream.of("h", "e", "l", "", "l", "o", "h", "", "i").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
        System.out.println("");
        IntStream.iterate(2, x -> x < 8, x -> x+2).forEach(System.out::println);
        Stream.ofNullable(100).count();
        Stream.ofNullable(null).count();
        
        IntStream.iterate(6, x -> x > 2, x -> x-2).forEach(System.out::print);
    }
}
