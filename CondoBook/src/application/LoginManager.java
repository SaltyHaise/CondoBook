package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginManager implements Welcome{
	void userLogin(ActionEvent event) {
		userWelcome("UserMenu.fxml");
		closeWindow(event);
		System.out.println(CurrentUser.getInstance().getCurrentUser() + "(User) has logged in.");
	}
	
	void adminLogin(ActionEvent event) {
		userWelcome("UserMenu.fxml");
		closeWindow(event);
		System.out.println(CurrentUser.getInstance().getCurrentUser() + "(Admin) has logged in.");
	}

}
