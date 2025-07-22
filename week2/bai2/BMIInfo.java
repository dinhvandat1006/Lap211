package week2.bai2;

public class BMIInfo {
    private double weight;
    private double height;

    public BMIInfo(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Getters

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    // Setters


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateBMI() {
        if (height <= 0) throw new IllegalArgumentException("Height must be greater than 0");
        return weight / (height * height);
    }

    public String getBMIStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25.0) return "Normal";
        else if (bmi <30) return "Overweight";
        else return "Obese";
    }
}
