package enumsJava;

public class ClasseTesteEnum {

    EnumMamiferos mamiferos;
    public ClasseTesteEnum(String mamiferos){
        this.mamiferos = EnumMamiferos.valueOf(mamiferos);
    }

    public void viajarAfrica(){
        switch (mamiferos){
            case LEAO:
                System.out.println("Tinha muitos Leões por lá: ");
                break;
            case RINOCERONTE:
                System.out.println("Gigantes e comiam muito: ");
                break;
            case GIRAFA:
                System.out.println("Eu vi 4 delas e um filhote: ");
                break;
            case ONÇA:
                System.out.println("Eu vi muitas e são lindas de ver:  ");
                break;
            case ELEFANTE:
                System.out.println("Grandes e gordos e muito inteligentes: ");
                break;
            default:
                System.out.println("Mamifero não existente no banco de dados!!");
                break;
        }
    }


}
