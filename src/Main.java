import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LeerArchico lectura = new LeerArchico();
        // se nos obliga a ponerle su respectivo
        try {
            lectura.metodoUno("datos.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}