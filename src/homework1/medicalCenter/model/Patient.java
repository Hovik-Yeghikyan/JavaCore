package homework1.medicalCenter.model;

public class Patient extends Person {
    private String registerDateTime;
    private Doctor doctor;

    public Patient(String name, String surname, String phone, String id, String registerDateTime, Doctor doctor) {
        super(name, surname, phone, id);
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Patient() {
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() +
                "registerDateTime='" + registerDateTime + '\'' +
                ", doctor=" + doctor +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patient patient = (Patient) o;

        if (!registerDateTime.equals(patient.registerDateTime)) return false;
        return doctor.equals(patient.doctor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + registerDateTime.hashCode();
        result = 31 * result + doctor.hashCode();
        return result;
    }
}
