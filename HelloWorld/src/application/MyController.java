package application;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.DataTruncation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class MyController implements Initializable{
	@FXML
	private Button myButton;
	
	@FXML
	private TextField textDate;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void ShowDateTime (ActionEvent event) {
		
		System.out.println("Button Clicked!");
		Date now = new Date();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSSS");
		
		String dateTimeString = df.format(now);
		
		textDate.setText(dateTimeString);
		
	}
	

}
