package application;

import java.rmi.Naming;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class scene0Controller 
{	
	@FXML 
	Button button0;
	@FXML
	Label mylab;
	
	
	public void connect(ActionEvent event)
	{
		try {
			zed stub=(zed)Naming.lookup("rmi://localhost:1099/BK");
		    System.out.println(stub.conversion(70));
		    System.out.println(stub.getServerDate());
		    String a =stub.getServerDate().toString();
		    mylab.setText(a);
		    }
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
