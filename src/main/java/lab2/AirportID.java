package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Partitioner;

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

    public class HashPartitioner<> extends Partitioner<>{
        public int getPartition(key, value, int numReduceTasks) {
            
        }
    }
}
