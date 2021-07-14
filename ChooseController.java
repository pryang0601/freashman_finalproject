package final_project;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class ChooseController implements Initializable{
	String[] cloths_girl_25= {"短袖短褲","短袖短裙","連身裙"};
	String[] cloths_girl_24= {"短袖短褲","短袖短裙","連身裙","短袖長褲"};
	ObservableList ClothsListGirl25 = FXCollections.observableArrayList(cloths_girl_25);
	ObservableList ClothsListGirl24 = FXCollections.observableArrayList(cloths_girl_24);
	String[] cloths_boy25= {"短袖短褲"};
	String[] cloths_boy24= {"短袖短褲","短袖長褲"};
	ObservableList ClothsListBoy25 = FXCollections.observableArrayList(cloths_boy25);
	ObservableList ClothsListBoy24 = FXCollections.observableArrayList(cloths_boy24);
	double d=Double.parseDouble(final_project.tem_record);
	int i=(int)Math.floor(d);//溫度（字串）轉整數
	@FXML
	ComboBox gender;
	@FXML
	ComboBox budget;
	@FXML
	ComboBox ClothType;
	@FXML
	Button end;
	@FXML
	public void ComSetItems() {
		final_project.gender_record=gender.getSelectionModel().getSelectedIndex();
		if(i>=25) {   //大於等於25度
			if(gender.getSelectionModel().getSelectedIndex()==1)
				ClothType.setItems(ClothsListGirl25);
			else
				ClothType.setItems(ClothsListBoy25);
		}
		else {													//	小於25度
			if(gender.getSelectionModel().getSelectedIndex()==1)
				ClothType.setItems(ClothsListGirl24);
			else
				ClothType.setItems(ClothsListBoy24);
		}
	}
	@FXML
	public void BudgetItems() {
		final_project.budget_record=budget.getSelectionModel().getSelectedIndex();
	}
	@FXML
	public void onEndPressed() {
		final_project.currentStage.close();
	}
	@FXML
	public void showCloths() throws IOException {
		if(gender.getSelectionModel().getSelectedIndex()==1){	//女生
			if(budget.getSelectionModel().getSelectedIndex()==0) {
				if(ClothType.getSelectionModel().getSelectedIndex()==0) {
					final_project.plus();
					Parent Short=FXMLLoader.load(getClass().getResource("short.fxml"));
					Scene Shortscene=new Scene(Short);
					Shortscene.getRoot().requestFocus();
					final_project.currentStage.setScene(Shortscene);
					final_project.currentStage.setTitle("T-shirts & Short Pants");
					final_project.search++;
				}
				else if(ClothType.getSelectionModel().getSelectedIndex()==1) {
					final_project.plus();
					Parent Short=FXMLLoader.load(getClass().getResource("shortshirt.fxml"));
					Scene Shortscene=new Scene(Short);
					Shortscene.getRoot().requestFocus();
					final_project.currentStage.setScene(Shortscene);
					final_project.currentStage.setTitle("T-shirts & Skirts");
					final_project.search++;
				}
				else if(ClothType.getSelectionModel().getSelectedIndex()==2){
					final_project.plus();
					Parent shirt=FXMLLoader.load(getClass().getResource("shirt.fxml"));
					Scene shirtscene=new Scene(shirt);
					shirtscene.getRoot().requestFocus();
					final_project.currentStage.setScene(shirtscene);
					final_project.currentStage.setTitle("Dresses");
					final_project.search++;
				}
				else {
					final_project.plus();
					Parent shirt=FXMLLoader.load(getClass().getResource("long.fxml"));
					Scene shirtscene=new Scene(shirt);
					shirtscene.getRoot().requestFocus();
					final_project.currentStage.setScene(shirtscene);
					final_project.currentStage.setTitle("T-shirts & Pants");
					final_project.search++;
				}
			}
			else {
				if(ClothType.getSelectionModel().getSelectedIndex()==0) {
					final_project.plus();
					Parent Short=FXMLLoader.load(getClass().getResource("short1000.fxml"));
					Scene Shortscene=new Scene(Short);
					Shortscene.getRoot().requestFocus();
					final_project.currentStage.setScene(Shortscene);
					final_project.currentStage.setTitle("T-shirts & Short Pants For Higher Price");
					final_project.search++;
				}
				else if(ClothType.getSelectionModel().getSelectedIndex()==1) {
					final_project.plus();
					Parent Short=FXMLLoader.load(getClass().getResource("shortshirt1000.fxml"));
					Scene Shortscene=new Scene(Short);
					Shortscene.getRoot().requestFocus();
					final_project.currentStage.setScene(Shortscene);
					final_project.currentStage.setTitle("T-shirts & Short Skirts For Higher Price");
					final_project.search++;
				}
				else if(ClothType.getSelectionModel().getSelectedIndex()==2){
					final_project.plus();
					Parent Short=FXMLLoader.load(getClass().getResource("shirt1000.fxml"));
					Scene Shortscene=new Scene(Short);
					Shortscene.getRoot().requestFocus();
					final_project.currentStage.setScene(Shortscene);
					final_project.currentStage.setTitle("Dresses For Higher Price");
					final_project.search++;
				}
				else {
					final_project.plus();
					Parent Short=FXMLLoader.load(getClass().getResource("long1000.fxml"));
					Scene Shortscene=new Scene(Short);
					Shortscene.getRoot().requestFocus();
					final_project.currentStage.setScene(Shortscene);
					final_project.currentStage.setTitle("T-shirts & Pants For Higher Price");
					final_project.search++;
				}
				
			}
		}
		if(gender.getSelectionModel().getSelectedIndex()==0 ){    //男生
			if(budget.getSelectionModel().getSelectedIndex()==0) {
				if(ClothType.getSelectionModel().getSelectedIndex()==0) {
					final_project.plus();
					Parent ShortMan=FXMLLoader.load(getClass().getResource("short_man.fxml"));
					Scene shManscene=new Scene(ShortMan);
					shManscene.getRoot().requestFocus();
					final_project.currentStage.setScene(shManscene);
					final_project.currentStage.setTitle("T-shirts & Short Pants");
					final_project.search++;
				}
				else {
					final_project.plus();
					Parent ShortMan=FXMLLoader.load(getClass().getResource("longman.fxml"));
					Scene shManscene=new Scene(ShortMan);
					shManscene.getRoot().requestFocus();
					final_project.currentStage.setScene(shManscene);
					final_project.currentStage.setTitle("T-shirts & Pants");
					final_project.search++;
				}
			}
			else {
				if(ClothType.getSelectionModel().getSelectedIndex()==0) {
					final_project.plus();
					Parent ShortMan=FXMLLoader.load(getClass().getResource("shortman1000.fxml"));
					Scene shManscene=new Scene(ShortMan);
					shManscene.getRoot().requestFocus();
					final_project.currentStage.setScene(shManscene);
					final_project.currentStage.setTitle("T-shirts & Short Pants For Higher Price");
					final_project.search++;
				}
				else {
					final_project.plus();
					Parent ShortMan=FXMLLoader.load(getClass().getResource("longman1000.fxml"));
					Scene shManscene=new Scene(ShortMan);
					shManscene.getRoot().requestFocus();
					final_project.currentStage.setScene(shManscene);
					final_project.currentStage.setTitle("T-shirts & Pants For Higher Price");
					final_project.search++;
				}
			}	
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String[] Gender= {"男性","女性"};
		ObservableList GenderList = FXCollections.observableArrayList(Gender);
		gender.setItems(GenderList);
		String[] Budget= {"1000以下","1000以上"};
		ObservableList BudgetList = FXCollections.observableArrayList(Budget);
		budget.setItems(BudgetList);
		if(final_project.search!=0) {
			gender.setValue(GenderList.get(final_project.gender_record));
			budget.setValue(BudgetList.get(final_project.budget_record));
			if(i>=25) {
				if(gender.getSelectionModel().getSelectedIndex()==1)
					ClothType.setItems(ClothsListGirl25);
				else
					ClothType.setItems(ClothsListBoy25);
			}
			else {
				if(gender.getSelectionModel().getSelectedIndex()==1)
					ClothType.setItems(ClothsListGirl24);
				else
					ClothType.setItems(ClothsListBoy24);
			}
		}
	}
}
