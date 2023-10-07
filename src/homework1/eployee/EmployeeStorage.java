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

    public void changeEmplByID(String keyword3) {
        for (int i = 0; i < size; i++) {
            if (keyword3.equals(employees[i].getEmployeeID())) {
                Scanner scanner = new Scanner(System.in);
                boolean run = true;
                while (run) {
                    System.out.println("Please input 0 for RETURN TO MAIN MENU");
                    System.out.println("Please input 1 for CHANGE NAME");
                    System.out.println("Please input 2 for CHANGE SURNAME");
                    System.out.println("Please input 3 for CHANGE EMPLOYEE ID");
                    System.out.println("Please input 4 for CHANGE SALARY");
                    System.out.println("Please input 5 CHANGE COMPANY");
                    System.out.println("Please input 6 for CHANGE POSITION");
                    String option = scanner.nextLine();

                    switch (option) {
                        case "0":
                            System.out.println("Employee CHANGED");
                            run = false;
                            break;
                        case "1":
                            System.out.println("Please input new name");
                            String keyword4 = scanner.nextLine();
                            employees[i].setName(keyword4);
                            break;
                        case "2":
                            System.out.println("Please input new surname");
                            String keyword5 = scanner.nextLine();
                            employees[i].setSurname(keyword5);
                            break;
                        case "3":
                            System.out.println("Please input new employeeID");
                            String keyword6 = scanner.nextLine();
                            employees[i].setEmployeeID(keyword6);
                            break;
                        case "4":
                            System.out.println("Please input new salary");
                            double keyword7 = Double.parseDouble(scanner.nextLine());
                            employees[i].setSalary(keyword7);
                            break;
                        case "5":
                            System.out.println("Please input new company");
                            String keyword8 = scanner.nextLine();
                            employees[i].setCompany(keyword8);
                            break;
                        case "6":
                            System.out.println("Please input new position");
                            String keyword9 = scanner.nextLine();
                            employees[i].setPosition(keyword9);
                            break;
                        default:
                            System.out.println("Invalid command. Try Again! ");
                            break;
                    }
                }
            }
        }
    }

    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }
}
