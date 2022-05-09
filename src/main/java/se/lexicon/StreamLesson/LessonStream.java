package se.lexicon.StreamLesson;

import se.lexicon.LambdaEx1.Product;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LessonStream {


    public static void main(String[] args) {
      /*  System.out.println("Filter the list which start with M");
        filterInStreams();
        System.out.println("***************************************");
        System.out.println("Uppercase to all the list items");
        mapInStream();
        System.out.println("**************************************");
        System.out.println("Split the charactor using Flatmap");
        flatMapInStream();
*/
        //ex5();
        CollectingStream();
    }

    public static void filterInStreams() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Development");
        departmentList.add("Marketing");
        departmentList.add("Managers");

        //How to filter the list which is staring with letter M using stream.
        departmentList.stream().filter(word -> word.startsWith("M")).forEach(System.out::println);
    }

    public static void mapInStream() {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Development");
        departmentList.add("Marketing");
        departmentList.add("Managers");

        //How to converting data as uppercase use Map Stream.
        departmentList.stream().map(list -> list.toUpperCase()).forEach(System.out::println);
    }

    public static void flatMapInStream() {
        String[] arraysOfWords = {"Supply", "Chain"};

        //How to split all the characters from the list using Flatmap Stream.
        Stream<String> streamOfWords = Arrays.stream(arraysOfWords);
        streamOfWords.map(word -> word.split("")).flatMap(Arrays::stream).forEach(System.out::println);
    }

    public static void ex3() {
        Stream<String> names = Stream.of("Mehrdad", "Ulf", " Simon", "Ulf", "Marcus");
        Optional<String> optional = names.filter(v -> v.equalsIgnoreCase("Ulf")).findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println(" Data not found");
        }

    }

    //Collect examples:-
    public static void ex5() {
        Stream<String> names = Stream.of("Mehrdad", "Ulf", "Simon", "Ulf", "Marcus");
        List<String> result = names.filter(p -> p.equalsIgnoreCase("Ulf")).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    //Collect examples:
    public static void CollectingStream() {
        List<String> names =
                Arrays.asList("apple","LG","Samsung","One plus");

        Set<String> set = names.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

    }

}
