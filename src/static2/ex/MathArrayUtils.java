package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total = total + value;
        }
        return total;
    }

    static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

    static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (maxValue < value)
                maxValue = value;
        }
        return maxValue;
    }
}
