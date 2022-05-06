public class BookingNumber {

    private int bookingNumber;

    public BookingNumber() {
        bookingNumber = 0;
    }

    public int getBookingNumber() {
        bookingNumber++;
        return bookingNumber;
    }
}
