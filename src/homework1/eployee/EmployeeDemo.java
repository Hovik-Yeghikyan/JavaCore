package homework1.eployee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
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
                    int position = Integer.parseInt(scanner.nextLine());
                    Employee empl = new Employee(name, surname, employeeID, salary, company, position);
                    employeeStorage.add(empl);
                    System.out.println("Employee created!");
                    System.out.println();
                    break;
                case "2":
                    employeeStorage.printAll();
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Please input employeeID");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(keyword);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String keyword1 = scanner.nextLine();
                    employeeStorage.searchByCompanyName(keyword1);
                    System.out.println();

                    break;
                default:
                    System.out.println("Invalid command. Please try again!");
                    System.out.println();
            }

        }
    }
}
