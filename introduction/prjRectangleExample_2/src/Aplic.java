
import java.util.Scanner; //importa a classde Scanner

/**
 *
 * @author h-and-rod
 */
public class Aplic {

    public static void main(String[] args) {
        double height, width;
        int option;
        Rectangle retObj;
        Scanner entry; // cria um objeto da classe Scanner

        entry = new Scanner(System.in);
        System.out.print("Digite a medida da altura do retangulo: ");
        height = entry.nextDouble(); // relativo ao que seria 'scanf("%lf", &height);' em C
        System.out.print("Digite a medida da base do retangulo: ");
        width = entry.nextDouble();// relativo ao que seria 'scanf("%lf", &width);' em C

        retObj = new Rectangle(); // inicializa o objeto retObj da classe Rectangle
        retObj.setWidth(width);
        retObj.setHeight(height);

        do {
            System.out.println("\n\n1 - Consultar medida da area");
            System.out.println("\n\n2 - Consultar medida do perimetro");
            System.out.println("\n\n3 - Consultar medida da diagonal");
            System.out.println("\n\n4 - Encerrar");
            System.out.println("\n\t\tDigite a opcao desejada: ");
            option = entry.nextInt(); //relativo à scanf("%d", &option)

            if (option == 1) {
                System.out.println("Area: " + retObj.calcArea());
            } else if (option == 2) {
                System.out.println("Perimetro: " + retObj.calcPerimeter());
            } else if (option == 3) {
                System.out.println("Diagonal: " + retObj.calcDiagonal());
            }
        } while (option < 4);

    }

}
