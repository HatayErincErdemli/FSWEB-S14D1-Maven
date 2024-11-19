package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println(getName()+" senior developer starts to working");
    }
}
