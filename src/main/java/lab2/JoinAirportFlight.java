package lab2;

import org.apache.hadoop.mapreduce.Job;

public class JoinAirportFlight {
    public static void main(String args[]) throws Exception {
        Job job = Job.getInstance();
        job.setJarByClass(JoinAirportFlight.class);
        job.setJobName("JoinAirportFlight");
    }
}
