public class Main {
    public static void main(String[] args) {
        try {
            int sum = new ArrayValueCalculator().doCalc(new String[][]{
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            });
            System.out.println(sum);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }


    }
}