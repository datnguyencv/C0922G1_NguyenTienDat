package case_study_furama_resort.services.impl.facility;

import case_study_furama_resort.models.Booking;
import case_study_furama_resort.services.IBookingService;

import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BookingServiceImpl implements IBookingService {
    public static final String BOOKING_LIST_CSV = "src/case_study_furama_resort/data_libs/booking.csv";
    private static final Scanner scanner = new Scanner(System.in);
    public static Queue<Booking> bookingQueue = new PriorityQueue<>();
    LinkedHashMap<String, Integer> serviceUse = new LinkedHashMap<>();
    @Override
    public void addBooking() {

    }

    @Override
    public void displayBooking() {

    }

}
