package com.company;

import java.util.Objects;

public class Validator {
    private static final String validSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFHHIJKLMNOPRSTUVWXYZ0123456789_";
    private Validator(){
    }

    public static boolean check(String login,
                                String password,
                                String confirmPassword){
        try {
           validate(login, password, confirmPassword);
           return true;
        }
        catch (WrongPasswordException | WrongLoginException e){
            System.out.println(e.getMessage());
                return false;
        }
    }

    private static void validate(String login,
                                 String password,
                                 String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (Objects.isNull(login) || login.length() >= 20) {
            throw new WrongLoginException("Длина логина должна быть меньше 20 символов");
        }
        if (!validSymbolsPass(login)){
            throw  new WrongLoginException("Логин содержит некорректные символы");
        }
        if (Objects.isNull(password) || password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов");
        }
        if(!validSymbolsPass(password)){
            throw new WrongPasswordException("Пароль содержит некорректные символы");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
    private static boolean validSymbolsPass(String s){
        char[] symbols = s.toCharArray();
        for (char symbol : symbols){
            if (!validSymbols.contains(String.valueOf(symbol))) {
                return false;
            }
        }
        return true;
    }
}


