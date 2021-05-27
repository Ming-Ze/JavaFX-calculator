package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Calculator extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculator.fxml"));
			Parent root = loader.load();	
			CalculatorController controller = loader.getController();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
			
			scene.setOnKeyPressed(event -> {

					switch(event.getCode()) {
					
					case ENTER:
						controller.equal_click();
						//System.out.println(event.getCode());
						break;
					case A:
						controller.ac_click();
						break;
					case C:
						controller.ce_click();
						break;
					case BACK_SPACE:
						controller.bs_click();
						break;
					case PERIOD:
						controller.dot_click();
						break;
					case DIGIT1:
						controller.one_click();
						break;
					case DIGIT2:
						controller.two_click();
						break;
					case DIGIT3:
						controller.three_click();
						break;
					case DIGIT4:
						controller.four_click();
						break;
					case DIGIT5:
						controller.five_click();
						break;
					case DIGIT6:
						controller.six_click();
						break;
					case DIGIT7:
						controller.seven_click();
						break;
					case DIGIT8:
						if(event.isShiftDown()) {
							controller.mutiple_click();
							break;
						}else {
							controller.eight_click();
							break;
						}
					case DIGIT9:
						controller.nine_click();
						break;
					case DIGIT0:
						controller.zero_click();
						break;
					case SLASH:
						controller.devide_click();
						break;
					case MINUS:
						controller.minus_click();
						break;
					case EQUALS:
						if(event.isShiftDown()) {
							controller.plus_click();
							break;
						}else {
							controller.equal_click();
							break;
						}
					case N:
						controller.negative_click();
						break;
					default:
						break;
					}		
			});
			
			stage.setTitle("Calculator");
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}