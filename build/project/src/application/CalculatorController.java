package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

//	private ArrayList<Integer> num1 = new ArrayList<Integer>();

//	private ArrayList<Integer> num2 = new ArrayList<Integer>();

	private String num1 = "";

	private String num2 = "";

	private String action = "";

	private Boolean first = true;

	@FXML
	private Button dot;

	@FXML
	private Button add;

	@FXML
	private Button b0;

	@FXML
	private Button b1;

	@FXML
	private Button b2;

	@FXML
	private Button b3;

	@FXML
	private Button b4;

	@FXML
	private Button b5;

	@FXML
	private Button b6;

	@FXML
	private Button b7;

	@FXML
	private Button b8;

	@FXML
	private Button b9;

	@FXML
	private Button bclear;

	@FXML
	private Button divide;

	@FXML
	private Button equal;

	@FXML
	private Button multiply;

	@FXML
	private Button substract;

	@FXML
	private TextField display;

	private Boolean isDecimal = false;

	@FXML
	void calculate(ActionEvent event) {
		System.out.println("Clicked Equal");
		Float number1 = 0f;
		Float number2 = 0f;
		
		if (num1.equals("") || num2.equals("")) {
			display.setText("Nothing Entered");
			return;
		}
		try {
			number1 = Float.parseFloat(num1);
			number2 = Float.parseFloat(num2);
		} catch (NumberFormatException nfe) {
			display.setText("Format Error");
		}

		Float ans;

		switch (action) {
		case "+":
			ans = number1 + number2;
			display.setText(ans.toString());
			break;

		case "-":
			ans = number1 - number2;
			display.setText(ans.toString());
			break;

		case "*":
			ans = number1 * number2;
			display.setText(ans.toString());
			break;

		case "/":
			if (number2 == 0f) {
				display.setText("DBZE");
				return;
			}
			ans = number1 / number2;
			display.setText(ans.toString());
			break;

		default:
			return;
		}
//		first = true;
		isDecimal = false;
		num1 = ans.toString();
		num2 = "";
	}

	@FXML
	void clearData(ActionEvent event) {
		num1 = "";
		num2 = "";
		action = "";
		first = true;
		display.setText("");
	}

	@FXML
	void enter0(ActionEvent event) {
		if (first)
			num1 = num1 + "0";
		else
			num2 = num2 + "0";
		updateDisplay();
	}

	@FXML
	void enter1(ActionEvent event) {
		if (first)
			num1 = num1 + "1";
		else
			num2 = num2 + "1";
		updateDisplay();
	}

	@FXML
	void enter2(ActionEvent event) {
		if (first)
			num1 = num1 + "2";
		else
			num2 = num2 + "2";
		updateDisplay();
	}

	@FXML
	void enter3(ActionEvent event) {
		if (first)
			num1 = num1 + "3";
		else
			num2 = num2 + "3";
		updateDisplay();
	}

	@FXML
	void enter4(ActionEvent event) {
		if (first)
			num1 = num1 + "4";
		else
			num2 = num2 + "4";
		updateDisplay();
	}

	@FXML
	void enter5(ActionEvent event) {
		if (first)
			num1 = num1 + "5";
		else
			num2 = num2 + "5";
		updateDisplay();
	}

	@FXML
	void enter6(ActionEvent event) {
		if (first)
			num1 = num1 + "6";
		else
			num2 = num2 + "6";
		updateDisplay();
	}

	@FXML
	void enter7(ActionEvent event) {
		if (first)
			num1 = num1 + "7";
		else
			num2 = num2 + "7";
		updateDisplay();
	}

	@FXML
	void enter8(ActionEvent event) {
		if (first)
			num1 = num1 + "8";
		else
			num2 = num2 + "8";
		updateDisplay();
	}

	@FXML
	void enter9(ActionEvent event) {
		if (first)
			num1 = num1 + "9";
		else
			num2 = num2 + "9";
		updateDisplay();
	}

	@FXML
	void setAdd(ActionEvent event) {
		action = "+";
		first = false;
		updateDisplay();
	}

	@FXML
	void setDivide(ActionEvent event) {
		action = "/";
		first = false;
		updateDisplay();
	}


	@FXML
	void setMultiply(ActionEvent event) {
		action = "*";
		first = false;
		updateDisplay();
	}

	@FXML
	void setSubstract(ActionEvent event) {
		action = "-";
		first = false;
		updateDisplay();
	}

	void updateDisplay() {
		display.setText(num1 + action + num2);
		isDecimal = false;
	}

	@FXML
	void enterDot(ActionEvent event) {

//		Float number = 0f;

		if (isDecimal)
			return;

		if (first) {
			num1 = num1 + ".";
		}
		else {
			num2 = num2 + ".";
		}
		updateDisplay();
		isDecimal = true;
	}
}
