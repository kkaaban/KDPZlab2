package com;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("2", new Password("2"), 22);
        Account account1 = account.clone();
        System.out.println(account.hashCode());
        System.out.println(account1.hashCode());

    }
}
