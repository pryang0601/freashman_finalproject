package final_project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class ShortManController1000 {
	@FXML
	 private ImageView pic1;
	@FXML
	 private ImageView pic2;
	@FXML
	private WebView web;
	@FXML
	 private ImageView pic3;
	@FXML
	 private ImageView pic4;
	@FXML
	 private ImageView pic5;
	@FXML
	 private ImageView pic6;
	@FXML
	 private ImageView pic7;
	@FXML
	 private ImageView pic8;
	@FXML
	 private ImageView pic9;
	@FXML
	 private ImageView pic10;
	@FXML
	private Button back;
	@FXML
	private Button exit;
	@FXML
	public void showlink() {
		web.getEngine().load("https://www.levi.com.tw/detail.html?productId=4367");
	}
	@FXML
	public void showlink2() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6968106");
	}
	@FXML
	public void showlink3() {
		web.getEngine().load("https://yuppie.cyberbiz.co/products/202103297704");
	}
	@FXML
	public void showlink4() {
		web.getEngine().load("https://www.korealine.com.tw/product.php?no=FD1121561");
	}
	@FXML
	public void showlink5() {
		web.getEngine().load("https://www.baoli.championusa.com.tw/p/C3-P511-073");
	}
	@FXML
	public void showlink6() {
		web.getEngine().load("https://www.baoli.championusa.com.tw/p/C3-S309-655");
	}
	@FXML
	public void showlink7() {
		web.getEngine().load("https://www.baoli.championusa.com.tw/p/C3-M513-090");
	}
	@FXML
	public void showlink8() {
		web.getEngine().load("https://www.baoli.championusa.com.tw/p/C3-R506-790");
	}
	@FXML
	public void showlink9() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6951852");
	}
	@FXML
	public void showlink10() {
		web.getEngine().load("https://store.searchx.asia/products/海軍標誌休閒短褲");
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
	private void onexitPressed() {
		final_project.currentStage.close();
	}
}
