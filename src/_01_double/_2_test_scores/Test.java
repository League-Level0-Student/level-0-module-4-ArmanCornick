package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
String testScore = JOptionPane.showInputDialog("what did you get on your test?");
double test = Double.parseDouble(testScore);
if(test>90) {
JOptionPane.showMessageDialog(null,  "Nice score!");
}
else if(test>80) {
JOptionPane.showMessageDialog(null,  "That's a decent score.");	
}
else if(test>70) {
JOptionPane.showMessageDialog(null,  "That isn't great...");	
}
else {
JOptionPane.showMessageDialog(null, "That sucks.");	
}
	
	
	
	
}
}
