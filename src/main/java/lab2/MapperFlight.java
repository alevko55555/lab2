package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MapperFlight extends Mapper<LongWritable, Text, AirportID, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        FlightParser flightParser = new FlightParser(value.toString());
        String airportId = flightParser.getDelayIdAirport();
        String delay = flightParser.getDelay();
        if ((long)Double.parseDouble(delay) != 0) {
            context.write(new AirportID(Long.parseLong(airportId),1), new Text(delay));
        }
    }
}
