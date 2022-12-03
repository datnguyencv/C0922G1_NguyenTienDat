package case_study_furama_resort.models;

public class Contract {
    private int contractCode;
    private int bookingCode;
    private double deposit;
    private double totalPayment;
    private int customerCode;

    public Contract(int contractCode, int bookingCode, double deposit, double totalPayment, int customerCode) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public int getContractCode() {
        return contractCode;
    }

    public void setContractCode(int contractCode) {
        this.contractCode = contractCode;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }

    public String getInfo() {
        return String.format("%s,%s,%f,%f,%s", getContractCode(), getBookingCode(), getDeposit(), getTotalPayment(), getCustomerCode());
    }
}
