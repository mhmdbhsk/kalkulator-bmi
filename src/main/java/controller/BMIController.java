package controller;

import model.BMIModel;
import view.BMIView;

public class BMIController {

    private BMIModel model;
    private BMIView view;

    public BMIController(BMIView view) {
        this.model = new BMIModel();
        this.view = view;
    }

    public void calculateBMI() {
        double weight = view.getWeightInput();
        double height = view.getHeightInput();
        
        model.setWeight(weight);
        model.setHeight(height);
        
        model.calculateBMI();

        double bmi = model.getBMI();
        String result;

        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 24.9) {
            result = "Normal weight";
        } else if (bmi < 29.9) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        view.setResult(result);
    }
}
