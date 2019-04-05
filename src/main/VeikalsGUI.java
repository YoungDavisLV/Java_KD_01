package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.Check;
import model.Phone;
import model.Product;
import model.Bread;
import model.BreadType;
import model.PhoneManufacturer;
	


public class VeikalsGUI extends Application{
	Stage stage;
	Phone p1 = new Phone(300, "Galaxy S10", 10, (short)16, PhoneManufacturer.Samsung, (short) 12);
    Phone p2 = new Phone(255.15f, "X23", 24,(short) 8, PhoneManufacturer.SonyEricson, (short)6);
    Bread b1 = new Bread(1.12f, "Fazer", 99, 0.5f , new java.util.Date(System.currentTimeMillis()), BreadType.FullGrain);
    Bread b2 = new Bread(0.99f, "Kemeru", 49, 0.75f  , new java.util.Date(System.currentTimeMillis()), BreadType.WhiteBread);
    
	public static void main(String[] args) {
		launch(args);

	}



	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

		stage = arg0;
		VBox vBox = new VBox();
		
		Scene shoppingScene = new Scene(vBox, 600, 500);
		arg0.setTitle("Veikals VEA");
		
		Label l1 = new Label ("Izvelieties preci uzspiezot uz tas: ");
		l1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		Button telefons1 = new Button("Telefons: " + p1 );
		Button telefons2 = new Button("Telefons: " + p2);
		
		Button maize1 = new Button("Maize: " + b1);
		Button maize2 = new Button("Maize: " + b2);
		
		
	   
		vBox.getChildren().addAll(l1,telefons1, telefons2, maize1, maize2);
		
		arg0.setScene(shoppingScene);
		arg0.show();
	}
	}


	

	
