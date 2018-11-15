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
    double altura = 0;
    double area = 0;

    altura = Math.sqrt((Math.pow(getLadoA(), 2)) - (Math.pow(getLadoB(), 2) / 4));

    area = ((getLadoB() * altura) / 2);

    return area;
  }

  @Override
  public void dibuja() {
    throw new UnsupportedOperationException();
  }

}
