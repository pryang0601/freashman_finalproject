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
public class Long1000Controller {

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
		web.getEngine().load("https://www.nihow.tw/product/1c3b913c-476a-403f-95e0-44598804cae4");
	}
	public void showlink2() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6966695");
	}
	public void showlink3() {
		web.getEngine().load("https://chuu.com.tw/product/時尚滿分好搭短袖襯衫no-time-to-wait-shirt/36308/?cate_no=36&display_group=1#.YLd8Ly3RZQI");
	}
	public void showlink4() {
		web.getEngine().load("https://www.jendesstudio.com/product/4de580b9-b440-4418-9957-fd48d8b1e03e?c=a3236ff9-34a3-4c52-9f6b-4003358a6a4c");
	}
	public void showlink5() {
		web.getEngine().load("https://www.plain-me.com/women/product-detail/JSDW000400001");
	}
	public void showlink6() {
		web.getEngine().load("https://www.suitangtang.com/Product/1646?c=7&m=107");
	}
	public void showlink7() {
		web.getEngine().load("https://justonemall.tw/product/抽繩連帽混亞麻短袖t恤/9336/?cate_no=45&display_group=1&crema-widget-share-review-translation=on");
	}
	public void showlink8() {
		web.getEngine().load("https://www.lurehsu.com/zh-TW/Lure/product?SaleID=20210310000003&ColorID=A29");
	}
	public void showlink9() {
		web.getEngine().load("https://tw.stylenanda.com/product/相片印花寬鬆短袖t恤6月30日開始按購買先後順序進行配送/255099/?");
	}
	public void showlink10() {
		web.getEngine().load("https://www.jendesstudio.com/product/dd37a2a7-6045-44be-ae86-66be2d3f35a5?c=a3236ff9-34a3-4c52-9f6b-4003358a6a4c");
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
