package javaStream.A_createStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class B_createDataStreamInfinite {
    //stream infinite adalah stream yang data nya tidak ada batasnya.
    @Test
    public void createDataStreamInfiniteGenerate() {
        //stream infinite generate adalah stream infinite untuk menghasilkan data secara terus menerus.
        Stream<String> name = Stream.generate(() -> "abdul goffar");
        name.forEach(data -> System.out.println(data));
    }
    @Test
    public void createDataStreamInfiniteIterate() {
        //stream infinite iterate adalah stream infinite untuk menghasilkan data secara terus menerus dan bisa melakukan operasi pada datanya
        //dengan ternary operator.
        Stream<Integer> number = Stream.iterate(1, data -> data + 1);
        number.forEach(data -> System.out.println(data));
    }
}
