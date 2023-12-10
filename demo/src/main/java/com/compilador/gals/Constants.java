package com.compilador.gals;

public interface Constants extends ScannerConstants, ParserConstants {
  int EPSILON = 0;
  int DOLLAR = 1;

  int t_RESERV_SCAN = 2;
  int t_RESERV_PRINT = 3;
  int t_RESERV_INT = 4;
  int t_IDENTIFICADOR = 5;
  int t_INT = 6;
  int t_STR = 7;
  int t_DELIMITADOR_P_AB = 8;
  int t_DELIMITADOR_P_FE = 9;
  int t_VIRG = 10;
  int t_SOMA = 11;
  int t_SUBT = 12;
  int t_DIV = 13;
  int t_MULT = 14;
  int t_QUEBRA_LINHA = 15;
  int t_ESPACO_BRANCO = 16;
  int t_ATRIBUICAO = 17;
  int t_PONTO_V = 18;
}
