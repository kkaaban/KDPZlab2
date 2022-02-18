package com;

public final class Account {
    private final String EMAIL;
    private final Password PASSWORD;
    private final int AGE;

    Account(String email, Password password, int age){
        EMAIL = email;
        PASSWORD = password;
        AGE = age;
    }

    public String getEMAIL(){
        return EMAIL;
    }

    public Password getPASSWORD(){
        return PASSWORD;
    }

    public int getAGE(){
        return AGE;
    }
}
