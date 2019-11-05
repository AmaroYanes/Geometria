package dad.javafx.view;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HexagonoView extends VBox {
	
	
	private TextField radioText;
	private Hexagon hexagonShape;
	private Label areaText;
	private Label perimetroText;

	public HexagonoView() {
		super();
		
		radioText = new TextField();
		
		HBox radioBox = new HBox(5, new Label("Radio:"), radioText);
		radioBox.setAlignment(Pos.BASELINE_CENTER);
		
		areaText = new Label();
		
		HBox areaBox = new HBox(5, new Label("Area: "),areaText);
		areaBox.setAlignment(Pos.BASELINE_CENTER);
		
		perimetroText = new Label();
		
		HBox perimetroBox = new HBox(5, new Label("Perimetro: "),perimetroText);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);
		
		
		hexagonShape = new Hexagon();
		hexagonShape.setFill(Color.RED);
		hexagonShape.setStroke(Color.DARKBLUE);
		hexagonShape.setStrokeWidth(2);
		
		this.setSpacing(5);
		this.setAlignment(Pos.TOP_CENTER);
		this.getChildren().addAll(radioBox, hexagonShape,areaBox,perimetroBox);
		this.setPadding(new Insets(5));	
		
	}

	public TextField getRadioText() {
		return radioText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public Hexagon getHexagonShape() {
		return hexagonShape;
	}
	
}
