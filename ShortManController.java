package final_project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class ShortManController {
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
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02158310006&cno=39340&m=5&p=13");
	}
	@FXML
	public void showlink2() {
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02159050002&cno=38478&m=5&p=13");
	}
	@FXML
	public void showlink3() {
		web.getEngine().load("https://www.gu-global.com/tw/store/goods/330226#thumbnailSelect");
	}
	@FXML
	public void showlink4() {
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02158350006&cno=38878&m=5&p=13");
	}
	@FXML
	public void showlink5() {
		web.getEngine().load("https://www.net-fashion.net/product/335955");
	}
	@FXML
	public void showlink6() {
		web.getEngine().load("https://www.gu-global.com/tw/store/goods/331859");
	}
	@FXML
	public void showlink7() {
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02158030002&cno=38581&m=5&p=13");
	}
	@FXML
	public void showlink8() {
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02159250002&cno=38375&m=5&p=13");
	}
	@FXML
	public void showlink9() {
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02159010002&cno=38947&m=5&p=13");
	}
	@FXML
	public void showlink10() {
		web.getEngine().load("https://www.gu-global.com/tw/store/goods/334113?rrec=true#thumbnailSelect");
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
