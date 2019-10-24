package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<AirportID, Text, Text, Text> {
    @Override
    protected void reduce( AirportID key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        String characteristic = iter.next().toString();
        if(!iter.hasNext()) {
            return;
        }
        long count = 0;
        long min
    }
}
