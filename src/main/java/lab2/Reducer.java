package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer.Context;

import java.io.IOException;

public class Reducer extends Reducer<TextPair, Text, Text, Text> {
    @Override
    protected void reduce( TextPair key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

    }
}
