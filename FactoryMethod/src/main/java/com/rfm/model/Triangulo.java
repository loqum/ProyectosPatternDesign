package com.rfm.model;

public abstract class Triangulo {

  private double ladoA;
  private double ladoB;
  private double ladoC;

  /**
   * Constructor completo de la clase Triangulo.
   * 
   * @param ladoA Cateto x.
   * @param ladoB Cateto y.
   * @param ladoC Cateto z.
   */
  public Triangulo(double ladoA, double ladoB, double ladoC) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }

  public abstract String getDescripcion();

  public abstract double getSuperficie();

  public abstract void dibuja();

  public double getLadoA() {
    return ladoA;
  }

  public void setLadoA(int ladoA) {
    this.ladoA = ladoA;
  }

  public double getLadoB() {
    return ladoB;
  }

  public void setLadoB(int ladoB) {
    this.ladoB = ladoB;
  }

  public double getLadoC() {
    return ladoC;
  }

  public void setLadoC(int ladoC) {
    this.ladoC = ladoC;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Triangulo [ladoA=");
    builder.append(ladoA);
    builder.append(", ladoB=");
    builder.append(ladoB);
    builder.append(", ladoC=");
    builder.append(ladoC);
    builder.append("]");
    return builder.toString();
  }

}
