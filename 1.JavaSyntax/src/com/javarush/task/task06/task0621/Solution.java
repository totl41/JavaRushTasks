package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //дедушка
        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName, null, null );

        //бабушка
        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName, null, null);

        //папа
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        //мама
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        //сын
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        //дочь
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private Cat mother;
        private Cat father;
        private String name;

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {

            String parentMother = mother == null ? ", no mother" : ", mother is " + mother.name;
            String parentFather = father == null ? ", no father" : ", father is " + father.name;

            return "The cat's name is " + name + parentMother + parentFather;
        }
    }
}
