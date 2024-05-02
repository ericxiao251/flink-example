package quickstart;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
// import org.apache.flink.streaming.api.datastream.DataStream;

public class DataStreamJob {

	public static void main(String[] args) throws Exception {
		// Sets up the execution environment, which is the main entry point
		// to building Flink applications.
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // DataStream<String> inputStream = env.fromElements(
        //         "5"
        //         ,"6"
        //         ,"7"
        //         ,"8"
        //         ,"9"
        // );
        // inputStream.print();

 		env.fromElements(
                "5"
                ,"6"
                ,"7"
                ,"8"
                ,"9"
        ).print();
        // inputStream.print()

		env.execute();
	}
}
