package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class H_dropWhile {
    //method dropWhile() digunakan untuk menghapus data yang valuenya false dari kondisi, sampai ketemu data yang bernilai true,
    //dan mengambil sisa dari data stream nya.
    //d
    @Test
    public void dropWhile(){
        Stream<String> animal = Stream.of("tiger", "bird", "elephant", "dog", "fish");
        animal.dropWhile((data) -> data.length() < 8).forEach((d) -> System.out.println(d));
    }
}
