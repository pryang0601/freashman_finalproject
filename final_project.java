package final_project;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class final_project extends Application {
	public static int count=0;
	public static int search=0;
	public static Stage currentStage;
	public static Scene selectscene;
	public static String tem_record="0";
	public static String weather_record="";
	public static int city_record;
	public static int gender_record;
	public static int budget_record;
	public static ArrayList option_city=new ArrayList();
	public static ArrayList result_tem=new ArrayList();
	public static ArrayList result_weather=new ArrayList();
	public static String temalert="";
	public static String lowalert="";
	public static String bsalert="";
	public static String rainalert="";
	public static String weatheralert="";
	@Override
	public void start(Stage primaryStage)throws Exception {
		currentStage=primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("select.fxml"));
		selectscene=new Scene(root);
        currentStage.setTitle("WEATHER");
        currentStage.setScene(selectscene);
        currentStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);

	}
	public static void plus() {
		count++;
	}
	public static int return_count() {
		return count;
	}
}