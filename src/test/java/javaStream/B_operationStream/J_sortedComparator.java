package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class J_sortedComparator {
    //method sortedComparator() operation digunakan untuk mengurutkan data menggunakan comparator atau pembanding.
    @Test
    public void sortedComparator() {
        Stream<String> name = Stream.of("abdul goffar", "benzema", "bruno fernandez", "cristiano ronaldo", "david beckham");
        name.sorted(Comparator.reverseOrder()).forEach((data) -> System.out.println(data));
        //reverseOrder() adalah method pembanding bawaan di java, method ini akan membalik proses pengurutan data.
    }
}
