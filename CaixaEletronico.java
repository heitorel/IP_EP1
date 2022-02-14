/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <2020194> - <Norton Trevisan Roman>                           **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   <HEITOR LOPES BIANCHI>                   <10258730>           **/
/**                                                                 **/
/**   <07/04/2020>                                                  **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {
	// Número de cédulas de B$50,00
	static int n50;
	
	// Número de cédulas de B$10,00
	static int n10;

	// Número de cédulas de B$5,00
	static int n5;
	
	// Número de cédulas de B$1,00
	static int n1;


	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
			valor - O valor a ser retirado
	*/
	static void fazRetirada(int valor) {
		
		/*
			Aqui testamos o valor a ser retirado, caso seja um valor negativo (valor <0)
			as variáveis globais n50,n10, n5 e n1 serão inicializadas com -1, indicando um erro.
		*/
		if (valor < 0){
			
			n50 = -1;
			n10 = -1;
			n5 = -1;
			n1 = -1;		
		}
		/*
			Caso o valor a ser retirado seja positivo, distribuiremos o mesmo pelas possiveis cédulas
			representadas pelas variáveis globais n50,n10, n5 e n1. Os comandos dividirão o valor pelas 
			cédulas em ordem decrescente, armazenando o resultado inteiro da divisão na variável correspondente
			e dividindo o resto pela próxima cédula e assim por diante.
			
			Utiliza-se de variáveis auxiliares inteiras aux1 e aux2 para armazenar os restos das divisões.
		*/
		
		else {
		
			n50 = valor/50;
			int aux1 = valor%50;
		
			n10 = aux1/10;
			int aux2 = aux1%10;
		
			n5 = aux2/5;
			n1 = aux2%5;
		
		}
	}
	

	public static void main(String[] args) {

		fazRetirada(300);
		
		System.out.println("=============================================== \nA quantidade de cada nota a ser retirada sera: ");
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1+"\n===============================================");
	}
}