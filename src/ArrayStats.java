public class ArrayStats {

    public static int getMax(int[] numbers) {
        int max = numbers[0];

        for (int n : numbers) {
            if (n > max)
                max = n;
        }

        return max;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
        }
        return min;
    }

}
