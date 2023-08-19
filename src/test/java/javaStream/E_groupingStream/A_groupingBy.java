package javaStream.E_groupingStream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A_groupingBy {
    //method groupingBy() yang terdapat di Object Collectors, berguna untuk mengelompokkan data sesuai kondisi.
    //penentuan groupnya sesuai return value method lambda nya.
    @Test
    public void groupingBy() {
        Stream<Long> price = Stream.of(1_000L, 2_000L, 3_000L, 4_000L, 5_000L, 6_000L, 7_000L, 8_000L, 9_000L, 10_000L);

        Map<String, List<Long>> priceGroup = price.collect(Collectors.groupingBy((data) -> {
            if (data > 5_000L) {
                return "product mahal";
            } else {
                return "product murah";
            }
        }));
        System.out.println(priceGroup );
    }

}