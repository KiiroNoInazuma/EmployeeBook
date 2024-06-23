package org.example;

import org.example.model.Employee;

public class Launcher {
    public static EmployeeBook employeeBook = new EmployeeBook();


    public static void main(String[] args) {
        listEmp();
        employeeBook.changeSalaryOrDepartment("Романов Евгений Александрович", "500");
        employeeBook.printAllEmp();
    }

    private static void listEmp() {
        Employee emp1 = new Employee("Романов Евгений Александрович", "1", 180_000);
        Employee emp2 = new Employee("Першин Евгений Владиславович", "1", 300_000);
        Employee emp3 = new Employee("Герасимов Петр Сергеевич", "3", 150_000);
        Employee emp4 = new Employee("Галяутдинов Марат Рашитович", "2", 270_000);
        Employee emp5 = new Employee("Матросов Григорий Иванович", "2", 570_000);
        Employee emp6 = new Employee("Мяэ Михаил Александрович", "4", 370_000);
        Employee emp7 = new Employee("Костылев Александр Александрович", "4", 370_000);
        Employee emp8 = new Employee("Прокопьева Софья Леонидовна", "3", 130_000);

        employeeBook.addEmployee(emp1);
        employeeBook.addEmployee(emp2);
        employeeBook.addEmployee(emp3);
        employeeBook.addEmployee(emp4);
        employeeBook.addEmployee(emp5);
        employeeBook.addEmployee(emp6);
        employeeBook.addEmployee(emp7);
        employeeBook.addEmployee(emp8);


        employeeBook.distinct();
    }

}