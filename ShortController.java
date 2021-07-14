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
public class ShortController {

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
		web.getEngine().load("https://www.irisgarden.com.tw/products/方領小花上衣");
	}
	public void showlink2() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18590?c=41591");
	}
	public void showlink3() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18720?c=41912");
	}
	public void showlink4() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18620?c=41673");
	}
	public void showlink5() {
		web.getEngine().load("https://www.eshop1996.com.tw/product/0938c588-6fb3-4e09-9b43-7dd8de086871");
	}
	public void showlink6() {
		web.getEngine().load("https://www.queenshop.com.tw/zh-TW/QueenShop/Product?item1=11&item2=01&item3=PAN&SaleID=04130125");
	}
	public void showlink7() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18321?c=40967");
	}
	public void showlink8() {
		web.getEngine().load("https://sonyunara.tw/shop/view.php?index_no=76786&cate=0201");
	}
	public void showlink9() {
		web.getEngine().load("https://906studio.tw/product/精選特惠-多口袋金屬釦吊帶短褲/3099/?cate_no=123&display_group=1#none");
	}
	public void showlink10() {
		web.getEngine().load("https://www.pazzo.com.tw/zh-tw/market/n/18139?c=40507");
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
