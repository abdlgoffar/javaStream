package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class F_limit {
    //method limit() operation digunakan untuk pengambilan data stream berdasarkan limit yang di request.
    @Test
    public void limit() {
        //contoh operation limit().
        Stream<String> animal = Stream.of("tiger", "elephant", "tiger", "rabbit", "dog", "rabbit", "fish");
        animal.limit(3L).forEach((data) -> System.out.println(data));
    }
}
