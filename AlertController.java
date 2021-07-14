package final_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class AlertController implements Initializable {
	temalert t=new temalert();
	lowalert l=new lowalert();
	bsalert bsa=new bsalert();
	rainalert raina=new rainalert();
	weatheralert weathera=new weatheralert();
	@FXML
	TextArea temperature;
	@FXML
	TextArea low;
	@FXML
	TextArea bs;
	@FXML
	TextArea rain;
	@FXML
	TextArea weather;
	@FXML
	Button back;
	@FXML
	Button end;
	@FXML
	public void onBackPressed() throws IOException {
		Parent select=FXMLLoader.load(getClass().getResource("select.fxml"));
		Scene selectscene=new Scene(select);
		selectscene.getRoot().requestFocus();
		final_project.currentStage.setScene(selectscene);
		final_project.currentStage.setTitle("WEATHER");
		//final_project.search++;
	}
	@FXML
	public void onEndPressed() {
		final_project.currentStage.close();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		t.get_temalert(final_project.temalert);
		temperature.setText(final_project.temalert);
		l.get_lowalert(final_project.lowalert);
		low.setText(final_project.lowalert);
		bsa.get_bsalert(final_project.bsalert);
		bs.setText(final_project.bsalert);
		raina.get_rainalert(final_project.rainalert);
		rain.setText(final_project.rainalert);
		weathera.get_weatheralert(final_project.weatheralert);
		weather.setText(final_project.weatheralert);
		
	}
	
	
}
