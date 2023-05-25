package phbmediaplayer;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class PHBMediaPlayer {
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FMXLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("PHB Media Player");
        scene.setOnMouseClicked((MouseEvent event) -> {
            if(event.getClickCount() == 2){
                stage.setFullScreen(true);
            }
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
