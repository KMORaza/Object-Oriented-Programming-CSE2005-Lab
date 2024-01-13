package Lab11;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// December 2021
class ColumnSumRunnable implements Runnable {
    private int[][] matrix;
    private int columnIndex;
    private int partialSum;

    public ColumnSumRunnable(int[][] matrix, int columnIndex) {
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

class TotalSumRunnable implements Runnable {
    private ColumnSumRunnable[] columnSumRunnables;
    private int totalSum;

    public TotalSumRunnable(ColumnSumRunnable[] columnSumRunnables) {
        this.columnSumRunnables = columnSumRunnables;
        this.totalSum = 0;
    }

    @Override
    public void run() {
        for (ColumnSumRunnable runnable : columnSumRunnables) {
            totalSum += runnable.getPartialSum();
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
}

public class Lab11Q2_Version2 {
    public static void main(String[] args) throws InterruptedException {
        int N = 5; // Change N as needed (5 <= N <= 8)

        int[][] matrix = new int[N][N];
        initializeMatrix(matrix);

        ColumnSumRunnable[] columnSumRunnables = new ColumnSumRunnable[N];
        Thread[] columnSumThreads = new Thread[N];

        for (int i = 0; i < N; i++) {
            columnSumRunnables[i] = new ColumnSumRunnable(matrix, i);
            columnSumThreads[i] = new Thread(columnSumRunnables[i]);
            columnSumThreads[i].start();
        }

        for (Thread thread : columnSumThreads) {
            thread.join();
        }

        TotalSumRunnable totalSumRunnable = new TotalSumRunnable(columnSumRunnables);
        Thread totalSumThread = new Thread(totalSumRunnable);
        totalSumThread.start();
        totalSumThread.join();

        int totalSum = totalSumRunnable.getTotalSum();
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
