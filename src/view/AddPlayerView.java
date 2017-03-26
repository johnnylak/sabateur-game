package view;

import controller.BackToWelcomeListener;
import controller.PlayGameListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import controller.createContent;

public class AddPlayerView {
	
	private int numPlayers;
	
	private Stage stage;
	
	public AddPlayerView(Stage stage) {
		
		this.stage = stage;
		
	}
	
	public void displayView() {
		
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER_LEFT);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 85));
		root.setPrefSize(860, 600);
		root.setGridLinesVisible(true);

		stage.setTitle("G2 Sabateur");

		createContent.Title title = new createContent.Title("test");
		Text sceneTitle = new Text("Add Players");
		sceneTitle.setId("title-text");
		root.add(sceneTitle, 0, 0, 2, 1);
		
		numPlayers = 3;
		
		for (int i = 0; i < numPlayers; i++) {
			
			
			
			Label name = new Label(i+1 + ". Player Name");
			root.add(name, 0, i+1);
			
			TextField nameTextField = new TextField();
			root.add(nameTextField, 1, i+1);
			
		}
		
		Button addPlayerBtn = new Button("+");
		root.add(addPlayerBtn, 2, 0);
		
		addPlayerBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				if (numPlayers < 6) {
					
					numPlayers++;
										
					Label name = new Label(numPlayers + ". Player Name");
					root.add(name, 0, numPlayers);
					
					TextField nameTextField = new TextField();
					root.add(nameTextField, 1, numPlayers);
					
				}
				
			}		
			
		});
		
		Button backBtn = new Button("Back");
		
		Button playBtn = new Button("Play");
		
		playBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				PlayGameListener playGameListener = new PlayGameListener();
				playGameListener.changeScene(stage);
				
			}		
			
		});
		
		backBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				BackToWelcomeListener backListener = new BackToWelcomeListener();
				backListener.backToWelcome(stage);
				
			}		
			
		});
		
		HBox hbButtons = new HBox();
		hbButtons.getChildren().add(backBtn);
		hbButtons.getChildren().add(playBtn);
		hbButtons.setPadding(new Insets(25, 0, 0, 0));
		hbButtons.setAlignment(Pos.CENTER);
		hbButtons.setSpacing(300);
		
		VBox vBox = new VBox();
		vBox.getChildren().add(root);
		vBox.getChildren().add(hbButtons);
		
		Scene scene = new Scene(vBox, MainView.SCENE_WIDTH, MainView.SCENE_HEIGHT);
		
		stage.setScene(scene);
		scene.getStylesheets().add(AddPlayerView.class.getResource("style.css").toExternalForm());
		
	}

}
