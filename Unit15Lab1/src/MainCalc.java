import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.event.*;

public class MainCalc extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Calculator");
		
		FlowPane rootNode = new FlowPane();
		
		Scene mainMenu = new Scene(rootNode,255,255);
		rootNode.setPadding(new Insets(15));
		primaryStage.setResizable(false);
		rootNode.setAlignment(Pos.CENTER);
		Button calcButton = new Button("Calculate");
		Calculate calculatebutton= new Calculate();
		calculatebutton.FirstValueIn.setOnAction(calculatebutton);
		calculatebutton.SecondValueIn.setOnAction(calculatebutton);
		calcButton.setOnAction(calculatebutton);
		Label FirstValue=new Label("First Value: ");
		rootNode.getChildren().addAll(FirstValue,calculatebutton.FirstValueIn);
		Label SecondValue=new Label("Second Value: ");
		rootNode.getChildren().addAll(SecondValue,calculatebutton.SecondValueIn);
		Label Output=new Label("Sum: ");
		rootNode.getChildren().addAll(Output,calculatebutton.OutputIn,calcButton);
		 primaryStage.setScene(mainMenu);
		
		primaryStage.show();
	}
	
	public void init(){
		
	}
	
	public void stop(){
		
	}

}
