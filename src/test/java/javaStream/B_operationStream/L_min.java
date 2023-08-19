package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class L_min {
    //method min() operation digunakan untuk mengambil data minimal berdasarkan comparator atau pembanding nya.
    @Test
    public void min() {
        Stream<Long> number = Stream.of(10L, 1000L, 20L, 1000000L, 30L, 40L, 50L);
        number.min(Comparator.naturalOrder()).ifPresent((data) -> System.out.println(data));
    }
}
