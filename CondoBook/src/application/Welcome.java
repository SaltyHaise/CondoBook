package application;

public interface Welcome {
	public void userWelcome();
	public void closeWindow();
}
/*
final void userWelcome(String fxml) {
	try {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource(fxml));
		Scene scene2 = new Scene(root,650,400);
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stg = new Stage();
		stg.initModality(Modality.APPLICATION_MODAL);
		stg.setScene(scene2);
		stg.setTitle("Welcome, " + CurrentUser.getInstance().getCurrentUser() + "!");
		stg.show();
	}
	catch(IOException e){
		System.out.println(e.getMessage());
	}
}
final void bookMenu(String fxml) {
	try {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource(fxml));
		Scene scene2 = new Scene(root,700,400);
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stg = new Stage();
		stg.initModality(Modality.APPLICATION_MODAL);
		stg.setScene(scene2);
		stg.setTitle("CondoBook");
		stg.show();
	}
	catch(IOException e){
		System.out.println(e.getMessage());
	}
}
final void closeWindow(ActionEvent event) {
	Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
	window2.close();
}*/