package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
//import java.util.Optional;

public class MapperFlight extends Mapper<LongWritable, Text, AirportID, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        FlightParser flightParser = new FlightParser(value.toString());
        String airportId = flightParser.getDelayIdAirport();
        String delay = flightParser.getDelay();
//        Optional<String> airportId = flightParser.getDelayIdAirport();
//        Optional<String> delay = flightParser.getDelay();
        //context.write(new AirportID(airportId.get(),1), new Text(delay.get().toString()));
        context.write(new AirportID(airportId,1), new Text(delay));
    }
}
