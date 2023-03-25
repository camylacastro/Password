import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


						Scanner sc = new Scanner(System.in);
						System.out.println("Digite a Senha :");
						String senha = sc.next();
						int contador = 1;
						
						while(!senha.equals("senha12345") && contador <= 2) {
							System.out.println("Senha Incorreta, Tente Novamente : \nTentativas Restantes : " + (3 - contador));
							contador++;
							senha = sc.next();
						}
						
						System.out.println();
						if(senha.equals("senha12345")) {
							System.out.println("ACESSO PERMITIDO");
						} else {
							System.out.println("Acesso Bloqueado (Senha INcorreta)");
						}
						
						
						sc.close();



			}

		}
