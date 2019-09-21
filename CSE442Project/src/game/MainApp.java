package game;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Coding Game");

        initRootLayout();

        showMenuPanel();
        
        //showUserProfilePanel();
        
        //showAddNewUserPanel();
        
    }
    
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the menu panel inside the root layout.
     */
    public void showMenuPanel() {
        try {
            // Load menu panel.
            FXMLLoader loader = new FXMLLoader();
            FXMLLoader.setDefaultClassLoader(Thread.currentThread().getContextClassLoader());
            loader.setLocation(MainApp.class.getResource("view/MenuPanel.fxml"));
            AnchorPane menuPanel = (AnchorPane) loader.load();
            
            // Set menu panel into the center of root layout.
            rootLayout.setCenter(menuPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Shows the user profile panel inside the root layout.
     */
    public void showUserProfilePanel() {
        try {
            // Load user profile panel.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/UserProfilePanel.fxml"));
            AnchorPane menuPanel = (AnchorPane) loader.load();
            
            // Set user profile panel into the center of root layout.
            rootLayout.setCenter(menuPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showAddNewUserPanel() {
        try {
            // Load user profile panel.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/AddNewUserPanel.fxml"));
            AnchorPane menuPanel = (AnchorPane) loader.load();
            
            // Set user profile panel into the center of root layout.
            rootLayout.setCenter(menuPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
