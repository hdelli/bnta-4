package com.bnta.conditionals;

public class Exercise9 {
    public static void main(String[] args) {

        //count how many strings/ints in a array and return number

        String[] pokemonCards = {"Pikachu", "Manki", "Clairefury", "Machop", "Childminder", null, null};

        int counter = 0;
        for (int i = 0; i < pokemonCards.length; i++) {
            if (pokemonCards[i] != null) {
                counter++;
            }
        }
        System.out.println("there are " + counter);
    }
}