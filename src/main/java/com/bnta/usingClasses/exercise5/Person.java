package com.bnta.usingClasses.exercise5;

import java.util.Date;
import java.util.Objects;

public class Person {
        private String firstName;
        private String surname;
        private String email;
        private Date dob;

        public Person(String firstName, String surname, String email, Date dob) {
                this.firstName = firstName;
                this.surname = surname;
                this.email = email;
                this.dob = dob;
        }

        public Person() {

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

        public Date getDob() {
                return dob;
        }

        public void setDob(Date dob) {
                this.dob = dob;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return Objects.equals(firstName, person.firstName) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email) && Objects.equals(dob, person.dob);
        }

        @Override
        public int hashCode() {
                return Objects.hash(firstName, surname, email, dob);
        }

        @Override
        public String toString() {
                return "Person{" +
                        "firstName='" + firstName + '\'' +
                        ", surname='" + surname + '\'' +
                        ", email='" + email + '\'' +
                        ", dob=" + dob +
                        '}';
        }
}


