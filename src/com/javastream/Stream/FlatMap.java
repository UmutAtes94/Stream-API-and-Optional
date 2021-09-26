package com.javastream.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    /* Elimizde 2 boyutlu liste var (NESTED LİST)
    Örnek:
        {
           {A, B, C}
           {D, E, F}
        }
     */

    //Nested list'e ait değerleri al => stream()
    // her bir elemani bir listeye ekle => flatMap()
    //flatMap(): birden fazla kaynağı(stream) tek bir kaynak haline getirmek için kullanılır
    // iç içe geçmiş listeyi tek bir liste haline getirmek için Collection::Stream kullanacagız.
    // => {A, B, C, D, E, F}
    public static List<String> transformWithFor(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }


    //STREAM
    public static List<String> transformWithStream (List<List<String>> collection){
        List<String> newCollection = new ArrayList<>();
        return collection.stream()
                .flatMap(Collection::stream) //Stream<Stream<String>> => Stream<String>
                .collect(Collectors.toList());// Stream<String> => List<String>
    }


}
