package javaStream.D_collectStream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C_streamToMap {
    //collect adalah method untuk convert type data ke type data lain, method ini membutuhkan parameter onject Collectors.
    @Test
    public void streamToMap() {
        Stream<String> name = Stream.of("goffar", "ronaldo", "messi", "neymar", "haaland");
        //contoh convert data stream ke map, parameter lambda kesatu di method toMap() adalah key, parameter kedua value.
        Map<String, String> stringMap = name.collect(Collectors.toMap((data) -> data, (data) -> data));
        System.out.println(stringMap);
        System.out.println(stringMap.get("goffar"));
    }
}
