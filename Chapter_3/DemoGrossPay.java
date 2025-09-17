public class DemoGrossPay {
    public static void main(String[] args) {
        showGrossPay();
    }
    public static void showGrossPay() {
        double rate = 22.75;
        displayGrossPay(10.0, rate);
        displayGrossPay(25.0, rate);
        displayGrossPay(37.5, rate);
    }
    public static void displayGrossPay(double hours, double rate) {
        System.out.println(hours + " hours at $" + rate + " per hour is $" + calculateGross(hours, rate));
    }
    public static double calculateGross(double hours, double rate) {
        return hours * rate;
    }
}
