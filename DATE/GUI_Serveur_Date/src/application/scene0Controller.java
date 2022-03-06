package application;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class scene0Controller 
{	
	@FXML 
	Button button0;
	
	public void connect(ActionEvent event)
	{
		try {
			LocateRegistry.createRegistry(1099);
			implement oi =new  implement();
			System.out.println(oi.toString());
			Naming.rebind("rmi://localhost:1099/BK", oi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
