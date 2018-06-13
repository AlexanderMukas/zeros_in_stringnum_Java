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

/*

# JMH version: 1.21
# VM version: JDK 1.8.0_172-ea, Java HotSpot(TM) 64-Bit Server VM, 25.172-b03
# VM invoker: D:\dev\jdk\jdk-8u172\jre\bin\java.exe
# VM options: -javaagent:D:\dev\apps\idea-18.2\lib\idea_rt.jar=59653:D:\dev\apps\idea-18.2\bin -Dfile.encoding=UTF-8
# Warmup: 3 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: perf.ZeroCalcPerf.calculating

Benchmark                                     Mode  Cnt   Score    Error   Units
ZeroCalcPerf.calculating                      avgt    5  20.325 ±  0.104   ns/op
ZeroCalcPerf.calculating:·gc.alloc.rate       avgt    5  ≈ 10⁻⁴           MB/sec
ZeroCalcPerf.calculating:·gc.alloc.rate.norm  avgt    5  ≈ 10⁻⁵             B/op
ZeroCalcPerf.calculating:·gc.count            avgt    5     ≈ 0           counts

 */
