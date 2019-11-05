package dad.javafx.geometria.model;

import dad.javafx.geometria.shapes.Triangle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import dad.javafx.bindings.custom.*;
public class TrianguloModel {
	private Triangle triangulo;
	private ReadOnlyDoubleWrapper area;
	private ReadOnlyDoubleWrapper perimetro;

	public TrianguloModel(Double base, Double altura) {
		super();
		this.triangulo = new Triangle(base,altura);
		this.area = new ReadOnlyDoubleWrapper(this, "area");
		this.area.bind(this.triangulo.baseProperty().multiply(this.triangulo.heightProperty()).divide(2));
		this.perimetro = new ReadOnlyDoubleWrapper(this,"perimetro");
		this.perimetro.bind(MathBinding.sqrt(MathBinding.pow(triangulo.baseProperty().divide(2), 2.0)
				.add(MathBinding.pow(triangulo.heightProperty(),2.0)).multiply(2)
				.add(triangulo.baseProperty())));
	}

	public TrianguloModel() {
		this(0.0, 0.0);
	}

	public DoubleProperty baseProperty() {
		return this.triangulo.baseProperty();
	}

	public double getBase() {
		return this.baseProperty().get();
	}

	public void setBase(final double base) {
		this.baseProperty().set(base);
	}
	
	public DoubleProperty alturaProperty() {
		return this.triangulo.heightProperty();
	}

	public double getAltura() {
		return this.alturaProperty().get();
	}

	public void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}

	public javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	public javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	public double getArea() {
		return this.areaProperty().get();
	}


}
