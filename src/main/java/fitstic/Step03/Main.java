package fitstic.Step03;

import fitstic.Step03.Controller.Controller;
import fitstic.Step03.View.GUI;

public class Main {

    public static void main(String[] args){
        Controller controller = new Controller();
        new GUI(controller);
    }

}
