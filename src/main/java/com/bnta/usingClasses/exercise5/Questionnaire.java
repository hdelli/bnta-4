package com.bnta.usingClasses.exercise5;

import java.util.Arrays;
import java.util.Objects;

public class Questionnaire {

    private Person person;
    private int iD;
    private String[] questions;


    public Questionnaire() {
        this.person = person;
        this.iD = iD;
        this.questions = questions;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questionnaire that = (Questionnaire) o;
        return iD == that.iD && Objects.equals(person, that.person) && Arrays.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(person, iD);
        result = 31 * result + Arrays.hashCode(questions);
        return result;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "person=" + person +
                ", iD=" + iD +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}