package com.rfm.model;

public abstract class Triangulo {

  private int ladoA;
  private int ladoB;
  private int ladoC;

  public Triangulo(int ladoA, int ladoB, int ladoC) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }

  public abstract String getDescripcion();

  public abstract double getSuperficie();

  public abstract void dibuja();

  public int getLadoA() {
    return ladoA;
  }

  public void setLadoA(int ladoA) {
    this.ladoA = ladoA;
  }

  public int getLadoB() {
    return ladoB;
  }

  public void setLadoB(int ladoB) {
    this.ladoB = ladoB;
  }

  public int getLadoC() {
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
