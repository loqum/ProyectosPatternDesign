package com.rfm.model;

public class Isosceles extends Triangulo {

  public Isosceles(int ladoA, int ladoB, int ladoC) {
    super(ladoA, ladoB, ladoC);
  }

  @Override
  public String getDescripcion() {
    return "Soy un triangulo isosceles";
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
