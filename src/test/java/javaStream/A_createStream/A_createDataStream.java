package javaStream.A_createStream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class A_createDataStream {
    @Test
    public void createDataStream() {
        //contoh membuat data stream yang tidak bisa null.
        Stream<String> animal = Stream.of("tiger", "lyon", "snake");

        //contoh membuat data stream yang bisa null.
        Stream<String> animal1 = Stream.of("bear", "dog", "pig");

        //contoh membuat data stream dari data collection.
        List<String> animal2 = List.of("snake", "fish", "frog");
        Stream<String> stream = animal2.stream();
    }
}
