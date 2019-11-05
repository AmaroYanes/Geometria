package dad.javafx.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends VBox {
	
	private TextField anchoText;
	private TextField altoText;
	private Rectangle rectanguloShape;
	private Label areaText;
	private Label perimetroText;
	
	
	public RectanguloView() {
		super();
		
		anchoText = new TextField();
		anchoText.setPrefColumnCount(5);
		
		HBox anchoBox = new HBox(5, new Label("Ancho:"), anchoText);
		anchoBox.setAlignment(Pos.BASELINE_CENTER);

		altoText = new TextField();
		altoText.setPrefColumnCount(5);
		
		HBox altoBox = new HBox(5, new Label("Alto:"), altoText);
		altoBox.setAlignment(Pos.BASELINE_CENTER);
		
	
		areaText = new Label();
		
		HBox areaBox = new HBox(5, new Label("Area: "),areaText);
		areaBox.setAlignment(Pos.BASELINE_CENTER);
		
		perimetroText = new Label();
		
		HBox perimetroBox = new HBox(5, new Label("Perimetro: "),perimetroText);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);
		
		rectanguloShape = new Rectangle(100, 50);
		rectanguloShape.setFill(Color.AQUAMARINE);
		rectanguloShape.setStroke(Color.DARKBLUE);
		rectanguloShape.setStrokeWidth(2);
		
		this.setSpacing(5);
		this.setAlignment(Pos.TOP_CENTER);
		this.getChildren().addAll(anchoBox, altoBox, rectanguloShape,areaBox,perimetroBox);
		this.setPadding(new Insets(5));	
	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public Rectangle getRectanguloShape() {
		return rectanguloShape;
	}
	
}
