package final_project;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
public class DressController {

	@FXML
	 private ImageView shirt1;
	@FXML
	 private ImageView shirt2;
	@FXML
	 private ImageView shirt3;
	@FXML
	 private ImageView shirt4;
	@FXML
	 private ImageView shirt5;
	@FXML
	 private ImageView shirt6;
	@FXML
	 private ImageView shirt7;
	@FXML
	 private ImageView shirt8;
	@FXML
	 private ImageView shirt9;
	@FXML
	 private ImageView shirt10;
	@FXML
	private WebView web;
	@FXML
	private Button back;
	@FXML
	private Button exit;
	public void showlink1() {
		web.getEngine().load("https://www.meierq.com/en-us/market/n/9040?c=23555");
	}
	public void showlink2() {
		web.getEngine().load("https://www.meierq.com/en-us/market/n/9106?c=23735");
	}
	public void showlink3() {
		web.getEngine().load("https://www.ajpeace.com.tw/index.php?app=goods&id=4795");
	}
	public void showlink4() {
		web.getEngine().load("https://www.ajpeace.com.tw/index.php?app=goods&id=2113");
	}
	public void showlink5() {
		web.getEngine().load("https://www.louis2014.co/products/051117");
	}
	public void showlink6() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/17167?c=38204");
	}
	public void showlink7() {
		web.getEngine().load("https://www.thebirthmark.co/products/兩件式不收邊套裝裙");
	}
	public void showlink8() {
		web.getEngine().load("https://www.roshop.tw/products/roshop-made♡一眼被美到の高級感棉麻長洋-蜜桃紅茶");
	}
	public void showlink9() {
		web.getEngine().load("https://www.oreal.tw/products/約會首選法式女孩の碎花洋-白");
	}
	public void showlink10() {
		web.getEngine().load("https://www.roshop.tw/products/私心款不用動腦就可出門的超韓棉質套裝-黑");
	}
	@FXML
	private void BackPage() throws IOException {
		Parent choose_cloth=FXMLLoader.load(getClass().getResource("choose.fxml"));  
		Scene choosescene=new Scene(choose_cloth);
		choosescene.getRoot().requestFocus();
		final_project.currentStage.setScene(choosescene);
		final_project.currentStage.setTitle("Choose Cloths");
	}
	@FXML
	private void onExitPressed() {
		final_project.currentStage.close();;
	}
}
