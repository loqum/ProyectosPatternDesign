package com.rfm.model;

public class Equilatero extends Triangulo {

  public Equilatero(int ladoA, int ladoB, int ladoC) {
    super(ladoA, ladoB, ladoC);
  }

  @Override
  public String getDescripcion() {
    return "Soy un triangulo equilatero";
  }

  @Override
  public double getSuperficie() {
    double altura = 0;
    altura = Math.sqrt(Math.pow(getLadoA(), 2) - Math.pow((getLadoB() / 2), 2));

    return Math.round((altura * Math.pow(10, 2)));
  }

  @Override
  public void dibuja() {
    throw new UnsupportedOperationException();
  }

}
