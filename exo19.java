package ma.to.dart;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class exo19 {
        public static void main(String[] args) {
            int [] array= new int[]{1,2,3,4,5,6,7,8,9,10};
            int sum = Arrays.stream(array).filter(i->i%2==0).sum();
            int vb= IntStream.rangeClosed(1,10).filter(i->i%2==0).sum();
            int vb2= Stream.of(2,4,6,8,10).collect(Collectors.summingInt(i ->i));
            int vb3= IntStream.generate(()->10).limit(3).boxed().collect(Collectors.reducing((a,b)->a+b)).orElse(0);
            int  vb4= Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().filter(i -> i%2==0).reduce(0,(a,b)-> a+b);


            System.out.println( +vb+ ",___,"+vb2 +"___"+ vb3+ ",___,"+vb4);
        }
    }

