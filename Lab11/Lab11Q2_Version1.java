package Lab11;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// December 2021
class ColumnSumThread extends Thread {
    private int[][] matrix;
    private int columnIndex;
    private int partialSum;

    public ColumnSumThread(int[][] matrix, int columnIndex) {
        this.matrix = matrix;
        this.columnIndex = columnIndex;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < matrix.length; i++) {
            partialSum += matrix[i][columnIndex];
        }
    }

    public int getPartialSum() {
        return partialSum;
    }
}

class TotalSumThread extends Thread {
    private ColumnSumThread[] columnSumThreads;
    private int totalSum;

    public TotalSumThread(ColumnSumThread[] columnSumThreads) {
        this.columnSumThreads = columnSumThreads;
        this.totalSum = 0;
    }

    @Override
    public void run() {
        for (ColumnSumThread thread : columnSumThreads) {
            totalSum += thread.getPartialSum();
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
}

public class Lab11Q2_Version1 {
    public static void main(String[] args) throws InterruptedException {
        int N = 5; // Change N as needed (5 <= N <= 8)

        int[][] matrix = new int[N][N];
        initializeMatrix(matrix);

        ColumnSumThread[] columnSumThreads = new ColumnSumThread[N];
        for (int i = 0; i < N; i++) {
            columnSumThreads[i] = new ColumnSumThread(matrix, i);
            columnSumThreads[i].start();
        }

        for (ColumnSumThread thread : columnSumThreads) {
            thread.join();
        }

        TotalSumThread totalSumThread = new TotalSumThread(columnSumThreads);
        totalSumThread.start();
        totalSumThread.join();

        int totalSum = totalSumThread.getTotalSum();
        System.out.println("Total sum of the matrix: " + totalSum);
    }

    private static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }
}
