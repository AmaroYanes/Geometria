package dad.javafx.view;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TrianguloView extends VBox {
	
	private TextField baseText;
	private TextField alturaText;
	private Triangle trianguloShape;
	private Label areaText;
	private Label perimetroText;
	

	public TrianguloView() {
		super();

		baseText = new TextField();
		baseText.setPrefColumnCount(5);
		
		HBox baseBox = new HBox(5, new Label("Base:"), baseText);
		baseBox.setAlignment(Pos.BASELINE_CENTER);

		alturaText = new TextField();
		alturaText.setPrefColumnCount(5);
		
		HBox alturaBox = new HBox(5, new Label("Altura:"), alturaText);
		alturaBox.setAlignment(Pos.BASELINE_CENTER);
		
		areaText = new Label();
		
		HBox areaBox = new HBox(5, new Label("Area: "),areaText);
		areaBox.setAlignment(Pos.BASELINE_CENTER);
		
		perimetroText = new Label();
		
		HBox perimetroBox = new HBox(5, new Label("Perimetro: "),perimetroText);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);
		
		
		trianguloShape = new Triangle();
		trianguloShape.setFill(Color.AQUAMARINE);
		trianguloShape.setStroke(Color.DARKBLUE);
		trianguloShape.setStrokeWidth(2);
		
		setSpacing(5);
		setAlignment(Pos.TOP_CENTER);
		getChildren().addAll(baseBox, alturaBox, trianguloShape,areaBox,perimetroBox);
		setPadding(new Insets(5));
		
	}

	public TextField getBaseText() {
		return baseText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public Triangle getTrianguloShape() {
		return trianguloShape;
	}
	
}
