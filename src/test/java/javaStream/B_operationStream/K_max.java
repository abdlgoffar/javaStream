package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class K_max {
    //method max() operation digunakan untuk mengambil data maksimal berdasarkan comparator atau pembanding nya.
    @Test
    public void max() {
        Stream<Long> number = Stream.of(10L, 1000L, 20L, 1000000L, 30L, 40L, 50L);
        number.max(Comparator.naturalOrder()).ifPresent((data) -> System.out.println(data));
    }
}
