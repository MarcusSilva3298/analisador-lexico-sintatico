package com.compilador.gals;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Semantico implements Constants {

  Stack<Integer> Pilha = new Stack<Integer>();
  Map<String, Integer> ChaveValor;
  String Atual;

  public Semantico() {
    this.ChaveValor = new HashMap<String, Integer>();
  }

  public void executeAction(int action, Token token) throws SemanticError {
    System.out.println("Ação #" + action + ", Token: " + token);

    Integer a, b;

    switch (action) {
      case 1:
        break;
      case 2:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        break;
      case 8:
        break;
      case 9:
        break;
      case 10:
        break;
      case 11:
        break;
      case 12:
        break;
      default:
        break;
    }
  }
}
