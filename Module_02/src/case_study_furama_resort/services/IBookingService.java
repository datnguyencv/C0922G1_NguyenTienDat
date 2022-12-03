package case_study_furama_resort.services;

import case_study_furama_resort.models.Booking;

public interface IBookingService {
    void addBooking();

    void displayBooking();

    void createContract();

    void displayContract();

    void editContract();

    Booking getInfoBooking();

    String getBookingCode();
}
