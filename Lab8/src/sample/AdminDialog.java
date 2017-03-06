package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private ParentChild pch = new ParentChild();

    public AdminDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        if(comboBox1.getSelectedItem()==comboBox2.getSelectedItem()){
            System.out.println("Parent & Child is one element");
            pch.setValue(comboBox1.getSelectedItem().toString(),comboBox2.getSelectedItem().toString(),false);
        }
        else{
            pch.setValue(comboBox1.getSelectedItem().toString(),comboBox2.getSelectedItem().toString(),true);
        }
        this.setVisible(false);
        dispose();
    }

    private void onCancel() {
        pch.setValue(comboBox1.getSelectedItem().toString(),comboBox2.getSelectedItem().toString(),false);
        this.setVisible(false);
        dispose();
    }
    public void addItem(String  btn){
        comboBox1.addItem(btn);
        comboBox2.addItem(btn);
    }
    public ParentChild getResult(){
        return pch;
    }
}
