package generic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUI extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane area = new BorderPane();
		primaryStage.setTitle("Factorization example");
		FlowPane center = new FlowPane();
		Label inputLabel = new Label(" = ");
		TextField input = new TextField();
		TextField output = new TextField();
		Button factorize = new Button("factorize");
		output.setEditable(false);
		center.getChildren().addAll(input,inputLabel,output, factorize);
		Pane top = new Pane();
		Pane left = new Pane();
		Pane right = new Pane();
		top.setPrefHeight(250);
		left.setPrefWidth(200);
		right.setPrefWidth(200);
		area.setTop(top);
		area.setLeft(left);
		area.setRight(right);
		area.setCenter(center);
		
		factorize.setOnAction(e -> init(input,output));
		
		Scene main = new Scene(area,600,600);
		primaryStage.setScene(main);
		primaryStage.show();
	}
	
	
	private static void init(TextField t1, TextField t2) {
		try {
			int number = Integer.parseInt(t1.getText());
			
			if(Math.abs(number) == 1) {
				t2.setText("1");
				return;
			}
			
			t2.setText(MainFunction.init(number));
		}
		catch(NumberFormatException e) {
			t2.setText("illegal input");
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}


}
