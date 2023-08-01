import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("Юля","Антон").map(x -> x+x +" ").forEach(System.out::println);
    }
}