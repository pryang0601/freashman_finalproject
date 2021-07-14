package final_project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

public class ShortController1000 {
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
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/7080491");
	}
	public void showlink2() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/7003265");
	}
	public void showlink3() {
		web.getEngine().load("https://tw.stylenanda.com/product/拉鍊背心細肩帶背心套裝6月21日開始按購買先後順序進行配送/255089/?cate_no=505&display_group=1");
	}
	public void showlink4() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6951989");
	}
	public void showlink5() {
		web.getEngine().load("product/bdg-bromley-henley-top/UO-61620803-000?color=assorted-stripe&size=xs");
	}
	public void showlink6() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/6945885");
	}
	public void showlink7() {
		web.getEngine().load("https://tw.hconnect.com/SalePage/Index/7003262");
	}
	public void showlink8() {
		web.getEngine().load("https://www.chooshop.com.tw/products/6125700500-1");
	}
	public void showlink9() {
		web.getEngine().load("https://www.timberland.com.tw/products/a2ct6a58-womens-utility-shorts/");
	}
	public void showlink10() {
		web.getEngine().load("https://tw.urbanoutfitters.com/zh-tw/product/bdg-high-waisted-skate-short-black-denim/UO-60011863-000?color=washed-black&size=xxs");
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
