package dad.javafx.geometria.controllers;

import dad.javafx.geometria.model.TrianguloModel;
import dad.javafx.view.TrianguloView;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController extends VBox {
	
	private TrianguloModel trianguloModel = new TrianguloModel(20.0,20.0);
	private TrianguloView trianguloView = new TrianguloView();

	public TrianguloController() {
		super();
		trianguloView.getBaseText().textProperty().bindBidirectional(trianguloModel.baseProperty(), new NumberStringConverter());
		trianguloView.getAlturaText().textProperty().bindBidirectional(trianguloModel.alturaProperty(), new NumberStringConverter());
		trianguloView.getTrianguloShape().baseProperty().bind(trianguloModel.baseProperty());
		trianguloView.getTrianguloShape().heightProperty().bind(trianguloModel.alturaProperty());
		trianguloView.getAreaText().textProperty().bind(trianguloModel.areaProperty().asString());
		trianguloView.getPerimetroText().textProperty().bind(trianguloModel.perimetroProperty().asString());
		
	}

	public TrianguloView getTrianguloView() {
		return trianguloView;
	}
	
}
