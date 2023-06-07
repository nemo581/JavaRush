package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.TextEditMenuListener;

import javax.swing.event.DocumentListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
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

    public HTMLDocument getDocument() {
        return document;
    }

    public void resetDocument() {
        if (document != null) {
            document.removeUndoableEditListener(view.getUndoListener());
        }
        document = (HTMLDocument) new HTMLEditorKit().createDefaultDocument();
        document.addUndoableEditListener(view.getUndoListener());
        view.update();
    }

    public void init() {

    }

    public void exit() {
        System.exit(0);
    }
}