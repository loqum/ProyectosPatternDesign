package com.rfm.model;

public class Escaleno extends Triangulo {

  public Escaleno(int ladoA, int ladoB, int ladoC) {
    super(ladoA, ladoB, ladoC);
  }

  @Override
  public String getDescripcion() {
    return "Soy un triangulo escaleno";
  }

  @Override
  public double getSuperficie() {
    return 0;
  }

  @Override
  public void dibuja() {
    throw new UnsupportedOperationException();
  }

}
