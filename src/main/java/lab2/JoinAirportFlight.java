package lab2;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;

public class JoinAirportFlight {
    public static void main(String args[]) throws Exception {
        Job job = Job.getInstance();
        job.setJarByClass(JoinAirportFlight.class);
        job.setJobName("JoinAirportFlight");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, MapperAirport.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, MapperFlight.class);
    }
}
