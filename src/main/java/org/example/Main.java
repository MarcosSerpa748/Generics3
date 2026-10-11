package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bulldog> bulldogs =  new ArrayList<>();

        bulldogs.add(new Bulldog());
        bulldogs.add(new Bulldog());


        System.out.println(bulldogs.size());

        Utilitarios.adicionarBulldogs(bulldogs);

        System.out.println();

        System.out.println(bulldogs.size());
    }
}