package lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class FlightComparator  extends WritableComparator {
    public FlightComparator() {
        super (AirportID.class, true) ;
    }
    @Override
    public int compare(WritableComparable o1, WritableComparable o2) {
        
    }
}
