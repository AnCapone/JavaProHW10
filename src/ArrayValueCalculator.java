public class ArrayValueCalculator {
    private static final int SIZE = 4;
    public int doCalc(String[][] inputData) {
        if (inputData.length != SIZE || inputData[0].length != SIZE) {
            throw new ArraySizeException("Invalid size of input data. Expected " + SIZE + "x" + SIZE);
        }

        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    sum += Integer.parseInt(inputData[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
