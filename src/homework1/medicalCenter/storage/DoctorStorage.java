package homework1.medicalCenter.storage;

import homework1.medicalCenter.model.Doctor;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size;


    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extand();
        }
        doctors[size++] = doctor;
    }

    public Doctor searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
              return doctors[i];
            }
        }
        return null;
    }

    public void deleteDocById(String doctorId) {
        int index = getDocIndex(doctorId);
        if (index == -1) {
            System.out.println("Wrong ID! Try again!");

            return;
        }
        for (int i = index + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }


    private int getDocIndex(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return i;
            }
        }
        return -1;
    }

    public Doctor getDocID(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    private void extand() {
        Doctor[] temp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, temp, 0, doctors.length);
        doctors = temp;
    }
}
