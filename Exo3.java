package ma.to.dart;


import java.util.function.Consumer;
import java.util.function.Supplier;

public class Exo3 {
    public static void main(String[] args) {
        Supplier<String> place=()->"Viena";
        Places places = new Places();
        populate(places, place);
        Consumer<Places> consumer=(p-> System.out.println(p.location));

    }
    static <R> void  populate(Places t, Supplier<R> supplier){
        t.location= String.valueOf(supplier.get());
            }
    static class Places {
        String location;
    }
}
