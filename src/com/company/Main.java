package com.company;

public class Main {

    public static void main(String[] args) {
    boolean result = Validator.check("abd", "j_jkkbhbjkbjknjkbhvgfhcxfg", "j_");
    if (result) {
        System.out.println("Все корректно");
        } else{
        System.out.println("Что-то не так");
        }
    }
}
