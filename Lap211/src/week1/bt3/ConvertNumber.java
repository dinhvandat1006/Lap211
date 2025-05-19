package week1.bt3;
import java.util.Scanner;
public class ConvertNumber {
    // Lớp chuyển đổi cơ số
    private int input;
    private int output;
    private String inputValue;

    // Constructor
    public ConvertNumber(int input, int output, String inputValue) {
        this.input = input;
        this.output = output;
        this.inputValue = inputValue;
    }

    // Getter và Setter
    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    // Hàm thực hiện chuyển đổi
    public String convert() {
        int decimalValue = Integer.parseInt(inputValue, input);
        return Integer.toString(decimalValue, output).toUpperCase();
    }

}


