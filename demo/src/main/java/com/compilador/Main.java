package demo.src.main.java.com.compilador;

import demo.src.main.java.com.compilador.gals.*;

public class Main {

  public static void main(String[] args) {
    try {
      Lexico AnalisadorLexico = new Lexico(
        "int n1, n2;\n" + //
        "printf(\"Coloque dois numeros a serem calculados\");\n" + //
        "scanf(num1);\n" + //
        "scanf(num2);\n" + //
        "soma=num1+num2;\n" + //
        "printf(soma);"
      );

      Sintatico AnalisadorSintatico = new Sintatico();
      Semantico AnalisadorSemantico = new Semantico();

      AnalisadorSintatico.parse(AnalisadorLexico, AnalisadorSemantico);
    } catch (AnalysisError e) {
      System.out.println("Comando não indetificado:" + e);
    }
  }
}
