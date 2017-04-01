import javafx.event.*;
import javafx.scene.control.TextField;

public class Calculate implements EventHandler<ActionEvent> {

	TextField FirstValueIn=new TextField();
	TextField SecondValueIn=new TextField();
	TextField OutputIn=new TextField();
	public void handle(ActionEvent event) {
		try{
			int first=Integer.parseInt(FirstValueIn.getText());
			int second=Integer.parseInt(SecondValueIn.getText());
			OutputIn.setText(Integer.toString((first+second)));
		}catch(NumberFormatException e){
			System.err.println("Not a Integer!");
		}
		
		
	}

}
