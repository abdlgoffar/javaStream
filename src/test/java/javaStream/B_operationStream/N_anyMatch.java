package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class N_anyMatch {
    //method anyMatch() operation digunakan untuk mengetahui data yang match atau cocok dengan kondisi, jika terdapat
    //satu saja data yang match atau cocok maka return value method ini true.
    @Test
    public void anyMatch() {
        Stream<String> password = Stream.of("goffar123", "ronaldo123", "neymar123");
        boolean checkPassword = password.anyMatch((data) -> data.equals("goffar123"));
        System.out.println(checkPassword);
    }
}
