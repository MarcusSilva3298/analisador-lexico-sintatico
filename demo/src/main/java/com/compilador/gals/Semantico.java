package com.compilador.gals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Semantico implements Constants {

  Stack<Integer> Pilha = new Stack<Integer>();
  Map<String, Integer> ChaveValor;
  String Atual;
  Scanner scanner = new Scanner(System.in);

  public Semantico() {
    this.ChaveValor = new HashMap<String, Integer>();
  }

  public void executeAction(int action, Token token) throws SemanticError {
    // System.out.println("Ação #" + action + ", Token: " + token);

    Integer a, b;

    switch (action) {
      case 1:
        // this.Pilha.push(this.buscarChave(token.getLexeme()));
        String keyIdentificador = token.getLexeme();
        this.buscarChave(keyIdentificador);

        this.Pilha.push(this.ChaveValor.get(keyIdentificador));

        break;
      case 2:
        this.Pilha.push(Integer.parseInt(token.getLexeme()));

        break;
      case 3:
        b = this.Pilha.pop();
        a = this.Pilha.pop();

        this.Pilha.push(a / b);

        break;
      case 4:
        b = this.Pilha.pop();
        a = this.Pilha.pop();

        this.Pilha.push(a * b);

        break;
      case 5:
        b = this.Pilha.pop();
        a = this.Pilha.pop();

        this.Pilha.push(a - b);

        break;
      case 6:
        b = this.Pilha.pop();
        a = this.Pilha.pop();

        this.Pilha.push(a + b);

        break;
      case 7:
        this.ChaveValor.put(Atual, this.Pilha.pop());

        break;
      case 8:
        String keyOperacao = token.getLexeme();
        this.buscarChave(keyOperacao);

        this.Atual = keyOperacao;

        break;
      case 9:
        String keyScanf = token.getLexeme();
        this.buscarChave(keyScanf);

        String valorScanf = this.scanner.nextLine();
        this.ChaveValor.put(keyScanf, Integer.parseInt(valorScanf));

        break;
      case 10:
        String keyValorPrint = token.getLexeme();
        this.buscarChave(keyValorPrint);
        Integer valorPrint = this.ChaveValor.get(keyValorPrint);

        System.out.println(valorPrint);

        break;
      case 11:
        String str = token.getLexeme().replaceAll("\"", "");

        System.out.println(str);

        break;
      case 12:
        this.ChaveValor.put(token.getLexeme(), 0);

        break;
      case 13:
        this.ChaveValor.put(token.getLexeme(), 0);

        break;
    }
  }

  public void buscarChave(String chave) {
    if (!this.ChaveValor.containsKey(chave)) throw new Error(
      String.format("Variável \"%s\" não declarada", chave)
    );
  }
}
