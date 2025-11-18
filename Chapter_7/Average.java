public class Average {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countGreaterThanPreviousAverage(responseTimes));
    }
    public static int countGreaterThanPreviousAverage(int[] responseTimes) {
        int count = 0;
        for (int i = 1; i < responseTimes.length; i++) {
            if (responseTimes[i] > responseTimes[0] / i) {
                count++;
            }
            responseTimes[0] += responseTimes[i];
        }
        return count;
    }
}
