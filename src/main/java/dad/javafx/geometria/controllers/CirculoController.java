package dad.javafx.geometria.controllers;

import dad.javafx.geometria.model.CirculoModel;
import dad.javafx.view.CirculoView;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class CirculoController extends VBox {
	
	private CirculoModel circuloModel = new CirculoModel(20.0);
	private CirculoView circuloView = new CirculoView();
	
	public CirculoController() {
		super();
		circuloView.getRadioText().textProperty().bindBidirectional(circuloModel.radioProperty(), new NumberStringConverter());
		circuloView.getCircleShape().radiusProperty().bind(circuloModel.radioProperty());
		circuloView.getAreaText().textProperty().bind(circuloModel.areaProperty().asString());
		circuloView.getPerimetroText().textProperty().bind(circuloModel.perimetroProperty().asString());
		
	}

	public CirculoView getCirculoView() {
		return circuloView;
	}
	
}
