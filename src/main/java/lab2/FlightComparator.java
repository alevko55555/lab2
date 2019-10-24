package lab2;

import org.apache.hadoop.io.WritableComparator;

public class FlightComparator  extends WritableComparator {
    public FlightComparator() {
        super (AirportID.class) ;
    }
}
