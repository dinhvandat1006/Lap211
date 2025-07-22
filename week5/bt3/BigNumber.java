package week5.bt3;

public class BigNumber {
    private int[] digits;  // Lưu chữ số theo thứ tự ngược (để dễ tính toán)

    // Constructor nhận chuỗi số
    public BigNumber(String number) {
        setNumber(number);
    }

    // Getter: trả về số dưới dạng chuỗi
    public String getNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }

    // Setter: thiết lập số từ chuỗi
    public void setNumber(String number) {
        int len = number.length();
        digits = new int[len];
        for (int i = 0; i < len; i++) {
            char c = number.charAt(len - 1 - i);
            if (Character.isDigit(c)) {
                digits[i] = c - '0';
            } else {
                throw new IllegalArgumentException("Chuỗi không hợp lệ: phải là chữ số.");
            }
        }
    }

    // Cộng 2 BigNumber
    public BigNumber add(BigNumber other) {
        int maxLength = Math.max(this.digits.length, other.digits.length);
        int[] result = new int[maxLength + 1];
        int carry = 0;

        for (int i = 0; i < result.length; i++) {
            int sum = carry;
            if (i < this.digits.length) sum += this.digits[i];
            if (i < other.digits.length) sum += other.digits[i];
            result[i] = sum % 10;
            carry = sum / 10;
        }

        return new BigNumber(result);
    }

    // Nhân 2 BigNumber
    public BigNumber multiply(BigNumber other) {
        int[] result = new int[this.digits.length + other.digits.length];

        for (int i = 0; i < this.digits.length; i++) {
            for (int j = 0; j < other.digits.length; j++) {
                result[i + j] += this.digits[i] * other.digits[j];
                if (result[i + j] >= 10) {
                    result[i + j + 1] += result[i + j] / 10;
                    result[i + j] %= 10;
                }
            }
        }

        return new BigNumber(result);
    }

    // Constructor nội bộ dùng mảng kết quả (số đã lưu ngược)
    private BigNumber(int[] reversedDigits) {
        int i = reversedDigits.length - 1;
        while (i > 0 && reversedDigits[i] == 0) i--; // Bỏ số 0 đầu
        digits = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            digits[j] = reversedDigits[j];
        }
    }

    // toString: dùng để in kết quả
    @Override
    public String toString() {
        return getNumber();
    }
}
