import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
class LoginS extends JFrame
{
JLabel l1,l2,l3,l4;
JTextField t1;
JPasswordField t2;
JButton b1,b2,b3,b4;
LoginS(String s1)
{
super(s1);
}
LoginS()
{

}
void setComponents()
{
Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
// Cursor c1 = new Cursor(Cursor.WAIT_CURSOR);
// Cursor c1 = new Cursor(Cursor.CROSSHAIR_CURSOR);
Font f1 = new Font("Times New Roman", Font.BOLD, 28);
Font f2 = new Font("Callibri", Font.ITALIC, 22);

l1 = new JLabel("Hello my Friend ,How are you!!");
l1.setFont(f1);
l1.setForeground(Color.RED);

l2 = new JLabel("USERNAME");
l2.setFont(f2);
l2.setForeground(Color.BLUE);

l3 = new JLabel("PASSWORD");
l3.setFont(f2);
l3.setForeground(Color.BLUE);

l4 = new JLabel();

t1 = new JTextField();

t2 = new JPasswordField();

b1 = new JButton("LOGIN");
b1.setBackground(Color.RED);
b1.setForeground(Color.WHITE);
b1.setCursor(c1 );

b2 = new JButton("CLEAR");
b2.setBackground(Color.RED);
b2.setForeground(Color.WHITE);
b2.setCursor(c1 );

b3 = new JButton("ADD");
b3.setBackground(Color.RED);
b3.setForeground(Color.WHITE);
b3.setCursor(c1 );

b4 = new JButton("AUTOFILL");
b4.setBackground(Color.RED);
b4.setForeground(Color.WHITE);
b4.setCursor(c1 );

setLayout(null);

add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);

l1.setBounds(100,50,500,30);
l2.setBounds(100,200,200,30);
l3.setBounds(100,350,200,30);
l4.setBounds(100,570,200,30);
t1.setBounds(350,200,100,30);
t2.setBounds(350,350,100,30);
b1.setBounds(100,450,100,30);
b2.setBounds(250,450,100,30);
b3.setBounds(250,550,100,30);
b4.setBounds(450,450,100,30);
b1.addActionListener(new Log());
b2.addActionListener(new Clear());
b3.addActionListener(new Add());
b4.addActionListener(new Autofill());
l1.addMouseListener(new MouseL1());
l2.addMouseListener(new MouseL2());
l3.addMouseListener(new MouseL3());
t1.addMouseListener(new MouseL4());
t2.addMouseListener(new MouseL5());
b1.addMouseListener(new MouseL6());
b2.addMouseListener(new MouseL7());
b3.addMouseListener(new MouseL8());
b4.addMouseListener(new MouseL9());
//JLabel l1 = new JLabel("Welcome");
//JTextField t1 = new JTextField();
//setLayout(null);
//t1.setBounds(200,200,100,30);
//l1.setBounds(200,100,100,30);
//add(t1);
//add(l1);
}

class MouseL1 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l1.setForeground(Color.BLACK);
}
public void mouseEntered(MouseEvent e1)
{
l1.setForeground(Color.RED);
}
public void mouseReleased(MouseEvent e1)
{
l1.setText("Hello my Friend ,How are you!!");
}
public void mousePressed(MouseEvent e1)
{

l1.setText("");
}
public void mouseClicked(MouseEvent e1)
{
l4.setText("Mouse Clicked");
}
}

class MouseL2 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l2.setForeground(Color.BLACK);
}
public void mouseEntered(MouseEvent e1)
{
l2.setForeground(Color.RED);
}
public void mouseReleased(MouseEvent e1)
{
l2.setText("USERNAME");
}
public void mousePressed(MouseEvent e1)
{
l2.setText("");
}
public void mouseClicked(MouseEvent e1)
{
t1.requestFocus();
}
}

class MouseL3 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l3.setForeground(Color.BLACK);
}
public void mouseEntered(MouseEvent e1)
{
l3.setForeground(Color.RED);
}
public void mouseReleased(MouseEvent e1)
{
l3.setText("PASSWORD");
}
public void mousePressed(MouseEvent e1)
{
l3.setText("");
}
public void mouseClicked(MouseEvent e1)
{
t2.requestFocus();
}
}

class MouseL4 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l2.setForeground(Color.BLACK);
}
public void mouseEntered(MouseEvent e1)
{
l2.setForeground(Color.RED);
}
public void mouseReleased(MouseEvent e1)
{
l2.setText("USERNAME");
}
public void mousePressed(MouseEvent e1)
{
l2.setText("");
}
public void mouseClicked(MouseEvent e1)
{
l4.setText("Mouse Clicked");
}
}

class MouseL5 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l3.setForeground(Color.BLACK);
}
public void mouseEntered(MouseEvent e1)
{
l3.setForeground(Color.RED);
}
public void mouseReleased(MouseEvent e1)
{
l3.setText("PASSWORD");
}
public void mousePressed(MouseEvent e1)
{
l3.setText("");
}
public void mouseClicked(MouseEvent e1)
{
l4.setText("Mouse Clicked");
}
}

class MouseL6 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l2.setForeground(Color.RED);
l3.setForeground(Color.RED);
b1.setBackground(Color.RED);
}
public void mouseEntered(MouseEvent e1)
{
l2.setForeground(Color.BLUE);
l3.setForeground(Color.BLUE);
b1.setBackground(Color.BLUE);
}
public void mouseReleased(MouseEvent e1)
{
l2.setText("USERNAME");
l3.setText("PASSWORD");
b1.setText("LOGIN");
}
public void mousePressed(MouseEvent e1)
{
b1.setBackground(Color.GRAY);
}
public void mouseClicked(MouseEvent e1)
{
b1.setBackground(Color.GRAY);
}
}

class MouseL7 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l2.setForeground(Color.RED);
l3.setForeground(Color.RED);
b2.setBackground(Color.RED);
}
public void mouseEntered(MouseEvent e1)
{
l2.setForeground(Color.BLUE);
l3.setForeground(Color.BLUE);
b2.setBackground(Color.BLUE);
}
public void mouseReleased(MouseEvent e1)
{
l2.setText("USERNAME");
l3.setText("PASSWORD");
b2.setText("CLEAR");
}
public void mousePressed(MouseEvent e1)
{
b2.setBackground(Color.GRAY);
}
public void mouseClicked(MouseEvent e1)
{
b2.setBackground(Color.GRAY);
}
}

class MouseL8 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l2.setForeground(Color.RED);
l3.setForeground(Color.RED);
b3.setBackground(Color.RED);
}
public void mouseEntered(MouseEvent e1)
{
l2.setForeground(Color.BLUE);
l3.setForeground(Color.BLUE);
b3.setBackground(Color.BLUE);
}
public void mouseReleased(MouseEvent e1)
{
l2.setText("USERNAME");
l3.setText("PASSWORD");
b3.setText("ADD");
}
public void mousePressed(MouseEvent e1)
{
b3.setBackground(Color.GRAY);
}
public void mouseClicked(MouseEvent e1)
{
b3.setBackground(Color.GRAY);
}
}

class MouseL9 implements MouseListener
{
public void mouseExited(MouseEvent e1)
{
l2.setForeground(Color.RED);
l3.setForeground(Color.RED);
b4.setBackground(Color.RED);
}
public void mouseEntered(MouseEvent e1)
{
l2.setForeground(Color.BLUE);
l3.setForeground(Color.BLUE);
b4.setBackground(Color.BLUE);
}
public void mouseReleased(MouseEvent e1)
{
l2.setText("USERNAME");
l3.setText("PASSWORD");
b4.setText("AUTOFILL");
}
public void mousePressed(MouseEvent e1)
{
b4.setBackground(Color.GRAY);
}
public void mouseClicked(MouseEvent e1)
{
b4.setBackground(Color.GRAY);
}
}

class Log implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
String s1 = t1.getText();
String s2 = t2.getText();
if(s1.equals("coding") && s2.equals("seekho"))
{
JOptionPane.showMessageDialog(null, "Login Successful");
l4.setText("Login Successful");
}
else
{
JOptionPane.showMessageDialog(null, "Login Unsuccessful");
l4.setText("Login Unsuccessful");
l4.setForeground(Color.RED);
}
}
}

class Clear implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
l4.setText("");
}
}

class Autofill implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("coding");
t2.setText("seekho");
}
}

class Add implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
try
{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int c = a + b;
l4.setText("Addition is: " + c);
}
catch(Exception e2)
{
l4.setText("Please enter a number only");
l4.setForeground(Color.RED);
}
}
}

public static void main(String []args)
{
LoginS s1 = new LoginS("Welcome to Facebook");
// JFrame j1 = new JFrame("Welcome to Facebook");
s1.setSize(700,700);
s1.setComponents();
s1.setVisible(true);
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}