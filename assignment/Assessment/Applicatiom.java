import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 public class (DrawLines) extends Application {

 public void start(Stage stage) throws Exception {
 
 Parent root = 
 FXMLLoader.load(getClass().getResource( "DrawLines.fxml"));

 Scene scene = new Scene(root); 
 stage.setTitle("Draw Lines" ); 
 stage.setScene(scene); 
 stage.show(); 
 }

 
public static void main(String[] args) {
launch(args); 
}
}