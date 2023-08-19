package javaStream.C_pipelineStream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class A_streamPipeline {
    //stream pipeline adalah cara pembuatan stream secara satu-kesatuan antara datanya dan operation nya.
    //cara pembuatan stream pipeline adalah best practice untuk pembuatan stream atau ini cara yang biasa digunakan programmer java.
    //lihat contoh dibawah cara pembuatan stream pipeline.
    @Test
    public void streamPipeline() {
        Stream<String> name = Stream.of("goffar", "ronaldo", "neymar", "messi");
        name.map((data) -> data.toUpperCase()).map((data) -> "ny name: " + data).forEach((data) -> System.out.println(data));
    }
}
