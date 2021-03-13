package com.labeleven.jas777;

import javax.swing.*;

public class ExerciseOne {

    public static void main(String[] args) {

        JFrame window = new JFrame("Conversion");

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 225);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JLabel celsius    = new JLabel("Celsius");
        JLabel fahrenheit = new JLabel("Fahrenheit");

        JTextField input  = new JTextField();
        JTextField result = new JTextField();

        input.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                String text = ((JTextField) input).getText();

                boolean verified = false;

                try {
                    Integer.parseInt(text);
                    verified = true;
                } catch (NumberFormatException ignored) { }

                return verified;
            }
        });

        JButton button = new JButton("Convert");

        celsius.setBounds(130, 20, 100, 30);
        window.add(celsius);

        fahrenheit.setBounds(130, 60, 100, 30);
        window.add(fahrenheit);

        input.setBounds(20, 20, 100, 25);
        window.add(input);

        result.setBounds(20, 60, 100, 25);
        window.add(result);

        button.setBounds(20, 90, 100, 30);
        window.add(button);

        button.addActionListener(actionEvent -> {

            String celsiusInput = input.getText();

            int celsiusNumber = Integer.parseInt(celsiusInput);

            result.setText(String.valueOf(celsiusNumber * 2 + 32));

        });

        window.setVisible(true);
    }
}
