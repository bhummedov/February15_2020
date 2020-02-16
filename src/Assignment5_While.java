public class Assignment5_While {
    public static void main(String[] args) {
        //for loop
        int number=1;
        char letter;
        int count;
        while(number<=6){
            count=1;
            letter="a";
            System.out.println(number);
            while(count<5){
                System.out.println("\t"+letter);
                count++;
                letter++;
            }
            System.out.println();
            number++;
        }

    }
}


