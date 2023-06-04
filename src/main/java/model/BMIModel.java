package model;

public class BMIModel {
    private double weight;
    private double height;
    private double bmi;
    
    public BMIModel() {
        this.height = 0;
        this.weight = 0;
        this.bmi = 0;
    }
     
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void calculateBMI() {
        double convertedHeight = height/100;
        bmi = weight / (convertedHeight * convertedHeight);
    }

    public double getBMI() {
        return bmi;
    }
}
