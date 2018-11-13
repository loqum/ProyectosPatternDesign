package com.rfm.main;

import com.rfm.factory.TrianguloFactory;
import com.rfm.factory.TrianguloFactoryMethod;
import com.rfm.model.Triangulo;

public class Main {

  /**
   * Punto de entrada de la aplicacion.
   * 
   * @param args Predeterminado.
   */
  public static void main(String[] args) {

    TrianguloFactoryMethod factory = new TrianguloFactory();
    Triangulo triangulo = factory.createTriangulo(10, 10, 10);

    System.out.println(triangulo.getDescripcion());
    System.out.println(triangulo.getSuperficie());

  }

}
