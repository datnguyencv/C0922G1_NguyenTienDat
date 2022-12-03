package case_study_furama_resort.models.person;

public abstract class Person {
    int iD;
    String name;
    String dateOfBirth;
    String gender;
    int numberIdentity;
    int numberPhone;
    String email;

    public Person(int id, String name,
                  String dateOfBirth, String gender,
                  int numberIdentity, int numberPhone,
                  String email) {
        this.iD = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.numberIdentity = numberIdentity;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public int getId() {
        return iD;
    }

    public void setId(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberIdentity() {
        return numberIdentity;
    }

    public void setNumberIdentity(int numberIdentity) {
        this.numberIdentity = numberIdentity;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String toÌno();

    @Override
    public String toString() {
        return String.format("%s=%s=%s=%s=%s=%s=%s",
                iD, name, dateOfBirth, gender,
                numberIdentity, numberPhone, email);

    }
}
