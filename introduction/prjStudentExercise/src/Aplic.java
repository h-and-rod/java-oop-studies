import java.util.Scanner;

/**
 *
 * @author h-and-rod
 */

public class Aplic {
    public static void main(String[] args) {
        int RA;
        int option;
        double grade;

        //Instanciação de um objeto da classe Scanner e da classe estudante
        Scanner input = new Scanner(System.in);
        Student studentObj = new Student();

        //Sequência de inputs
        System.out.print("Digite o RA do aluno: ");
        RA = input.nextInt(); 
        studentObj.setRA(RA);
        
        System.out.print("Digite a nota do aluno na primeira prova: ");
        grade = input.nextDouble(); 
        studentObj.setTst1Gd(grade);

        System.out.print("Digite a nota do aluno na segunda prova: ");
        grade = input.nextDouble();
        studentObj.setTst2Gd(grade);

        System.out.print("Digite a nota do aluno no primeiro projeto: ");
        grade = input.nextDouble();
        studentObj.setPrj1Gd(grade);

        System.out.print("Digite a nota do aluno no segundo projeto: ");
        grade = input.nextDouble();
        studentObj.setPrj2Gd(grade);
        
        System.out.println("\n\nRA do aluno: " + studentObj.getRA() + "\n");
        
        do{
            //Apresenta o menu
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.print("\n\tDigite a opcao: ");
            option = input.nextInt();
            
            //Apresenta o resultado conforme o solicitado
            if (option == 1){
                System.out.println("\n\nNotas: ");
                System.out.println("Nota da primeira prova: " + studentObj.getTst1Gd());
                System.out.println("Nota da segunda prova: " + studentObj.getTst2Gd());
                System.out.println("Nota do primeiro projeto: " + studentObj.getPrj1Gd());
                System.out.println("Nota do segundo projeto: " + studentObj.getPrj2Gd());
            }else
            if (option == 2){
                System.out.println("\n\nMédias: ");       
                System.out.println("Média das provas: " + studentObj.calcTstAverage());       
                System.out.println("Média dos projetos: " + studentObj.calcPrjAverage());       
            }else
            if (option == 3){
                System.out.println("Média final: " + studentObj.calcFinalAverage());  
                if (studentObj.isApproved()){
                    System.out.println("Aluno aprovado!");
                }
                else{ System.out.println("Aluno reprovado");} 
            
            System.out.println("RA do aluno: " + studentObj.getRA() + "\n");
            }
        }while(option < 4);
    }
}

