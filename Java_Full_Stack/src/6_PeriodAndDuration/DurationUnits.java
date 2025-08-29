/*
The difference between Duration units
Find the Duration units' average and subtract it from the max Duration unit using the minus() method.
Note that you need to implement the getMaxMinusAvg() method to return the result of the subtraction but this
doesn't mean that all logic must be there. You can have more methods.

Sample Input 1:
2
3
35
300
300

Sample Output 1:
PT36H40M
 */
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;

class MainExx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Duration> durations = createDurationList(scanner);

        Duration result = getMaxMinusAvg(durations);

        System.out.println(result);
    }

    public static List<Duration> createDurationList(Scanner scanner) {
        ArrayList<Duration> list = new ArrayList<>(5);
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.DAYS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.HOURS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.SECONDS));

        return list;
    }

    public static Duration getMaxMinusAvg(List<Duration> durations) {
        Duration max = getMax(durations); // Call max method
        Duration average = getAverage(durations); // Call average method

        return max.minus(average);
    }

    // Check and return maximum duration from the list of durations
    public static Duration getMax(List<Duration> durations) {
        Duration max = Duration.ZERO;
        for (Duration duration : durations) {
            if (duration.getSeconds() > max.getSeconds()) {
                max = duration;
            }
        }
        return max;
    }

    // Calculate average duration from the list of durations
    public static Duration getAverage(List<Duration> durations) {
        Duration sum = Duration.ZERO; // Set initial sum to zero seconds
        for (Duration duration : durations) {
            sum = sum.plus(duration); // Find sum
        }
        return sum.dividedBy(durations.size()); // Find average
    }
}