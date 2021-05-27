package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {
	
	@FXML
	public Button equal;
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Button six;
	public Button seven;
	public Button eight;
	public Button nine;
	public Button zero;
	public Button dot;
	public Button clearAll;
	public Button clearEntry;
	public Button backSpace;
	public Button devide;
	public Button mutiple;
	public Button minus;
	public Button plus;
	public Button negative;
	public TextField input;
	public Label result;
	public Label temp_result;
	
	double num1 = 0;
	double num2 = 0;
	double num3;
	double tempResult = 0;
	String operator1 = "+";
	String operator2 = "+";
	String operator3;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		equal.requestFocus();
	}
	
	public void one_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "1";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void two_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "2";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void three_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "3";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void four_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "4";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void five_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "5";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void six_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "6";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void seven_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "7";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void eight_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "8";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void nine_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "9";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void zero_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = "0";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void dot_click() {
		String oldString = result.getText();
		String oldValue = input.getText();
		String in = ".";
		input.setText(oldValue + in);
		result.setText(oldString + in);
		equal.requestFocus();
	}
	public void devide_click() {
		String oldString = result.getText();
		String current_num = input.getText();
		num3 = Double.parseDouble(current_num);
		operator3 = "/";

		tempResult= Math.round(operation(num1, num2, num3, operator1, operator2, operator3)*10)/10.0;
		if(tempResult == 87) {
			temp_result.setText("Error");
		}else {
			String tempResultString = Double.toString(tempResult);
			temp_result.setText(tempResultString);
		}
		
		input.setText("");
		input.setPromptText("0");
		result.setText(oldString + "/");
	}
	public void mutiple_click() {
		String oldString = result.getText();
		String current_num = input.getText();
		num3 = Double.parseDouble(current_num);
		operator3 = "*";

		tempResult= Math.round(operation(num1, num2, num3, operator1, operator2, operator3)*10)/10.0;
		if(tempResult == 87) {
			temp_result.setText("Error");
		}else {
			String tempResultString = Double.toString(tempResult);
			temp_result.setText(tempResultString);
		}
		
		input.setText("");
		input.setPromptText("0");
		result.setText(oldString + "*");
	}
	public void minus_click() {
		String oldString = result.getText();
		String current_num = input.getText();
		num3 = Double.parseDouble(current_num);
		operator3 = "-";

		tempResult= Math.round(operation(num1, num2, num3, operator1, operator2, operator3)*10)/10.0;
		if(tempResult == 87) {
			temp_result.setText("Error");
		}else {
			String tempResultString = Double.toString(tempResult);
			temp_result.setText(tempResultString);
		}
		
		input.setText("");
		input.setPromptText("0");
		result.setText(oldString + "-");
	}
	public void plus_click() {
		String oldString = result.getText();
		String current_num = input.getText();
		num3 = Double.parseDouble(current_num);
		operator3 = "+";

		tempResult= Math.round(operation(num1, num2, num3, operator1, operator2, operator3)*10)/10.0;
		if(tempResult == 87) {
			temp_result.setText("Error");
		}else {
			String tempResultString = Double.toString(tempResult);
			temp_result.setText(tempResultString);
		}
		
		input.setText("");
		input.setPromptText("0");
		result.setText(oldString + "+");
	}
	public void equal_click() {
		String current_num = input.getText();
		num3 = Double.parseDouble(current_num);
		
		tempResult= Math.round(operation(num1, num2, num3, operator1, operator2, operator3)*10)/10.0;
		if(tempResult == 87) {
			temp_result.setText("Error");
		}else {
			String tempResultString = Double.toString(tempResult);
			temp_result.setText(tempResultString);
		}
		
		input.setText("");
		result.setText("");
		
		num1 = 0;
		num2 = 0;
		operator1 = "+";
		operator2 = "+";
	}
	public void ac_click() {
		input.setText("");
		result.setText("");
		temp_result.setText("0.0");
		num1 = 0;
		num2 = 0;
		operator1 = "+";
		operator2 = "+";
	}
	public void ce_click() {
		if(input.getText() != "") {
			String string = result.getText();
			result.setText("");
			for(int i =0; i<string.length() - input.getText().length(); i++) {
				result.setText(result.getText() + string.charAt(i));
			}
		}
		input.setText("");
	}
	public void bs_click() {
		String string1 = result.getText();
		result.setText("");
		for(int i=0; i<string1.length()-1; i++) {
			result.setText(result.getText() + string1.charAt(i));
		}
		if(input.getText() != "") {
			String string2 = input.getText();
			input.setText("");
			for(int i=0; i<string2.length()-1; i++) {
				input.setText(input.getText() + string2.charAt(i));
			}
		}
	}
	public void negative_click() {
		if(input.getText() != "") {
			num3 = (-1) * num3;
			String oldString = result.getText();
			String oldValue = input.getText();
			//String in = "(-)";
			int stringLength = oldString.length();
			int numLength = oldValue.length();
			result.setText("");
			for(int i=0; i<stringLength-numLength; i++) {
				result.setText(result.getText() + oldString.charAt(i));
			}
			result.setText(result.getText() + "(-" + oldValue + ")");
			input.setText("-" + oldValue);
		}else {
			temp_result.setText("Enter number first!");
		}
	}
	
	public Double operation(double n1, double n2, double n3, String op1, String op2, String op3) {
		if(op1 == "+" && op2 == "+") {
			double result = n1 + n2 + n3;
			num1 = n1 + n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "+" && op2 == "-") {
			double result = n1 + n2 - n3;
			num1 = n1 + n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "+" && op2 == "*") {
			double result = n1 + n2 * n3;
			num1 = n1;
			num2 = n2 * n3;
			operator1 = op1;
			operator2 = op3;
			return result;
		}else if(op1 == "+" && op2 == "/") {
			double result = n1 + n2 / n3;
			if(n3 == 0) {
				return (double) 87;
			}
			num1 = n1;
			num2 = n2 / n3;
			operator1 = op1;
			operator2 = op3;
			return result;
		}else if(op1 == "-" && op2 == "+") {
			double result = n1 - n2 + n3;
			num1 = n1 - n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "-" && op2 == "-") {
			double result = n1 - n2 - n3;
			num1 = n1 - n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "-" && op2 == "*") {
			double result = n1 - n2 * n3;
			num1 = n1;
			num2 = n2 * n3;
			operator1 = op1;
			operator2 = op3;
			return result;
		}else if(op1 == "-" && op2 == "/") {
			double result = n1 - n2 / n3;
			if(n3 == 0) {
				return (double) 87;
			}
			num1 = n1;
			num2 = n2 / n3;
			operator1 = op1;
			operator2 = op3;
			return result;
		}else if(op1 == "*" && op2 == "+") {
			double result = n1 * n2 + n3;
			num1 = n1 * n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "*" && op2 == "-") {
			double result = n1 * n2 - n3;
			num1 = n1 * n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "*" && op2 == "*") {
			double result = n1 * n2 * n3;
			num1 = n1 * n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "*" && op2 == "/") {
			double result = n1 * n2 / n3;
			if(n3 == 0) {
				return (double) 87;
			}
			num1 = n1 * n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "/" && op2 == "+") {
			double result = n1 / n2 + n3;
			if(n2 == 0) {
				return (double) 87;
			}
			num1 = n1 / n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "/" && op2 == "-") {
			double result = n1 / n2 - n3;
			if(n2 == 0) {
				return (double) 87;
			}
			num1 = n1 / n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else if(op1 == "/" && op2 == "*") {
			double result = n1 / n2 * n3;
			if(n2 == 0) {
				return (double) 87;
			}
			num1 = n1 / n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}else {
			double result = n1 / n2 / n3;
			if(n2 == 0 || n3 == 0) {
				return (double) 87;
			}
			num1 = n1 / n2;
			num2 = n3;
			operator1 = op2;
			operator2 = op3;
			return result;
		}
	}
}