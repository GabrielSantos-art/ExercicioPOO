package exercicio2;

public class Lambada {
    public Boolean estaLigada;
    public String comodo;

    public Boolean ligar() {

        estaLigada = true;
        return estaLigada;
    }

    public Boolean desligado() {

        estaLigada = false;
        return estaLigada;
    }

    public String observar() {

      String luz = estaLigada == true ? "Lâmpada ligada" : "Lâmpada desligada";

        return luz;
    }
}
