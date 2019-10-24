package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MapperAirport extends Mapper<LongWritable, Text, AirportID, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() == 0) {
            return;
        }
        AirportParser airportParser = new AirportParser(value.toString());
        context.write(new AirportID(airportParser.getIdAirport(), 0), new Text(airportParser.getInfoAirport()));
    }
}
