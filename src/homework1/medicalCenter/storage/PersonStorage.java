//package homework1.medicalCenter.storage;
//
//import homework1.medicalCenter.exception.PersonNotFoundException;
//import homework1.medicalCenter.model.Doctor;
//import homework1.medicalCenter.model.Patient;
//import homework1.medicalCenter.model.Person;
//
//public class PersonStorage {
//    private Person[] people = new Person[10];
//    private int size;
//
//
//    public void add(Person person) {
//        if (size == this.people.length) {
//            extand();
//        }
//        people[size++] = person;
//    }
//
//    public void printDoctors() {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Doctor) {
//                System.out.println(people[i]);
//            }
//        }
//    }
//
//    public void printPatients() {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Patient) {
//                System.out.println(people[i]);
//            }
//        }
//    }
//
//    public Person searchDoctorByProfession(String profession) throws PersonNotFoundException {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Doctor doctor) {
//                if (doctor.getProfession().equals(profession)) {
//                    return doctor;
//                }
//            }
//        }
//        throw new PersonNotFoundException("Doctor with profession " + profession + " does not found");
//    }
//
//    public void deleteDocById(String doctorId) {
//        for (int i = 0; i < size; i++) {
//            Person person = people[i];
//            if (person.getId().equals(doctorId) && person instanceof Doctor) {
//                getDocIndex(i);
//            }
//        }
//    }
//
//    public Doctor getDocID(String doctorId)  {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Doctor doctor && doctor.getId().equals(doctorId)) {
//
//                return doctor;
//            }
//        }
//        return  null;
//    }
//
//    private void getDocIndex(int i) {
//        for (int j = i; j < size; j++) {
//            people[j] = people[j + 1];
//        }
//        size--;
//    }
//
//
//    public void printPatientByDoctor(Doctor doctorId) {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Patient patient) {
//                if (patient.getDoctor().equals(doctorId)) {
//                    System.out.println(patient);
//                }
//            }
//        }
//    }
//
//    public Doctor searchForDelete(Doctor doctorId) {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Patient patient) {
//                if (patient.getDoctor().equals(doctorId)) {
//                    return patient.getDoctor();
//                }
//            }
//
//        }
//        return null;
//    }
//
//    public void deletePatById(Doctor doctor) {
//        searchForDelete(doctor);
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Patient patient &&
//                    patient.getDoctor().equals(searchForDelete(doctor))) {
//                people[i] = people[i + 1];
//            }
//        }
//        size--;
//    }
//
//    private int getPatIndex(String patientId) {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Patient) {
//                if (people[i].getId().equals(patientId)) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public Patient getPatID(String patientId) throws PersonNotFoundException {
//        for (int i = 0; i < size; i++) {
//            if (people[i] instanceof Patient patient) {
//                if (patient.getId().equals(patientId)) {
//                  throw  new PersonNotFoundException("Patient with id " + patientId +
//                          " is already exists!!!");
//                }
//            }
//
//        }
//        return null;
//    }
//
//    private void extand() {
//        Person[] temp = new Person[people.length + 10];
//        System.arraycopy(people, 0, temp, 0, people.length);
//        people = temp;
//    }
//
//}
