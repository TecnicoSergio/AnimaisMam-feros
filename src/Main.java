import Mamiferos.Elefante;
import Mamiferos.Mamifero;
import Mamiferos.Rato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Polimorfismo\n");
        Mamifero mamifero1 = new Elefante();
        System.out.println("Cota diaria de leite do Elefante: " + mamifero1.obterCotaDiariaDeLeite());
        Mamifero mamifero2 = new Rato();
        System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());

    }
}