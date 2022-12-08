package case_study_furama_resort.models.person;

public class Customer extends  Person{
    private String guestType;
    private String address;

    public Customer(String iD, String name, String dateOfBirth,
                    String gender, String numberIdentity, String numberPhone,
                    String email, String guestType, String address) {
        super(iD, name, dateOfBirth, gender, numberIdentity,
                numberPhone, email);
        this.guestType = guestType;
        this.address = address;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return super.toString() + String.format(",%s,%s", guestType, address);
    }
}
