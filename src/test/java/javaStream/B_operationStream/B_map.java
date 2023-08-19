package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class B_map {
    //contoh operation stream.
    //method map() digunakan untuk memodifkasi data stream, dan return value nya stream baru.
    @Test
    public void map() {
        Stream<String> animal = Stream.of("cat", "tiger", "bear", "sheep");
        //contoh operation map stream.
        Stream<String> animal2 = animal.map((data) -> data.toUpperCase());
        animal2.forEach((data) -> System.out.println(data));
    }
}
