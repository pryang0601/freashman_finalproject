package final_project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class Shirt1000Controller {

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
		web.getEngine().load("https://www.jendesstudio.com/product/722dcd3c-69b4-4051-8ce1-8af9c8c3eaf3?c=ef8e24e8-c99b-4891-a4bd-1b54211bea4d");
	}
	public void showlink2() {
		web.getEngine().load("https://www.jendesstudio.com/product/48713c89-d031-43a0-96c0-087e5dcc373c?c=ef8e24e8-c99b-4891-a4bd-1b54211bea4d");
	}
	public void showlink3() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6957679");
	}
	public void showlink4() {
		web.getEngine().load("https://www.lurehsu.com/zh-TW/Lure/product?SaleID=20210518000002&ColorID=A02");
	}
	public void showlink5() {
		web.getEngine().load("https://www.timberland.com.tw/products/a2cs8100-womens-mesh-layer-back-logo-sporty-dress/");
	}
	public void showlink6() {
		web.getEngine().load("https://tw.urbanoutfitters.com/zh-tw/product/uo-nova-ruffle-frock-dress/UO-61651840-000?color=blue&size=xs");
	}
	public void showlink7() {
		web.getEngine().load("https://www.suitangtang.com/Product/2292?c=11&m=91");
	}
	public void showlink8() {
		web.getEngine().load("https://www.suitangtang.com/Product/2323?c=95&m=91");
	}
	public void showlink9() {
		web.getEngine().load("https://www.dickies.com.tw/SalePage/Index/6352620");
	}
	public void showlink10() {
		web.getEngine().load("https://www.roots.com.tw/ProductList/Detail/15102?cid=2503");
	}
	@FXML
	private void BackPage() throws IOException {
		Parent choose_cloths=FXMLLoader.load(getClass().getResource("choose.fxml"));  
		Scene choosescene=new Scene(choose_cloths);
		choosescene.getRoot().requestFocus();
		final_project.currentStage.setScene(choosescene);
		final_project.currentStage.setTitle("Choose Cloths");
	}
	@FXML
	private void onExitPressed() {
		final_project.currentStage.close();;
	}
}
