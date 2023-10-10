package homework1.eployee;

import java.util.Scanner;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchByEmployeeID(String keyword) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(keyword)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchByCompanyName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(keyword)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void delByID(String keyword2) {
        for (int i = 0; i < size; i++) {
            if (keyword2.equals(employees[i].getEmployeeID())) {
                employees[i] = employees[i + 1];

            }
        }
        size--;
    }


    public Employee changeEmplByID(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employeeId.equals(employees[i].getEmployeeID())) {
                return employees[i];
            }
        }
        return null;
    }


    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }
}
