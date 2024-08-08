import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {
    static JButton[] numberButton = new JButton[10];
    static JButton addBtn, subBtn, divideBtn, multiplyBtn, equalBtn, clearBtn, deleteBtn, powerBtn, sinBtn, cosBtn, tanBtn, sqrtBtn;
    static String operator;
    static JFrame frame;
    static JPanel panel;
    static JTextField textField;
    static double num1, result = 0;

    public static void main(String[] args) {
        try {
            frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 600);
            frame.setResizable(false);
            frame.setLayout(new BorderLayout());
            ImageIcon imageIcon = new ImageIcon("calculator.png");
            frame.setIconImage(imageIcon.getImage());
            Font font = new Font("Arial", Font.BOLD, 30);

            textField = new JTextField();
            textField.setFont(font);
            textField.setBackground(Color.decode("#dadada"));
            textField.setEditable(false);
            textField.setHorizontalAlignment(JTextField.RIGHT);
            frame.add(textField, BorderLayout.NORTH);

            panel = new JPanel();
            panel.setBackground(Color.black);
            panel.setLayout(new GridLayout(5, 4, 5, 5));

            for (int i = 0; i < 10; i++) {
                numberButton[i] = new JButton(String.valueOf(i));
                panel.add(numberButton[i]);
            }

            sinBtn = new JButton("sin");
            panel.add(sinBtn);
            cosBtn = new JButton("cos");
            panel.add(cosBtn);
            tanBtn = new JButton("tan");
            panel.add(tanBtn);
            sqrtBtn = new JButton("√");
            panel.add(sinBtn);
            powerBtn = new JButton("^");
            panel.add(powerBtn);

            divideBtn = new JButton("/");
            multiplyBtn = new JButton("*");
            clearBtn = new JButton("C");
            addBtn = new JButton("+");
            subBtn = new JButton("-");
            equalBtn = new JButton("=");
            deleteBtn = new JButton("DEL");
            panel.add(addBtn);
            panel.add(subBtn);
            panel.add(divideBtn);
            panel.add(multiplyBtn);
            panel.add(equalBtn);
            panel.add(clearBtn);
            panel.add(deleteBtn);
            panel.add(powerBtn);
            panel.add(sinBtn);
            panel.add(cosBtn);
            panel.add(tanBtn);
            panel.add(sqrtBtn);

            frame.add(panel, BorderLayout.CENTER);

            frame.setVisible(true);


            for (int i = 0; i < numberButton.length; i++)
            {
                int finalI = i;
                numberButton[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(textField.getText()+ finalI);
                    }
                });
            }
            addBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    num1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                    operator = "+";
                }
            });
            subBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "-";
                    textField.setText("");
                }
            });
            multiplyBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "*";
                    textField.setText("");
                }
            });
            divideBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "/";
                    textField.setText("");
                }
            });
            powerBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   num1 = Double.parseDouble(textField.getText());
                   operator = "^";
                   textField.setText("");
                }
            });
            sqrtBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "√";
                    textField.setText("");
                }
            });
            cosBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "cos";
                    textField.setText("");
                }
            });
            sinBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "sin";
                    textField.setText("");
                }
            });
            tanBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = "tan";
                    textField.setText("");
                }
            });
            equalBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (operator)
                    {
                        case "+":
                            result = num1 + Double.parseDouble(textField.getText());
                            textField.setText(result+"");
                            break;
                        case "-":
                            result = num1 - Double.parseDouble(textField.getText());
                            textField.setText(result+"");
                            break;
                        case "*":
                            result = num1 * Double.parseDouble(textField.getText());
                            textField.setText(result+"");
                            break;
                        case "/":
                            result = num1 / Double.parseDouble(textField.getText());
                            textField.setText(result+"");
                            break;
                        case "^":
                            result = Math.pow(num1, Double.parseDouble(textField.getText()));
                            textField.setText(result+"");
                            break;
                        case "√":
                            result = Math.sqrt(num1);
                            textField.setText(result+"");
                        case "sin":
                            result = Math.sin(num1);
                            textField.setText(result+"");
                        case "cos":
                            result = Math.cos(num1);
                            textField.setText(result+"");
                        case "tan":
                            result = Math.tan(num1);
                            textField.setText(result+"");
                    }
                }
            });
            clearBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText("");
                }
            });
            deleteBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText().substring(0, textField.getText().length()-1));
                }
            });
        } catch (Exception e){
            System.out.println("Something went wrong"+e);
        }
    }
}
