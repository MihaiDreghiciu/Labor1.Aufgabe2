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
            if (n < min)
                min = n;
        }

        return min;
    }

    public static int getMaxSum(int[] numbers) {
        int sum = 0;
        int min = getMin(numbers);

        for (int n : numbers)
            sum += n;

        return sum - min;
    }

    public static int getMinSum(int[] numbers) {
        int sum = 0;
        int max = getMax(numbers);

        for (int n : numbers)
            sum += n;

        return sum - max;
    }


}
