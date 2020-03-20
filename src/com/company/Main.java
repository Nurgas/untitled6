package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        JPanel panel = new JPanel(new GridBagLayout());

        JLabel label = new JLabel("GOOGLE");
        panel.add(label);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        JButton button = new JButton("OK");
        panel.add(button);

        panel.setBackground(Color.GREEN);

        window.add(panel);

        window.setSize(400,400);
        window.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?q="+textField.getText()));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
