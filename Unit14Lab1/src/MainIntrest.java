import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainIntrest extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Loan Calcuator");
		
		FlowPane rootNode = new FlowPane();
		
		Scene mainMenu = new Scene(rootNode,255,255);
		rootNode.setPadding(new Insets(15));
		primaryStage.setResizable(false);
		rootNode.setAlignment(Pos.CENTER_LEFT);
		Label interestRate=new Label("Annual Intrest Rate: ");
		TextField interestRateIn = new TextField();
		Button calcButton = new Button("Calculate");
		rootNode.getChildren().addAll(interestRate,interestRateIn);
		Label noYears=new Label("Number of Years:    ");
		TextField noYearsIn = new TextField();
		rootNode.getChildren().addAll(noYears,noYearsIn);
		Label loanAmmt=new Label("Loan Amount:         ");
		TextField loanAmmtIn = new TextField();
		rootNode.getChildren().addAll(loanAmmt,loanAmmtIn);
		Label paymentPerMonth=new Label("Monthly Payment:  ");
		TextField paymentPerMonthIn = new TextField();
		rootNode.getChildren().addAll(paymentPerMonth,paymentPerMonthIn);
		Label totalPayment = new Label("Total Payment:       ");
		TextField totalPaymentIn = new TextField(); 
		Label place=new Label("              	                                  ");
		rootNode.getChildren().addAll(totalPayment,totalPaymentIn,place,calcButton);
		primaryStage.setScene(mainMenu);
		
		primaryStage.show();
	}
	
	public void init(){
		
	}
	
	public void stop(){
		
	}

}
