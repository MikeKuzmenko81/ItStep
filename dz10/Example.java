package ru.mike.dz10;

public class Example {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = {
                new Employee("John", 23),
                new Employee("Tom", 32),
                new Employee("Mike", 38),
                new Employee("Anna", 35),
                new Employee("Ivan", 28),
                new Employee("Vlad", 25),
                new Employee("Gleb", 30),
                new Employee("Leo", 40),
                new Employee("Alex", 34),
                new Employee("Kiril", 29),
        };
        //Заполняем список объектами
        company.setEmployees(employees);

        //Перебираем объекты в контейнере с помощью итератора
        for (Employee emp: company) {
            System.out.println(emp);
        }
    }
}
