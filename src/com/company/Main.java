package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String text = "W  Szczebrzeszynie chrząszcz brzim w trzcinie i Szczebrzeszyn z tego słynie";


        if (text.matches("(.*)\\s{2}(.*)")){
        System.out.println("Napis ma dwie spacje");

        text = text.replaceAll("\\s{2,}", " ");
        text = text.replaceAll("(\\s?)i Szczebrzeszyn", "\n\ri Szczebreszyn");
        System.out.println(text);

        String [] split = text.split(" ");
        System.out.println(Arrays.toString(split));
        }


    }
}
