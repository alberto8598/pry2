package org.example;

import java.util.Date;

public class Resultado {

    public String mensaje(String mensaje) {
      String result;
      result = mensaje + new Date().toString();
      return result;
    }
}
