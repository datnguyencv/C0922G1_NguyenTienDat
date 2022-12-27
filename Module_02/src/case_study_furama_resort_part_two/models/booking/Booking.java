package case_study_furama_resort_part_two.models.booking;

public class Booking {
    private String bookingID;
    private String startingDate;
    private String endingDate;
    private int customerID;
    private String serviceName;

    public Booking() {
    }

    public Booking(String bookingID, String startingDate, String endingDate, int customerID, String serviceName) {
        this.bookingID = bookingID;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", startingDate='" + startingDate + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", customerID=" + customerID +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
