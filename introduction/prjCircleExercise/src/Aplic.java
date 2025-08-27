import java.util.Scanner;

/**
 *
 * @author h-and-rod
 */

public class Aplic {
    public static void main(String[] args) {
        double radiusMeasure;
        int option;
                
        //Instanciação de um objeto da classe Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a medida raio do circulo: ");
        radiusMeasure = input.nextDouble(); 
        
        //Instanciação de um objeto da classe Circle
        Circle circleObj = new Circle();
        circleObj.setRad(radiusMeasure);
        
        do{
            System.out.println("\n\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida da diâmetro");
            System.out.println("4 - Encerrar");
            System.out.print("\n\t\tDigite a opção: ");
            option = input.nextInt(); //equivalente à scanf("%d", &opcao);
            
            if (option == 1){
                System.out.println("\n\nMedida da área: " + circleObj.calcArea());
            }else
               if (option == 2){
                   System.out.println("\n\nMedida do perímetro: " + circleObj.calcPerimeter());       
               }else
                  if (option == 3){
                      System.out.println("\n\nMedida do diâmetro: " + circleObj.calcDiameter());
                  } 
        }while(option < 4);
    }
}

