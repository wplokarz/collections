package org.example;

import java.util.Set;


public class SetProblem {
    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;

        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Set<User> users = new LimitedSet<>();
        users.add(new User("Max", 27));
        users.add(new User("Veronika", 20));
        users.add(new User("Denis", 30));
        users.add(new User("Max", 27));

    }
}