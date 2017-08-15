package task_3.entity;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Flight {
    private String forthFlightDate;
    private String backFlightDate;

    public Flight(String forthFlightDate, String backFlightDate) {
        this.forthFlightDate = forthFlightDate;
        this.backFlightDate = backFlightDate;
    }

    public Flight(String forthFlightDate) {
        this.forthFlightDate = forthFlightDate;
    }

    public String getForthFlightDate() {
        return forthFlightDate;
    }

    public String getBackFlightDate() {
        return backFlightDate;
    }

    public void setForthFlightDate(String forthFlightDate) {
        this.forthFlightDate = forthFlightDate;
    }

    public void setBackFlightDate(String backFlightDate) {
        this.backFlightDate = backFlightDate;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FLIGHT\n");
        stringBuilder.append("forth flight date: ").append(forthFlightDate).append('\n');
        if(backFlightDate != null){
            stringBuilder.append("back flight date: ").append(backFlightDate).append('\n');
        }
        return stringBuilder.toString();
    }
}
