package case_study_furama_resort.models;

public class Booking {
    private int bookingCode;
    private String startDate;
    private String endDate;
    private int customerCode;
    private int serviceCode;

    public Booking() {
    }

    public Booking(int bookingCode, String startDate,
                   String endDate, int customerCode, int serviceCode) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",
                bookingCode,startDate,endDate,customerCode,serviceCode);
    }
}
