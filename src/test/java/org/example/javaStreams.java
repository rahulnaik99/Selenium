package org.example;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;


public class javaStreams {
    @Test
    public void str() {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Rahul");
        name.add("Abhi");
        name.add("abhishek");
        name.add("adam");

        long c = name.stream().filter(s->s.startsWith("a")).count();
         //name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
         name.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s));
        System.out.println(c);

        System.out.println(
                Stream.of("Rahul","ram","abhi","haree").filter(s->s.startsWith("r")).count()
        );

    }
}
