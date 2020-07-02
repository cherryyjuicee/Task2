package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyXXXXXXX extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField inputA;
    private JButton sumBtn;
    private JTextField inputB;
    private JLabel resultLabel;

    private LinkList ll = new LinkList();

    public MyXXXXXXX() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        sumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int a = Integer.parseInt(inputA.getText());
                    int b = Integer.parseInt(inputB.getText());
                    int sum = a + b;
                    ll.add(String.valueOf(a));
                    resultLabel.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода данных");
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        MyXXXXXXX dialog = new MyXXXXXXX();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
