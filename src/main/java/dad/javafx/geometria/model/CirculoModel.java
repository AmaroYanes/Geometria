package dad.javafx.geometria.model;

import dad.javafx.bindings.custom.MathBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.scene.shape.Circle;


public class CirculoModel {
	private Circle circulo;
	private ReadOnlyDoubleWrapper area;
	private ReadOnlyDoubleWrapper perimetro;

	public CirculoModel(Double radio) {
		 circulo = new Circle(radio);
		this.area = new ReadOnlyDoubleWrapper(this, "area");
		this.perimetro = new ReadOnlyDoubleWrapper(this, "perimetro");
		this.area.bind(MathBinding.pow(circulo.radiusProperty(),2.0).multiply(MathBinding.pi()));
		this.perimetro.bind(MathBinding.pi().multiply(2).multiply(circulo.radiusProperty()));
	}

	public CirculoModel() {
		this(0.0);
	}
	
	public DoubleProperty radioProperty() {
		return circulo.radiusProperty();
	}
	
	public double getRadio() {
		return this.radioProperty().get();
	}
	
	
	public javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public double getArea() {
		return this.areaProperty().get();
	}

	public javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public double getPerimetro() {
		return this.perimetroProperty().get();
	}

}
