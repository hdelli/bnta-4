package com.bnta.testing;

import com.github.javafaker.Faker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.gameOfThrones().dragon());
    }
}
