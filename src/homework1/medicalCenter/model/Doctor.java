package homework1.medicalCenter.model;

public class Doctor extends Person {
    private String profession;
    private String email;

    public Doctor(String name, String surname, String phone, String id, String profession, String email) {
        super(name, surname, phone, id);
        this.profession = profession;
        this.email = email;
    }

    public Doctor() {
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                "profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;

        if (!profession.equals(doctor.profession)) return false;
        return email.equals(doctor.email);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + profession.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}


