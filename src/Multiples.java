public class Multiples {
    public static void main(String[] args) {
        int numOfMultiples = 0;
        for(int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0)
                numOfMultiples += 1;
        }

        System.out.println(numOfMultiples);
    }
}
