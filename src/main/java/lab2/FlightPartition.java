package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class FlightPartition extends Partitioner<AirportID, Text> {
    public FlightPartition() { }

    public int getPartition(AirportID key, Text value, int numReduceTasks) {
        return ((key.getValueAirportId().hashCode() & Integer.MAX_VALUE)) % numReduceTasks;
    }
}