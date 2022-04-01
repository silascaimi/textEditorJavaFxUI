package br.com.silascaimi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Editor de texto");

		BorderPane root = new BorderPane();

		TextArea txtContent = new TextArea();
		txtContent.setFont(Font.font("Courier New", 14));
		root.setCenter(txtContent);

		Menu menuFile = new Menu("_Arquivo"); // Undescore para criar atalho
		MenuItem menuItemExit = new MenuItem("_Sair");
		menuFile.getItems().add(menuItemExit);
		MenuBar menuBar = new MenuBar(menuFile);
		root.setTop(menuBar);
		
		Button btnGravar = new Button("Gravar");
		Button btnCancelar = new Button("Cancelar");
		
		HBox buttonBox = new HBox(5, btnGravar, btnCancelar);
		buttonBox.setPadding(new Insets(10));
		buttonBox.setAlignment(Pos.CENTER_RIGHT);
		root.setBottom(buttonBox);

		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

}