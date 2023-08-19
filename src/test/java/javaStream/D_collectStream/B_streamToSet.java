package javaStream.D_collectStream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B_streamToSet {
    //collect adalah method untuk convert type data ke type data lain, method ini membutuhkan parameter onject Collectors.
    @Test
    public void streamToList() {
        Stream<String> name = Stream.of("goffar", "ronaldo", "messi", "neymar", "haaland");
        //contoh convert data stream ke set.
        Set<String> stringList = name.collect(Collectors.toSet());
        stringList.forEach((data) -> System.out.println(data));
    }
}
