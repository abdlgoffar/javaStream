package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class M_count {
    //method count() operation digunakan untuk mengambil jumlah data stream.
    @Test
    public void count() {
        Stream<Long> number = Stream.of(10L, 1000L, 20L, 1000000L, 30L, 40L, 50L);
        long count = number.count();
        System.out.println(count);
    }
}
