import Mamiferos.Elefante;
import Mamiferos.Mamifero;
import Mamiferos.Rato;
import enumsJava.ClasseTesteEnum;
import enumsJava.EnumMamiferos;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Polimorfismo\n");
        //Mamifero mamifero1 = new Elefante();
        //System.out.println("Cota diaria de leite do Elefante: " + mamifero1.obterCotaDiariaDeLeite());
        //Mamifero mamifero2 = new Rato();
        //System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());

        //System.out.println();
        //for (EnumMamiferos p : EnumMamiferos.values()){
            //System.out.printf("%s%n", p);
        //}
        System.out.println();

        Scanner entrada = new Scanner(System.in);
        String mamiferos;
        System.out.println("Quais animais verei na africa?");
        mamiferos = entrada.next().toUpperCase();
        entrada.close();

        ClasseTesteEnum pl = new ClasseTesteEnum(mamiferos);
        pl.viajarAfrica();






    }
}