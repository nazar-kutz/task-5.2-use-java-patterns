package task_3.entity;

import com.sun.xml.internal.ws.util.Pool;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Tour {
    private Transfer tranfserToAirport;
    private Transfer tranfserFromAirport;
    private Flight tourFlight;
    private Bocking hotelBocking;
    private boolean insurance;

    public Tour(Transfer tranfserToAirport, Transfer tranfserFromAirport, Flight tourFlight, Bocking hotelBocking, boolean insurance) {
        this.tranfserToAirport = tranfserToAirport;
        this.tranfserFromAirport = tranfserFromAirport;
        this.tourFlight = tourFlight;
        this.hotelBocking = hotelBocking;
        this.insurance = insurance;
    }

    public static TourBuilder getNewTourBuilder(){
        return new TourBuilder();
    }

    public static class TourBuilder{
        private Transfer tranfserToAirport;
        private Transfer tranfserFromAirport;
        private Flight tourFlight;
        private Bocking hotelBocking;
        private boolean insurance = false;

        private TourBuilder() {
        }

        public TourBuilder buildTransferToAirport(Transfer trasfer){
            this.tranfserToAirport = trasfer;
            return this;
        }

        public TourBuilder buildTransferFromAirport(Transfer trasfer){
            this.tranfserFromAirport = trasfer;
            return this;
        }

        public TourBuilder buildFlight(Flight tourFlight){
            this.tourFlight = tourFlight;
            return this;
        }

        public TourBuilder buildBocking(Bocking hotelBocking){
            this.hotelBocking = hotelBocking;
            return this;
        }

        public TourBuilder buildInsurance(){
            this.insurance = true;
            return this;
        }

        public Tour build(){
            return new Tour(tranfserToAirport, tranfserToAirport, tourFlight, hotelBocking, insurance);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TOUR" + '\n');
        if(tranfserToAirport != null){
            stringBuilder.append(tranfserToAirport.toString());
        }
        if(tranfserFromAirport != null){
            stringBuilder.append(tranfserFromAirport.toString());
        }
        if(tourFlight != null){
            stringBuilder.append(tourFlight.toString());
        }
        if(hotelBocking != null){
            stringBuilder.append(hotelBocking.toString());
        }
        if(insurance == true){
            stringBuilder.append("include insurance");
        }
        return stringBuilder.toString();
    }
}
