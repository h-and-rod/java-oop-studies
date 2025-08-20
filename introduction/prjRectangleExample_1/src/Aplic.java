/**
 *
 * 
 */
public class Aplic {

    public static void main(String[] args) {
        Rectangle retObj; //definição de ponteiro
        
        retObj = new Rectangle(); //instanciação da classe
        
        retObj.setHeight(5.0); //atribuição de valores 
        retObj.setWidth(8.0); // ao objeto através de métodos
        
        System.out.println("Medida da altura: " + retObj.getHeight());
        System.out.println("Medida da altura: " + retObj.getWidth());
        
        System.out.println("Medida da area: " + retObj.calcArea()); //Envia os dados à tela
        System.out.println("Medida do perimetro: " + retObj.calcPerimeter()); //Envia os dados à tela
       
    }
    
}
