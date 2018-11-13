package com.rfm.model;

public class Escaleno extends Triangulo {

  public Escaleno(double ladoA, double ladoB, double ladoC) {
    super(ladoA, ladoB, ladoC);
  }

  @Override
  public String getDescripcion() {
    return "Soy un triangulo escaleno";
  }

  @Override
  public double getSuperficie() {
    double semiperimetro;
    semiperimetro = ((getLadoA() + getLadoB() + getLadoC()) / 2);
    return Math.sqrt(semiperimetro * (semiperimetro - getLadoA()) * (semiperimetro - getLadoB())
        * (semiperimetro - getLadoC()));
  }

  @Override
  public void dibuja() {
    throw new UnsupportedOperationException();
  }

}
