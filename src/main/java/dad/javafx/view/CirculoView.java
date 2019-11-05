package dad.javafx.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends VBox {
	
	private TextField radioText;
	private Circle circleShape;
	private Label areaText;
	private Label perimetroText;
	
	public CirculoView() {
		super();
		
		radioText = new TextField();
		
		HBox radioBox = new HBox(5, new Label("Radio:"), radioText);
		radioBox.setAlignment(Pos.BASELINE_CENTER);
		
		circleShape = new Circle();
		circleShape.setFill(Color.RED);
		circleShape.setStroke(Color.DARKBLUE);
		circleShape.setStrokeWidth(2);
		
		areaText = new Label();
		
		HBox areaBox = new HBox(5, new Label("Area: "),areaText);
		areaBox.setAlignment(Pos.BASELINE_CENTER);
		
		perimetroText = new Label();
		
		HBox perimetroBox = new HBox(5, new Label("Perimetro: "),perimetroText);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);
		
		this.setSpacing(5);
		this.setAlignment(Pos.TOP_CENTER);
		this.getChildren().addAll(radioBox, circleShape,areaBox,perimetroBox);
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

	public Circle getCircleShape() {
		return circleShape;
	}
}
