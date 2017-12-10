package com.example.stack;

import java.util.LinkedList;

/**
 * Program to demonstrate the animal shelter od dog and cat
 */
public class AnimalShelter {
    private static int shelterSerialId;
    private LinkedList<Animal> dogList = new LinkedList<>();
    private LinkedList<Animal> catList = new LinkedList<>();

    enum AnimalType {
        DOG, CAT
    }

    class Animal {
        private int id;
        private AnimalType animalType;

        public Animal(final int id, final AnimalType animalType) {
            this.id = id;
            this.animalType = animalType;
        }

        public int getId() {
            return id;
        }

        public AnimalType getAnimalType() {
            return animalType;
        }
    }

    public void enQueue(AnimalType animalType) {
        if (animalType.equals(AnimalType.CAT)) {
            catList.addLast(new Animal(++shelterSerialId, animalType));
        } else {
            dogList.addLast(new Animal(++shelterSerialId, animalType));
        }
    }

    public Animal deQueueAny() {
        if (dogList.isEmpty() && catList.isEmpty()) {
            throw new RuntimeException("No animals left in the shelter");
        }
        if (dogList.getFirst().getId() < catList.getFirst().getId()) {
            shelterSerialId--;
            return dogList.removeFirst();
        } else {
            shelterSerialId--;
            return catList.removeFirst();
        }

    }

    public Animal deQueueDog() {
        if (dogList.isEmpty()) {
            throw new RuntimeException("No dogs left in the shelter");
        }
        shelterSerialId--;
        return dogList.removeFirst();
    }

    public Animal deQueueCat() {
        if (catList.isEmpty()) {
            throw new RuntimeException("No dogs left in the shelter");
        }
        shelterSerialId--;
        return catList.removeFirst();
    }

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enQueue(AnimalType.CAT);
        animalShelter.enQueue(AnimalType.DOG);
        animalShelter.enQueue(AnimalType.CAT);
        animalShelter.enQueue(AnimalType.DOG);
        animalShelter.enQueue(AnimalType.CAT);
        animalShelter.enQueue(AnimalType.DOG);
        animalShelter.enQueue(AnimalType.CAT);

        System.out.println("total animals is the shelter: " + animalShelter.shelterSerialId);
        System.out.println("de queue any animal who came first to shelter(should be a cat): " + animalShelter
                .deQueueAny().getAnimalType());
        System.out.println("total animals is the shelter: " + animalShelter.shelterSerialId);
        System.out.println("de queue a cat only from the shelter: " + animalShelter.deQueueCat().getAnimalType());
        System.out.println("de queue a dog only from the shelter: " + animalShelter.deQueueDog().getAnimalType());
        System.out.println("total animals is the shelter: " + animalShelter.shelterSerialId);

    }
}
