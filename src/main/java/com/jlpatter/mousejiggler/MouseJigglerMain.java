package com.jlpatter.mousejiggler;

import javax.swing.*;

public class MouseJigglerMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseJigglerForm");
        frame.setContentPane(new MouseJigglerForm().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
