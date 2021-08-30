package com.example.test;

public class Person {
    private  String name;
    private int age;
    private Address address;

     public Person() {
    name = "Tamim Iqbal";
    age = 35;
    address = new Address();
    address.postCode = 1200;
    address.city = "Dhaka";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
