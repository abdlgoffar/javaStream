package javaStream.B_operationStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class C_flatMap {
    //contoh operation stream.
    //method flatMap() digunakan untuk memodifkasi data stream, dan return value nya stream baru yang bisa lebih dari satu data
    //atau return value stream barunya bisa digandakan.
    @Test
    public void flatMap() {
        //contoh penggunaan operation stream flatMap().
        //data stream animal digandakan menjadi tiga dengan operation flatMap().
        Stream<String> animal = Stream.of("cat", "tiger", "bear", "sheep");
        animal.flatMap((data) -> Stream.of("data awal: "+data, "ubah ke huruf besar: "+data.toUpperCase(), "panjang data: "+data.length())).forEach((data) -> System.out.println(data));
    }
}
