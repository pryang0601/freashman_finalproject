package final_project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class ShortShirt1000 {
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
		web.getEngine().load("https://www.mouggan.com/zh-tw/market/n/702?c=1461");
	}
	public void showlink2() {
		web.getEngine().load("https://tw.stylenanda.com/product/輕盈混亞麻微a字短裙/256401/?cate_no=569&display_group=1");
	}
	public void showlink3() {
		web.getEngine().load("https://tw.attrangs.com/product/bs6026-方形領佩斯利雪紡衫/68413/?cate_no=124&display_group=2");
	}
	public void showlink4() {
		web.getEngine().load("https://www.jendesstudio.com/product/5952cdf8-9cb3-4274-9dbb-725e8ec29430?c=a3236ff9-34a3-4c52-9f6b-4003358a6a4c");//
	}
	public void showlink5() {
		web.getEngine().load("https://www.roxytaiwan.com.tw/WINTER+CATCHER+上衣-TW_ERJWT03472?default=717714");
	}
	public void showlink6() {
		web.getEngine().load("https://www.jendesstudio.com/product/15c352a3-c435-4055-b7a9-c4b017618c24?c=a3236ff9-34a3-4c52-9f6b-4003358a6a4c");//
	}
	public void showlink7() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6951966");
	}
	public void showlink8() {
		web.getEngine().load("https://906studio.tw/product/仿舊水洗棉質a字短裙/3033/?cate_no=125&display_group=1");
	}
	public void showlink9() {
		web.getEngine().load("https://www.jendesstudio.com/product/887c7864-5fa2-40d4-87df-4fc586651716?c=8a616bb9-2c47-4c80-809d-916727922aaf");
	}
	public void showlink10() {
		web.getEngine().load("https://www.mercci22.com/zh-tw/market/n/1459?c=3091");
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
