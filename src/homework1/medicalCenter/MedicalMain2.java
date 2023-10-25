package homework1.medicalCenter;

import homework1.medicalCenter.exception.PersonNotFoundException;
import homework1.medicalCenter.model.Doctor;
import homework1.medicalCenter.model.Patient;

import homework1.medicalCenter.storage.PersonStorage;
import homework1.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalMain2 implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personFromStorage = new PersonStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printAllCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    personFromStorage.printPatients();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
            }
        }

    }

    private static void printPatientsByDoctor() {
        personFromStorage.printDoctors();
        System.out.println("Please choose the ID of the doctor for print doctors patient");
        String doctorId = scanner.nextLine();
        personFromStorage.getDocID(doctorId);
        Doctor doctor = personFromStorage.getDocID(doctorId);
        if (doctor == null) {
            System.out.println("Wrong ID,please try again!");
            return;
        }
        personFromStorage.printPatientByDoctor(doctor);
    }

    private static void addPatient() {
        personFromStorage.printDoctors();
        System.out.println("Please choose the ID of the doctor for add patient");
        String doctorId = scanner.nextLine();
        personFromStorage.getDocID(doctorId);
        Doctor doctor = personFromStorage.getDocID(doctorId);
        if (doctor == null) {
            System.out.println("Wrong ID,please try again!");
            return;
        }
        System.out.println("Please input patient id");
        String patientId = scanner.nextLine();
        try {
            personFromStorage.getPatID(patientId);
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Please input patient NAME");
        String name = scanner.nextLine();
        System.out.println("Please input patient SURNAME");
        String surname = scanner.nextLine();
        System.out.println("Please input patient PHONE");
        String phone = scanner.nextLine();
        System.out.println("Please input register date and time (dd-MM-yyyy hh:mm)");
        String registerDateTimeStr = scanner.nextLine();
        Date registerDateTime = null;
        try {
            registerDateTime = DateUtil.stringToDateTime(registerDateTimeStr);
        } catch (ParseException e) {
            System.out.println("date is incorrect!");
            return;
        }

        Patient patient = new Patient(name, surname, phone, patientId, registerDateTime, doctor);
        personFromStorage.add(patient);
        System.out.println("Patient created!");


    }

    private static void changeDoctorById() {
        personFromStorage.printDoctors();
        System.out.println("Please enter the ID of the doctor you want to change");
        String doctorId = scanner.nextLine();
        personFromStorage.getDocID(doctorId);
        Doctor doctor = personFromStorage.getDocID(doctorId);
        if (doctor == null) {
            System.out.println("Wrong ID,please try again!");
            return;
        }


        System.out.println("Please input new NAME");
        String name = scanner.nextLine();
        doctor.setName(name);
        System.out.println("Please input new SURNAME");
        String surname = scanner.nextLine();
        doctor.setSurname(surname);
        System.out.println("Please input new  PHONE");
        String phone = scanner.nextLine();
        doctor.setPhone(phone);
        System.out.println("Please input new EMAIL");
        String email = scanner.nextLine();
        doctor.setEmail(email);
        System.out.println("Please input new PROFESSION");
        String profession = scanner.nextLine();
        doctor.setProfession(profession);
        System.out.println("Doctor changed!");
    }

    private static void deleteDoctorById() {
        personFromStorage.printDoctors();
        System.out.println("Please enter the ID of the doctor you want to delete");
        String id = scanner.nextLine();
        Doctor doctor = personFromStorage.getDocID(id);
        personFromStorage.deleteDocById(id);
        while (personFromStorage.searchForDelete(doctor) != null) {
            personFromStorage.deletePatById(doctor);

        }
        System.out.println("Doctor with patients deleted");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input doctors profession");
        String profession = scanner.nextLine();

        try {
            personFromStorage.searchDoctorByProfession(profession);
            System.out.println(personFromStorage.searchDoctorByProfession(profession));
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addDoctor() {
        System.out.println("Please input doctor ID");
        String id = scanner.nextLine();
        personFromStorage.getDocID(id);
        Doctor doctorId = personFromStorage.getDocID(id);
        if (doctorId != null) {
            System.out.println("Doctor with this ID is already exists");
            return;
        }
        System.out.println("Please input NAME");
        String name = scanner.nextLine();
        System.out.println("Please input SURNAME");
        String surname = scanner.nextLine();
        System.out.println("Please input PHONE");
        String phone = scanner.nextLine();
        System.out.println("Please input EMAIL");
        String email = scanner.nextLine();
        System.out.println("Please input PROFESSION");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(name, surname, phone, id, profession, email);
        personFromStorage.add(doctor);
        System.out.println("Doctor created!");


    }

}
