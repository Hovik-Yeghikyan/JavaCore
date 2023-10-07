package homework1.eployee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.printAll();
                    System.out.println();
                    break;
                case "3":
                    searchByID();
                    break;
                case "4":
                    searchByCompany();
                    break;
                case "5":
                    deleteByEmployeeID();
                    break;
                case "6":
                    changeEmployeeById();
                    break;

                default:
                    System.out.println("Invalid command. Please try again!");
                    System.out.println();
                    break;
            }

        }
    }

    private static void changeEmployeeById() {
        System.out.println("Please input ID  employee wich you want to change");
        String keyword3 = scanner.nextLine();
        employeeStorage.changeEmplByID(keyword3);
        System.out.println();
    }

    private static void deleteByEmployeeID() {
        System.out.println("Please input employee ID");
        String keyword2 = scanner.nextLine();
        employeeStorage.delByID(keyword2);
        System.out.println("Employee DELETED!");
        System.out.println();
    }

    private static void searchByCompany() {
        System.out.println("Please input company name");
        String keyword1 = scanner.nextLine();
        employeeStorage.searchByCompanyName(keyword1);
        System.out.println();
    }

    private static void searchByID() {
        System.out.println("Please input employeeID");
        String keyword = scanner.nextLine();
        employeeStorage.searchByEmployeeID(keyword);
        System.out.println();


    }

    private static void addEmployee() {
        System.out.println("Please input employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please input  employeeID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input employee salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input  company");
        String company = scanner.nextLine();
        System.out.println("Please input  position");
        String position = scanner.nextLine();
        Employee empl = new Employee(name, surname, employeeID, salary, company, position);
        employeeStorage.add(empl);
        System.out.println("Employee created!");
        System.out.println();
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Please input 5 for DELETE EMPLOYEE BY EMPLOYEE ID");
        System.out.println("Please input 6 for CHANGE EMPLOYEE");
    }
}
