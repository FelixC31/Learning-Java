package com.JavaStream;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalExMain {


    static List<Animal> animal = getAnimals();
    private static List<Animal> dog;

    public static void main(String[] args) {

        show();
    }

    public static void show(){
        System.out.println("Animal List: ");
        animal.forEach(System.out::println);

        System.out.println();

        System.out.println("Dog List: ");
        getDogList().forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted Dog List: ");
        System.out.println(getSortedDogList());

        System.out.println();

        System.out.println("The oldest animal from the list: ");
        System.out.println(getOldestAnimal());

        System.out.println();

        System.out.println("The youngest animal from the list: ");
        System.out.println(getYoungestAnimal());

        System.out.println();

        System.out.println("Group the animal list by type of the animal: ");
        getGroupedAnimals().forEach(System.out::println);

        System.out.println();

        System.out.println("How many animals foreach type are: ");
        System.out.println(getCountAnimals());
    }



    public static List<Animal> getDogList() {
        // filter Animal list by dog type
        List<Animal>dog = animal.stream()
                .filter(animal1 -> animal1.getType().equals("dog"))
                .collect(Collectors.toList());
        return dog;



    }


    private static List<Animal> getSortedDogList(){

        // sort Dog list by age
        var dogList = getDogList();
        List<Animal> sortedDogList = dogList.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());
        return sortedDogList;
    }

    private static Optional<Animal> getOldestAnimal(){

        // find the oldest animal
        Optional<Animal> oldestAnimal = animal.stream()
                .max(Comparator.comparing(Animal::getAge));
        return oldestAnimal;
    }

    private static Optional<Animal> getYoungestAnimal(){

        // find the youngest animal
        Optional<Animal> youngestAnimal = animal.stream()
                .min(Comparator.comparing(Animal::getAge));
        return youngestAnimal;
    }

    private static Set<Map.Entry<String, List<Animal>>> getGroupedAnimals(){

        // group animals by type
        Set<Map.Entry<String, List<Animal>>> typesOfAnimals = animal.stream()
                .collect(Collectors.groupingBy(Animal::getType))
                .entrySet();
        return typesOfAnimals;
    }

    private static Map<String, Long> getCountAnimals(){
        // count animas/type
        Map<String, Long> countType = animal.stream()
                .collect(Collectors.groupingBy(Animal::getType, Collectors.counting()));
        return countType;


    }
    private static List<Animal> getAnimals(){
        return List.of(
                new Animal("Bob","white",3,"dog"),
                new Animal("Maya","yellow",7,"cat"),
                new Animal("Jack","red",5,"cat"),
                new Animal("Rock","blue",3,"cat"),
                new Animal("Ella","black",2,"dog"),
                new Animal("Rocky","white",9,"dog"),
                new Animal("Edd","red",16,"hippo"),
                new Animal("Mikey","black",1,"mouse"),
                new Animal("John","white",20,"hippo")
        );
    }

}
