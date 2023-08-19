package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class G_skip {
    //method skip() operation digunakan untuk pengambilan data stream dan pada saat pengambilan data juga bisa dilakukan skip data
    //yang mau di ambil.
    @Test
    public void skip() {
        //contoh operation skip().
        Stream<String> animal = Stream.of("tiger", "elephant", "tiger", "rabbit", "dog", "rabbit", "fish");
        animal.limit(3L).forEach((data) -> System.out.println(data));
    }
}
