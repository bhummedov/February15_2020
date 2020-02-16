public class Assignment4 {
    public static void main(String[] args) {
        int number=2;
        for (int i = 1; i < 4; i++ ) {
            for (int j = 1; j < 6; j++) {
                System.out.print(number + "\t");
                number+=2;
            }
            System.out.println();
        }
    }
}

