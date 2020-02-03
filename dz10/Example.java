package ru.mike.dz10;

public class Example {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = {new Employee("John", 23), new Employee("Tom", 32), new Employee("Mike", 35)};
        company.setEmployees(employees);

        for (Employee emp: company) {
            System.out.println(emp);
        }
    }
}
