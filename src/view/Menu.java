package view;

import java.util.Scanner;

import dao.Imobiliaria2;
import model.Casa;
import model.Loja;
import model.Predio;

public class Menu {
	static String menuPrincipal = """
			--------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - MENU PRINCIPAL|
			--------------------------------------------------------------------

			MENU PRINCIPAL

			1. Cadastro edifica��o, pelo tipo

			2. Pesquisar casa pela matricula
			3. Listar todas as casas
			4. Removendo casa

			5. Inserindo a descri��o predial
			6. Inserir a �rea total da constru��o

			7. Pesquisar loja pela matricula
			8. Listar todas as lojas
			9. Removendo loja

			10. Pesquisar pr�dio pela matricula
			11. Listar todas os pr�dios
			12. Removendo pr�dio

			13. Listar todos os im�veis


			14. Zerar banco
			0. Sair
			""";

	static String cadastroCasa = """
			----------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - CADASTRO DE CASA|
			----------------------------------------------------------------------
			""";

	static String pesquisaCasamatricula = """
			----------------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - PESQUISA DE CASA - MATRICULA|
			----------------------------------------------------------------------------------
			""";

	static String listarCasas = """
			------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - LISTAR CASAS|
			------------------------------------------------------------------
			""";

	static String removerCasas = """
			---------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - REMOVENDO CASAS|
			---------------------------------------------------------------------
			""";

	static String inserirDescricaoPredial = """
			----------------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - INSERINDO DESCRI��O DO IM�VEL|
			----------------------------------------------------------------------------------
			""";

	static String inserirAreaTotal = """
			----------------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - �REA TOTAL DO IM�VEL|
			----------------------------------------------------------------------------------
			""";

	static String pesquisaLojatricula = """
			----------------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - PESQUISA DE LOJA - MATRICULA|
			----------------------------------------------------------------------------------
			""";

	static String listarLojas = """
			------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - LISTAR LOJAS|
			------------------------------------------------------------------
			""";

	static String removerLojas = """
			---------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - REMOVENDO LOJA|
			---------------------------------------------------------------------
			""";

	static String pesquisaPrediomatricula = """
			-------------------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - PESQUISA DE PR�DIO - MATRICULA|
			------------------------------------------------------------------------------------
			""";

	static String listarPredio = """
			--------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - LISTAR PR�DIO|
			--------------------------------------------------------------------
			""";

	static String removerPredio = """
			-----------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - REMOVENDO PR�DIO|
			-----------------------------------------------------------------------
			""";

	static String listarImoveis = """
			-----------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - LISTAR TODOS OS IM�VEIS|
			-----------------------------------------------------------------------------
			""";

	static String zerandoBD = """
			-----------------------------------------------------------------------------
			|IMOBILI�RIA MIRANDA - SUA CASA VOC� ENCONTRA AQUI  - ZERAR BD|
			-----------------------------------------------------------------------------
			""";

	// Chamada menu principal
	public static void exibirMenuPrincipal() {
		System.out.println(menuPrincipal);
	}

	public static void iniciar() {
		Scanner scanner = new Scanner(System.in);

		exibirMenuPrincipal();
		int resp = 100;

		while (resp != 0) { // ----------menu principal

			if (resp == 1) {

				try {
					System.out.println("\n\n" + cadastroCasa);
					System.out.println("Informe da matricula: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");

					System.out.println("Informe o nome do edif�cio ou Loja. ");
					String nome = scanner.nextLine();
					System.out.println("\n");

					System.out.println("Informe o tipo de edifica��o: C casa P pr�dio L loja ");
					String tipo = scanner.next();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");

					System.out.println("Informe o endere�o: ");
					String endereco = scanner.nextLine();
					System.out.println("\n");

					System.out.println("Informe o valor da edifica��o: ");
					double valor = scanner.nextDouble();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");
					if (tipo.equalsIgnoreCase("C")) {
						Imobiliaria2.adicionarConstrucao(matricula, nome, tipo, endereco, valor);

					} else if (tipo.equalsIgnoreCase("P")) {
						Imobiliaria2.adicionarConstrucao(matricula, nome, tipo, endereco, valor);
					} else if (tipo.equalsIgnoreCase("L")) {
						Imobiliaria2.adicionarConstrucao(matricula, nome, tipo, endereco, valor);
					} else {
						System.out.println("Tipo n�o existe");
					}

				} catch (Exception e) {
					System.out.println(
							"Entrada inv�lida! Para matriculas apenas d�gitos. Digite apenas String. OBS: Tipo P L C");
				} finally {
					scanner.nextLine();
				}

				exibirMenuPrincipal();
			}

			if (resp == 2) {
				try {
					System.out.println(pesquisaCasamatricula);
					System.out.println("Informe da matricula da casa: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida! Digite apenas n�meros inteiros.");
					scanner.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
				} finally {
					scanner.nextLine();

				}
			}

			if (resp == 3) {
				System.out.println("\n\n" + listarCasas);
				Imobiliaria2.listarTodasCasas();
				exibirMenuPrincipal();
				System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
			}

			if (resp == 4) {
				try {
					System.out.println(removerCasas);
					System.out.println("Informe da matricula da casa a ser removida: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					Imobiliaria2.remover(matricula);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida! Digite apenas n�meros inteiros.");
					scanner.nextLine();
				} finally {
					scanner.nextLine();

				}
			}

			if (resp == 5) {
				try {
					System.out.println(inserirDescricaoPredial);
					System.out.println("Informe da matricula do im�vel : ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe tipo do im�vel : ");
					String tipo = scanner.next();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe a descri��o do im�vel : ");
					String descricao = scanner.nextLine();

					Imobiliaria2.addDescri��o(matricula, tipo, descricao);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}

			}

			if (resp == 6) {
				try {
					System.out.println(inserirAreaTotal);
					System.out.println("Informe da matricula do im�vel : ");

					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe tipo do im�vel : ");
					String tipo = scanner.next();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe a largura do im�vel : ");
					int largura = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe a comprimento do im�vel : ");
					int comprimento = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					Imobiliaria2.addAreaConstruida(matricula, tipo, largura, comprimento);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 7) {
				try {
					System.out.println(pesquisaLojatricula);
					System.out.println("Informe da matricula da Loja: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");

					Imobiliaria2.listarLojaMatricula(matricula);
					exibirMenuPrincipal();
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 8) {
				try {
					System.out.println("\n\n" + listarLojas);
					Imobiliaria2.listarTodasLojas();
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 9) {
				try {
					System.out.println(removerLojas);
					System.out.println("Informe da matricula da loja a ser removida: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					Imobiliaria2.removerLojas(matricula);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 10) {
				try {
					System.out.println(pesquisaPrediomatricula);
					System.out.println("Informe da matricula do Pr�dio: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");

					Imobiliaria2.listarPredioMatricula(matricula);
					exibirMenuPrincipal();
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 11) {
				try {
					System.out.println("\n\n" + listarPredio);
					Imobiliaria2.listarTodasPredios();
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 12) {
				try {
					System.out.println(removerPredio);
					System.out.println("Informe da matricula da pr�dio a ser removida: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					Imobiliaria2.removePredios(matricula);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 13) {
				try {
					System.out.println(listarImoveis);
					System.out.println("Listando todos os im�veis ");
					Imobiliaria2.listarTodosImoveis();
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 14) {
				try {
					System.out.println(zerandoBD);
					System.out.println("Zerando BD ");
					Imobiliaria2.zerandoBD();
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inv�lida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			/*
			 * Solicita nova entrada do usu�rio, protegendo contra entradas inv�lidas O
			 * scanner int vai ler apenas inteiro Se ele digitar qualquer caracter diferente
			 * de inteiro vai gerer exce��o se a entrada for v�lisa sair do loop e segue o
			 * c�digo - breack
			 * 
			 */
			while (true) {
				try {
					System.out.println("Informe a sua op��o! Menuprincipal :");
					resp = scanner.nextInt();
					System.out.println("\n\n-----------------------------------------------------------\n\n");
					break; // Sai do loop se a entrada for v�lida
				} catch (Exception e) {
					System.out.println("Entrada inv�lida! Digite apenas n�meros inteiros.");
					scanner.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
				}
			}

			// Validar a op��o
			if (resp < 0 || resp > 14) {
				System.out.println("Op��o inv�lida! Escolha entre 0 - 13 ");
			}

		} // --------fim menu principal

	}
}
