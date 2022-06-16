package com.company;

public class Main {

    public static void main(String[] args) {
    boolean result = Validator.check("kjnшjkkm", "j_", "j_");
    if (result) {
        System.out.println("Все корректно");
        } else{
        System.out.println("Логин или пароль не совпадают");
        }
    }
}
