import java.util.Scanner;
public class Assignment2_Do {
        public static void main(String[] args) {
            int month = 1;
            int day;
            do {
                day=1;
                do {
                    System.out.println(month + "/" + day + "/" + "2020");
                    day++;
                }
                while (day < 31);
                month++;
            }
            while (month < 13);
        }
}
