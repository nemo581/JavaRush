package com.javarush.task.task32.task3209;

import javax.swing.text.html.HTMLDocument;
import java.io.File;

public class Controller {
    public static void main(String[] args) {
        View view_1 = new View();
        Controller controller = new Controller(view_1);
        view_1.setController(controller);
        view_1.init();
        controller.init();
    }
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public void init() {

    }

    public void exit() {
        System.exit(0);
    }
}
