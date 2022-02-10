package com.bnta.usingClasses.exercise5;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Person {

        private int id;
        private String firstName;
        private String surname;
        private String email;

        public Person(String firstName, String surname, String email) {
                this.firstName = firstName;
                this.surname = surname;
                this.email = email;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, firstName, surname, email);
        }

        @Override
        public String toString() {
                return "Person{" +
                        "id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", surname='" + surname + '\'' +
                        ", email='" + email + '\'' +
                        '}' + "\n";
        }
}