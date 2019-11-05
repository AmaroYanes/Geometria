package dad.javafx.geometria.controllers;

import dad.javafx.geometria.model.RectanguloModel;
import dad.javafx.view.RectanguloView;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController extends VBox {
	
	// view
	
	
	private RectanguloModel rectanguloModel = new RectanguloModel(20.0, 20.0);
	private RectanguloView rectanguloView = new RectanguloView();

	public RectanguloController() {
		super();		
		
		rectanguloView.getAnchoText().textProperty().bindBidirectional(rectanguloModel.baseProperty(), new NumberStringConverter());
		rectanguloView.getAltoText().textProperty().bindBidirectional(rectanguloModel.alturaProperty(), new NumberStringConverter());
		rectanguloView.getAreaText().textProperty().bind(rectanguloModel.areaProperty().asString());
		rectanguloView.getRectanguloShape().widthProperty().bind(rectanguloModel.baseProperty());
		rectanguloView.getRectanguloShape().heightProperty().bind(rectanguloModel.alturaProperty());
		rectanguloView.getPerimetroText().textProperty().bind(rectanguloModel.perimetroProperty().asString());
		
	}

	public RectanguloView getRectanguloView() {
		return rectanguloView;
	}
	
}
