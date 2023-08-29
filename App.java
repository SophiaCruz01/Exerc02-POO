import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Mostrar Aluno");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Digite o RA: ");
                    String ra = scanner.nextLine();
                    aluno.setRA(ra);
                    
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    aluno.setNome(nome);
                    
                    System.out.print("Digite a nota da AC1: ");
                    float ac1 = scanner.nextFloat();
                    aluno.setAC1(ac1);
                    
                    System.out.print("Digite a nota da AC2: ");
                    float ac2 = scanner.nextFloat();
                    aluno.setAC2(ac2);
                    
                    System.out.print("Digite a nota da AG: ");
                    float ag = scanner.nextFloat();
                    aluno.setAG(ag);
                    
                    System.out.print("Digite a nota da AF: ");
                    float af = scanner.nextFloat();
                    aluno.setAF(af);
                    
                    break;
                    
                case 2:
                    System.out.println("\nDetalhes do Aluno:\n" + aluno.imprimir() + "\n");
                    break;
                    
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (choice != 3);
        
        scanner.close();
    }
    }

