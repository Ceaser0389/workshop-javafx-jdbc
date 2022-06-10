package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
    // atributo para ref Scene
	private static Scene mainScene;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass()
			.getResource("/gui/MainView.fxml"));
			
			ScrollPane scrollPane  = loader.load();
		    mainScene = new Scene(scrollPane);
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//metodo aux p pegar o atributo mainScene
	public static Scene getMainScene() {
		return mainScene;
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
