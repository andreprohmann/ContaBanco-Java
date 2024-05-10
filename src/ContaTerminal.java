import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Saldo
        double saldo = 237.48;
        //Scanner
       try {
           Scanner sc = new Scanner(System.in).useLocale(Locale.US);

           System.out.println("Por favor, digite o número da Agência !");
           String agencia = sc.next();

           System.out.println("Por favor, digite o número da Conta !");
           int conta = sc.nextInt();

           System.out.println("Por favor, digite o o seu nome !");
           String nome = sc.next();


           //Resultado
           System.out.println("\"Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
       }
            //Tratamento de erro
       catch (InputMismatchException e){
           System.out.println("O campo de número do conta deve ser preenchido apenas com números!");
        }





    }
}