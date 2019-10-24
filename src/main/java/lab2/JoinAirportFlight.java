package lab2;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class JoinAirportFlight {
    public static void main(String args[]) throws Exception {
        Job job = Job.getInstance();
        job.setJarByClass(JoinAirportFlight.class);
        job.setJobName("JoinAirportFlight");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, MapperAirport.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, MapperFlight.class);

        FileOutputFormat.setOutputPath(job, new Path(args[2]));
        //job.setPartitionerClass(AirportID.FirstPartitioner.class);
        //job.setGroupingComparatorClass(AirportID.FirstComparator.class);
        job.setReducerClass(JoinReducer.class);
        job.setMapOutputKeyClass(AirportID.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        job.setNumReduceTasks(2);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
