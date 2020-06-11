package io.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class Main {
    public static void main(String args[]) {
        Observable.just("Hellow, world!")
                .map(s -> "Sasha - " + s)
                .subscribe(System.out::println);
    }
}
