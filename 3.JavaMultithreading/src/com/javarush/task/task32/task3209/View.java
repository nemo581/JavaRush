package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;
import com.javarush.task.task32.task3209.listeners.UndoListener;

import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();
    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);

    public UndoListener getUndoListener() {
        return undoListener;
    }

    public View() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
            ExceptionHandler.log(e);
        }
        SwingUtilities.updateComponentTreeUI(tabbedPane);
        SwingUtilities.updateComponentTreeUI(htmlTextPane);
        SwingUtilities.updateComponentTreeUI(plainTextPane);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
	
	public void selectedTabChanged() {
        switch (tabbedPane.getSelectedIndex()) {
            case (0):
                controller.setPlainText(plainTextPane.getText());
                break;
            case (1):
                plainTextPane.setText(controller.getPlainText());
                break;
        }
        resetUndo();
	}

    public void init() {
        initGui();
        FrameListener frameListener = new FrameListener(this);
        addWindowListener(frameListener);
        this.setVisible(true);
    }

    public void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        MenuHelper.initFileMenu(this, menuBar);
        MenuHelper.initEditMenu(this, menuBar);
        MenuHelper.initStyleMenu(this, menuBar);
        MenuHelper.initAlignMenu(this, menuBar);
        MenuHelper.initColorMenu(this, menuBar);
        MenuHelper.initFontMenu(this, menuBar);
        MenuHelper.initHelpMenu(this, menuBar);
        getContentPane().add(menuBar, BorderLayout.NORTH);

    }

    public void initEditor() {
        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollPane_1 = new JScrollPane(htmlTextPane);
        tabbedPane.add("HTML", jScrollPane_1);
        JScrollPane jScrollPane_2 = new JScrollPane(plainTextPane);
        tabbedPane.add("Текст", jScrollPane_2);
        tabbedPane.setPreferredSize(new Dimension(250, 150));
        tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void exit() {
        controller.exit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case ("Новый"):
                controller.createNewDocument();
                break;
            case ("Открыть"):
                controller.openDocument();
                break;
            case ("Сохранить"):
                controller.saveDocument();
                break;
            case ("Сохранить как..."):
                controller.saveDocumentAs();
                break;
            case ("Выход"):
                controller.exit();
                break;
            case ("О программе"):
                showAbout();
                break;
        }
    }

    public boolean canUndo() {
        return undoManager.canUndo();
    }

    public boolean canRedo() {
        return undoManager.canRedo();
    }

    public void undo() {
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            ExceptionHandler.log(e);
        }
    }

    public void redo() {
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            ExceptionHandler.log(e);
        }
    }

    public boolean isHtmlTabSelected() {
        return tabbedPane.getSelectedIndex() == 0;
    }

    public void selectHtmlTab() {
        tabbedPane.setSelectedIndex(0);
        resetUndo();
    }

    public void update() {
        htmlTextPane.setDocument(controller.getDocument());
    }

    public void showAbout() {
        JOptionPane.showMessageDialog(null,
                "Информацией о программе",
                "о программе",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void resetUndo() {
        undoManager.discardAllEdits();
    }
}
