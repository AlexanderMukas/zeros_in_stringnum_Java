package perf;

import com.alexander.Zeros;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Measurement(iterations = 5, time= 1)
@Warmup(iterations = 3, time= 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(1)
@State(Scope.Thread)
public class ZeroCalcPerf {

    private Zeros zeros;
    private char[] input;

    @Setup
    public void init() {
        zeros = new Zeros();
        input = "11110000001010101001010110101010".toCharArray();

    }

    @Benchmark
    public void calculating() {
        zeros.calculating(input);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ZeroCalcPerf.class.getSimpleName())
                .forks(1)
                .addProfiler(GCProfiler.class)
                .build();

        new Runner(opt).run();
    }

}