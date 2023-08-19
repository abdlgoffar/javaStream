package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class O_allMatch {
    //method allMatch() operation digunakan untuk mengetahui data yang match atau cocok dengan kondisi, method ini
    //hanya akan bernilai true jika semua data nya match atau cocok dengan kondisinya.
    @Test
    public void allMatch() {
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
        boolean chekNumber = number.allMatch((data) -> data > 0);
        System.out.println(chekNumber);
    }
}
