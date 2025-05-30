public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    // Constructor tạo ma trận với số dòng, cột cho trước, tất cả giá trị 0
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    // Lấy số dòng
    public int getRows() {
        return rows;
    }

    // Lấy số cột
    public int getCols() {
        return cols;
    }

    // Lấy giá trị tại vị trí (i,j)
    public double getValue(int i, int j) {
        return data[i][j];
    }

    // Đặt giá trị tại vị trí (i,j)
    public void setValue(int i, int j, double value) {
        data[i][j] = value;
    }

    // In ma trận ra màn hình
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
