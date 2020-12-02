package ma.to.dart;

import java.util.function.BiFunction;

@FunctionalInterface
interface HelloWorld{
    public String sayHello(String name);
    public String toString();
    public boolean equals(Object obj);
    }

public class Exo12 {
public  String name;
public String sayBye(String name ){ return name;}

    public static void main(String[] args) {
        HelloWorld Exo12= (p)->p;
        Exo12 h= new Exo12();
        BiFunction<String, String, String>f = (part1, part2) ->(part1 + part2);
        final String result = f.apply(h.sayBye("Hello world !"),
                                f.apply("Bye Bye",
                                Exo12.sayHello("world!")));
        System.out.println(result);
}}
