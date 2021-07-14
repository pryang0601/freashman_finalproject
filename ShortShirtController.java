package final_project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class ShortShirtController {
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
		web.getEngine().load("https://www.ajpeace.com.tw/index.php?app=goods&id=5081");
	}
	public void showlink2() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18631?c=41699");
	}
	public void showlink3() {
		web.getEngine().load("https://www.ajpeace.com.tw/index.php?app=goods&id=5040");
	}
	public void showlink4() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/17924?c=40004");
	}
	public void showlink5() {
		web.getEngine().load("https://www.roshop.tw/products/甜膩小女人方領棉麻上衣");
	}
	public void showlink6() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18236?c=40765");
	}
	public void showlink7() {
		web.getEngine().load("https://www.thebirthmark.co/products/條紋翻領上衣");
	}
	public void showlink8() {
		web.getEngine().load("https://906studio.tw/product/復古韻味水洗感a字短裙/2593/?cate_no=125&display_group=1");
	}
	public void showlink9() {
		web.getEngine().load("https://www.oreal.tw/products/包色款想要天天穿的柔軟坑條上衣-花杏");
	}
	public void showlink10() {
		web.getEngine().load("https://www.net-fashion.net/product/347944");
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
