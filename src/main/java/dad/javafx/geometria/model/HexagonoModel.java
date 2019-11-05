package dad.javafx.geometria.model;

import dad.javafx.bindings.custom.MathBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonoModel {
	private DoubleProperty radio;
	private ReadOnlyDoubleWrapper area;
	private ReadOnlyDoubleWrapper perimetro;
	private ReadOnlyDoubleWrapper lado;

	public HexagonoModel(Double radio) {
		this.radio = new SimpleDoubleProperty(this, "radio", radio);
		this.area = new ReadOnlyDoubleWrapper(this, "area");
		this.lado = new ReadOnlyDoubleWrapper(this,"lado");
		this.perimetro = new ReadOnlyDoubleWrapper(this, "perimetro");
		this.lado.bind(MathBinding.sqrt(MathBinding.pow(this.radio, 2.0).multiply(2)
						.subtract(MathBinding.pow(this.radio, 2.0).multiply(2).multiply(0.5))));
		//0.5 es el cos de 60 por alguna razón no funciona correctamente el cos (comprobar en clase)
		this.perimetro.bind(lado.multiply(6.0));
		this.area.bind(lado.multiply(3.0)
				.multiply(lado.divide(1.1547)));
		//1.1547 aprox 2tan(30) igual que el cos no funciona correctamente
		//this.area.bind(rawObservable);
	}

	public HexagonoModel() {
		this(0.0);
	}

	public DoubleProperty radioProperty() {
		return this.radio;
	}

	public double getRadio() {
		return this.radioProperty().get();
	}

	public void setAltura(final double altura) {
		this.radioProperty().set(altura);
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
