import java.util.Scanner;
public class Assignment2_while {
    public static void main(String[] args){
        int month=1;
        int day;
        while(month<13){
            day=1;
            while(day<31){
                System.out.println(month+"/"+day+"/"+"2020");
                day++;
            }
            month++;
        }
    }
}
