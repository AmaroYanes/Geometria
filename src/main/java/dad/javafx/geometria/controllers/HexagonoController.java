package dad.javafx.geometria.controllers;

import dad.javafx.geometria.model.HexagonoModel;
import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.view.HexagonoView;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController extends VBox {
	

	private HexagonoView hexagonoView = new HexagonoView();
	private HexagonoModel hexagonoModel = new HexagonoModel(20.0);

	public HexagonoController() {
		super();

		
		// bindeo modelo y vista 
		hexagonoView.getRadioText().textProperty().bindBidirectional(hexagonoModel.radioProperty(), new NumberStringConverter());
		hexagonoView.getHexagonShape().radiusProperty().bind(hexagonoModel.radioProperty());
		hexagonoView.getPerimetroText().textProperty().bind(hexagonoModel.perimetroProperty().asString());	
		hexagonoView.getAreaText().textProperty().bind(hexagonoModel.areaProperty().asString());
		
	}

	public HexagonoView getHexagonoView() {
		return hexagonoView;
	}
	
	
}
