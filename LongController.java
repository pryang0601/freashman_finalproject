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
public class LongController {

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
		web.getEngine().load("https://www.scheminggg.com/product?saleid=2105200022");
	}
	public void showlink2() {
		web.getEngine().load("https://www.scheminggg.com/product?saleid=2105200022");
	}
	public void showlink3() {
		web.getEngine().load("https://www.seoulmate.com.tw/product.php?m=115&s=339&t=0&id=4292");
	}
	public void showlink4() {
		web.getEngine().load("https://www.genquo.com/zh-tw/market/n/1878?c=5866");
	}
	public void showlink5() {
		web.getEngine().load("https://www.genquo.com/zh-tw/market/n/2162?c=6600");
	}
	public void showlink6() {
		web.getEngine().load("https://www.muura.com.tw/長褲?product_id=3626");
	}
	public void showlink7() {
		web.getEngine().load("https://www.minimatters.com.tw/zh-cht/kant/Product?SaleID=2008140009&ColorID=068");
	}
	public void showlink8() {
		web.getEngine().load("https://sonyunara.tw/shop/view.php?index_no=78110&cate=0201");
	}
	public void showlink9() {
		web.getEngine().load("https://www.50-shop.com/Shop/itemDetail.aspx?mNo1=02189810005&cno=38150&m=6&p=498");
	}
	public void showlink10() {
		web.getEngine().load("https://www.minimatters.com.tw/zh-cht/kant/Product?SaleID=2012010014&ColorID=001");
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
