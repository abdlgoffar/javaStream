package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class I_sorted {
    //method sorted() operation digunakan untuk mengurutkan data secara ascending.
    @Test
    public void sorted() {
        Stream<String> name = Stream.of("abdul goffar", "benzema", "bruno fernandez", "cristiano ronaldo", "david beckham");
        name.sorted().forEach((data) -> System.out.println(data));
    }
}
