//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int grade = 8;
            String[] rates = {"Wrong Grade" , "Failed", "Passed", "Good", "Very Good", " Excellent"};
            if (grade < 0 || grade > 100) {
                System.out.println(rates[0]);
            } else if (grade >= 90 && grade <= 100) {
                System.out.println(rates[5]);
            } else if (grade >= 80) {
                System.out.println(rates[4]);
            } else if (grade >= 70) {
                System.out.println(rates[3]);
            } else if (grade >= 60) {
                System.out.println(rates[2]);
            } else if (grade < 60) {
                System.out.println(rates[1]);
            }
    }
}