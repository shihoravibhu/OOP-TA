// 6. Write a complete multi-threaded program to meet following requirements: 
// a. Read matrix [A] m x n 
// b. Create m number of threads 
// c. Each thread computes summation of elements of one row, i.e. ith row of the matrix 
// is processed by ith thread. Where 0 <= i< m. 
// d. Print the results. [C]

class SumOfRow extends Thread {
    int[] row;
    int rowIndex;

    SumOfRow(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    public void run() {
        int sum = 0;

        for (int j = 0; j < row.length; j++) {
            sum += row[j];
        }

        System.out.println("Sum : " + sum + " At Index : " + this.rowIndex);

    }
}

public class C6 {
    public static void main(String[] args) {

        int[][] a = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int i = 0;

        // SumOfRow[] obj = new SumOfRow[a.length];

        SumOfRow obj ;

        for (i = 0; i < a.length; i++) {

            int[] r = new int[a[0].length];

            for (int j = 0; j < a[0].length ; j++) {
                r[j] = a[i][j];
            }

            obj = new SumOfRow(r, i);
            obj.start();

            try {

                Thread.sleep(300);

            } 
            catch (InterruptedException e) {

                e.printStackTrace();
                
            }
        }

    }
}
