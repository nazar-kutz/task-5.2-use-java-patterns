package task_3.entity;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Bocking {
    private String hotelName;
    private String checkInTime;
    private String checkOutTime;

    public Bocking(String hotelName, String checkInTime, String checkOutTime) {
        this.hotelName = hotelName;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public String toString() {
        return "BOOKING\n" +
                "Name of hotel: " + hotelName + '\n' +
                "check in time: " + checkInTime + '\n' +
                "check out time: " + checkOutTime + '\n';
    }
}
