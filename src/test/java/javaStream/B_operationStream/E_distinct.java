package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class E_distinct {
    //method distinct() operation digunakan untuk pemilihan data stream yang duplicate, nanti apabila
    //terdapat data yang duplicate otomatis akan di hapus.
    @Test
    public void distinct() {
        //contoh operation distinct().
        Stream<String> animal = Stream.of("tiger", "elephant", "tiger", "rabbit", "dog", "rabbit", "fish");
        animal.distinct().forEach((data) -> System.out.println(data));
    }
}
