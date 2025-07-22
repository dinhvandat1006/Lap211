//package week2.bai1;
//
//public class MatrixCalculator {
//
//    public static Matrix add(Matrix m1, Matrix m2) {
//        if (m1.getRows() != m2.getRows() || m1.getCols() != m2.getCols()) {
//            throw new IllegalArgumentException("Matrix dimensions must match.");
//        }
//        Matrix result = new Matrix(m1.getRows(), m1.getCols());
//        for (int i = 0; i < m1.getRows(); i++) {
//            for (int j = 0; j < m1.getCols(); j++) {
////                result.setValue(i, j, m1.getValue(i, j) + m2.getValue(i, j));
//
//        }
//        return result;
//    }
//
//    public static Matrix subtract(Matrix m1, Matrix m2) {
//        if (m1.getRows() != m2.getRows() || m1.getCols() != m2.getCols()) {
//            throw new IllegalArgumentException("Matrix dimensions must match.");
//        }
//        Matrix result = new Matrix(m1.getRows(), m1.getCols());
//        for (int i = 0; i < m1.getRows(); i++) {
//            for (int j = 0; j < m1.getCols(); j++) {
//                result.setValue(i, j, m1.getValue(i, j) - m2.getValue(i, j));
//            }
//        }
//        return result;
//    }
//
//    public static Matrix multiply(Matrix m1, Matrix m2) {
//        if (m1.getCols() != m2.getRows()) {
//            throw new IllegalArgumentException("m1 columns must equal m2 rows.");
//        }
//        Matrix result = new Matrix(m1.getRows(), m2.getCols());
//        for (int i = 0; i < result.getRows(); i++) {
//            for (int j = 0; j < result.getCols(); j++) {
//                double sum = 0;
//                for (int k = 0; k < m1.getCols(); k++) {
//                    sum += m1.getValue(i, k) * m2.getValue(k, j);
//                }
//                result.setValue(i, j, sum);
//            }
//        }
//        return result;
//    }
//}
