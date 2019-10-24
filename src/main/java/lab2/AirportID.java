package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Partitioner;

import java.awt.datatransfer.DataFlavor;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportID implements WritableComparable<AirportID> {
    private LongWritable value;
    private IntWritable id;

    public AirportID() {
        value = new LongWritable();
        id = new IntWritable();
    }

    public AirportID(long value, int id) {
        this.value = new LongWritable(value);
        this.id = new IntWritable(id);
    }

    @Override
    public int compareTo(AirportID airportID) {
        int compID = value.compareTo(airportID.value);
        if(compID == 0) {
            return id.compareTo(airportID.id);
        }
        return compID;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        value.write(dataOutput);
        id.write(dataOutput);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        value.readFields(dataInput);
        id.readFields(dataInput);
    }
}