package org.example;

import java.util.List;

public class Utilitarios {

    public static void adicionarBulldogs(List<? super Bulldog> bulldogs){
        bulldogs.add(new Bulldog());
        bulldogs.add(new Bulldog());
    }
}
