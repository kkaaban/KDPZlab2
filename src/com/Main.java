package com;

public class Main {

    public static void main(String[] args) {
        Password password = new Password("12345");
        Account account = new Account("aaa@gmail.com", password, 15);
        System.out.println(account.getPASSWORD().getPassword());
        password.setPassword("00000");
        System.out.println(account.getPASSWORD().getPassword());
    }
}
