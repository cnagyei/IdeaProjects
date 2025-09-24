import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        int start = 0;

        final int[] counter = {start};

        return () -> {
            int nextNumber = counter[0];
            counter[0]++;
            return nextNumber;
        };
    }
}