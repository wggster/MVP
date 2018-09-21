package edu.ucsd.cs.mvp;

public class Main {
    /*
     * It's very constraining that main has to update the Display every time Data gets a new value.
     * Employ a Model-View-Presenter pattern so that:
     *   (a) Data's actions result in Display being updated directly
     *   (b) Data does not know about Display
     *   (c) Display does not have to be modified (i.e., extended to be a DataSubject)
     */
    public static void main(String[] args) {
        Data myData = new Data();
        Display myDisplay = new Display();
        for (int i = 0; i <= 10; i++) {
            myData.setData(i);
            myDisplay.show(i);
        }

    }
}
