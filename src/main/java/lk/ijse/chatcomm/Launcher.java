package lk.ijse.chatcomm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.setResizable(false);
        //stage.centerOnScreen();
        stage.setTitle("Chat Comm");
        stage.show();
    }
}