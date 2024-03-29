package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
//import java.util.Optional;

public class MapperAirport extends Mapper<LongWritable, Text, AirportID, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        AirportParser airportParser = new AirportParser(value.toString());
        String airportId = airportParser.getIdAirport();
        String airportInfo = airportParser.getInfoAirport();
        context.write(new AirportID(Long.parseLong(airportId), 0), new Text(airportInfo));
    }
}
