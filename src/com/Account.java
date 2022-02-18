package com;

import java.util.Random;

public final class Account implements Cloneable {
    private final String EMAIL;
    private final Password PASSWORD;
    private final int AGE;
    private final int ID;

    Account(String email, Password password, int age){
        EMAIL = email;
        AGE = age;
        Password deepCopy = new Password(password.getPassword());
        PASSWORD = deepCopy;
        ID = new Random().nextInt();
    }
    private Account(String email, Password password, int age, int id){
        EMAIL = email;
        AGE = age;
        Password deepCopy = new Password(password.getPassword());
        PASSWORD = deepCopy;
        ID = id;
    }

    public String getEMAIL(){
        return EMAIL;
    }

    public Password getPASSWORD(){
        Password deepCopy = new Password(PASSWORD.getPassword());
        return deepCopy;
    }

    public int getAGE(){
        return AGE;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        return ID == ((Account) obj).ID; // Проверки по ID достаточно, поскольку он уникален
    }

    @Override
    public int hashCode() {
        return ID;
    }

    @Override
    public Account clone(){
        return new Account(EMAIL, PASSWORD, AGE, ID);
    }

    @Override
    public String toString(){
        return EMAIL;
    }
}
