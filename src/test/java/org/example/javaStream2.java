package org.example;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javaStream2 {
    @Test
    public void maps(){

        ArrayList<String> name = new ArrayList<String>();
        name.add("Rahul");
        name.add("Abhi");
        name.add("abhishek");
        name.add("adam");

        //array to array list
        List<String> name2 = Arrays.asList("rahul","rzhulnaik","radhulmohan","radhul mohannaik");
        //uppercase
        Stream.of("rahu","rahulnaik","rahulmohan","rahul mohannaik").
                filter(s->s.endsWith("k"))
                .map(s->s.toUpperCase()).
                forEach(s-> System.out.println(s));

        //sort
        Stream.of("rahu","rahulnaik","rahulmohan","rahul mohannaik").
                filter(s->s.startsWith("r")).
                sorted().forEach(s-> System.out.println(s));

       //sort
        name.stream().filter(s->s.startsWith("r")).sorted().forEach(
                s-> System.out.println(s)
        );


        //mergearraylist
        Stream<String> merged = Stream.concat(name.stream(),name2.stream());
        //merged.forEach(s-> System.out.println(s));

        //booleanMethod to search
        boolean flag = merged.anyMatch(s->s.startsWith("r"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }
    @Test
    public void collect(){
        //array to array list
        List<String> name2 = Arrays.asList("rahul","rzhulnaik","radhulmohan","radhul mohannaik");
        //uppercase
      List<String> ls =  Stream.of("rahu","rahulnaik","rahulmohan","rahul mohannaik").
                filter(s->s.endsWith("k"))
                .map(s->s.toUpperCase()).
                collect(Collectors.toList());
        System.out.println(ls.get(0));
    }
    //unique sorted orderc
    @Test
    public void unique(){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,8,6,7,1,2,4,5);
        ls.stream().distinct().sorted().forEach(s-> System.out.println(s));

    }


}
