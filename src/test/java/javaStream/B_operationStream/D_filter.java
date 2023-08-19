package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class D_filter {
    //method filter() operation digunakan untuk pemilihan data stream dengan return value boolean,
    //true jika datanya ada false jika datanya tidak ada.
    @Test
    public void filter() {
        //contoh operation filter().
        Stream<String> animal = Stream.of("tiger", "elephant", "rabbit", "dog", "fish");
        animal.filter((data) -> data.length() == 3).forEach((data) -> System.out.println(data));
    }
}
