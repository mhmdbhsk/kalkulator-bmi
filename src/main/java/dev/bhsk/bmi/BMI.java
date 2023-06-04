package dev.bhsk.bmi;

import view.BMIView;

public class BMI {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BMIView view = new BMIView();
                view.setVisible(true);
            }
        });
    }
}
