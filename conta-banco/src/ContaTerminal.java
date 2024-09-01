import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e importar a classe Scanner

        Scanner terminal = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
                
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomecliente = terminal.nextLine();  

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = terminal.next();        

        System.out.println("Por favor, digite o número da Conta ! ");
        int numero = terminal.nextInt();              

        System.out.println("Por favor, digite o Saldo !");
        double saldo = terminal.nextDouble();		
		

        //Exibir a mensagem conta criada

        System.out.println("Olá "+ nomecliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo é "+ saldo + " já está disponível para saque." );

       
    }
}
