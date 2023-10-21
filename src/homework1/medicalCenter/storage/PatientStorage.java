package homework1.medicalCenter.storage;

import homework1.medicalCenter.model.Doctor;
import homework1.medicalCenter.model.Patient;

import java.util.Date;

public class PatientStorage {

    private Patient[] patients = new Patient[10];
    private int size;


    public void add(Patient patient) {
        if (size == patients.length) {
            extand();
        }
        patients[size++] = patient;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public void printByDoctor(Doctor doctorId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctorId)) {
                System.out.println(patients[i]);
            }
        }
    }

    public Doctor searchForDelete(Doctor doctorId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctorId)) {
                return patients[i].getDoctor();
            }
        }
        return null;
    }

    public void deletePatById(Doctor doctor) {
        searchForDelete(doctor);
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(searchForDelete(doctor))){
                patients[i] = patients[i+1];
            }
        }
        size--;
        }



    private int getPatIndex(String patientId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(patientId)) {
                return i;
            }
        }
        return -1;
    }

    public Patient getPatID(String patientId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(patientId)) {
                return patients[i];
            }
        }
        return null;
    }


    private void extand() {
        Patient[] temp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, temp, 0, patients.length);
        patients = temp;
    }


    }


