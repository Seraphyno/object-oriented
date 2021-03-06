package com.sda.principles.encapsulation;

public class Person {
    /* toate proprietatile specifice unui obiect,
       toate comportamentele specifice acelui obiect
       vor fi regasite in clasa sa
     */
    private String name;
    private String cnp;
    private int age;
    private boolean major;

    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Incorrect value!");
        } else {
            this.age = age;
        }
    }
    /*
        metoda specifica unei persoane
     */
    public void growOlder() {
        this.age++;
    }
}
