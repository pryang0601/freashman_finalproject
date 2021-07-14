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
public class LongManController {

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
	public void showlink() {
		web.getEngine().load("https://www.korealine.com.tw/product.php?no=LR20456");
	}
	public void showlink2() {
		web.getEngine().load("https://www.korealine.com.tw/product.php?no=IA5N363");
	}
	public void showlink3() {
		web.getEngine().load("https://junique-kr.com/product/渲染落肩寬鬆短tee-2色/");
	}
	public void showlink4() {
		web.getEngine().load("https://store.searchx.asia/products/棒棒糖亞麻休閒褲");
	}
	public void showlink5() {
		web.getEngine().load("https://www.caco.com.tw/mainitem//B1DI135/63//caco-men-brand15?pmotid=");
	}
	public void showlink6() {
		web.getEngine().load("https://www.check2check.com.tw/pitem/M00028818");
	}
	public void showlink7() {
		web.getEngine().load("https://www.genquo.com/zh-tw/market/n/413?c=1225");
	}
	public void showlink8() {
		web.getEngine().load("https://www.hitobp.com.tw/product_detail?product_sn=4849&standard_sn=36704");
	}
	public void showlink9() {
		web.getEngine().load("https://www.fuzytw.com/products/厚磅-雪山-冒險tee-落肩-短袖-寬鬆-短t-三色-s201319?gclid=Cj0KCQjw2NyFBhDoARIsAMtHtZ6l1cueykCNUcseZZI0OGI84CN7HsfByOlUS164h4VrHrWsO1PtBCQaAszrEALw_wcB&variation=5e9f97513a326d001cc873d1");
	}
	public void showlink10() {
		web.getEngine().load("https://junique-kr.com/product/素面牛仔直筒寬褲-3色/");
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
