package ru.mike.dz10;

import java.util.Iterator;

//Класс контейнер с итератором для списка объектов
public class Company implements Iterable<Employee> {
    private Employee[] employees = new Employee[0];
    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new ArrayIterator<Employee>(employees);
    }
}
