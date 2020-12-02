package ma.to.dart;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Exo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture <String> completableFuture = CompletableFuture.supplyAsync(()-> "Hello");
        CompletableFuture<Void> c1=completableFuture.thenAccept(s-> System.out.println(s+"Wwolrd"));
        c1.get();

    }

    /*
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture <String> c2 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);}catch (InterruptedException e){ e.printStackTrace();}
            return "A B C";
        });
        c2.complete("Hello World");
        System.out.println(c2.get());
        }
        */





