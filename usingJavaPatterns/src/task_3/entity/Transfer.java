package task_3.entity;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Transfer {
    String fromLocation;
    String toLocation;

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getToLocation() {

        return toLocation;
    }

    String dateAndTime;

    public Transfer(String fromLocation, String toLocation, String dateAndTime) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.dateAndTime = dateAndTime;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "TRANSFER\n" +
                "from: " + fromLocation + '\n' +
                "to: " + toLocation + '\n' +
                "date and time: " + dateAndTime + '\n';
    }
}
