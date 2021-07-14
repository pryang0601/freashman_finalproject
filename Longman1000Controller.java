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
public class Longman1000Controller {

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
		web.getEngine().load("https://www.nihow.tw/product/f5333f20-ed34-42ae-abfc-1b2c88f561c8");
	}
	public void showlink2() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/7003294");
	}
	public void showlink3() {
		web.getEngine().load("https://www.zetastudio.tw/products/21520206");
	}
	public void showlink4() {
		web.getEngine().load("https://www.baoli.championusa.com.tw/p/C3-S211-780");
	}
	public void showlink5() {
		web.getEngine().load("https://www.plain-me.com/men/product-detail/CRV004800004");
	}
	public void showlink6() {
		web.getEngine().load("https://www.zetastudio.tw/products/21520180");
	}
	public void showlink7() {
		web.getEngine().load("https://store.searchx.asia/products/舊金山相片短tee");
	}
	public void showlink8() {
		web.getEngine().load("https://www.nihow.tw/product/5812cdf3-ac29-40f9-8fa9-ff38f9136ca8");
	}
	public void showlink9() {
		web.getEngine().load("https://store.searchx.asia/products/絲光條紋短tee-cate-daily");
	}
	public void showlink10() {
		web.getEngine().load("https://www.gap.tw/pdp/000695441/1_000695441_M214-32813");
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
