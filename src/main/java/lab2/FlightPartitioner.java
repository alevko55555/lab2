package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class FlightPartitioner extends Partitioner<AirportID, Text> {
    public FlightPartitioner() { }

    public int getPartition(AirportID key, Text value, int numReduceTasks) {
        return ((key.value.hashCode() & Integer.MAX_VALUE)) % numReduceTasks;
    }
}