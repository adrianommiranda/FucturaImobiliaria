package view;

import java.util.Scanner;

import dao.Imobiliaria2;
import model.Casa;
import model.Loja;
import model.Predio;

public class Menu {
	static String menuPrincipal = """
			--------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - MENU PRINCIPAL|
			--------------------------------------------------------------------

			MENU PRINCIPAL

			1. Cadastro edificação, pelo tipo

			2. Pesquisar casa pela matricula
			3. Listar todas as casas
			4. Removendo casa

			5. Inserindo a descrição predial
			6. Inserir a área total da construção

			7. Pesquisar loja pela matricula
			8. Listar todas as lojas
			9. Removendo loja

			10. Pesquisar prédio pela matricula
			11. Listar todas os prédios
			12. Removendo prédio

			13. Listar todos os imóveis


			14. Zerar banco
			0. Sair
			""";

	static String cadastroCasa = """
			----------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - CADASTRO DE CASA|
			----------------------------------------------------------------------
			""";

	static String pesquisaCasamatricula = """
			----------------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - PESQUISA DE CASA - MATRICULA|
			----------------------------------------------------------------------------------
			""";

	static String listarCasas = """
			------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - LISTAR CASAS|
			------------------------------------------------------------------
			""";

	static String removerCasas = """
			---------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - REMOVENDO CASAS|
			---------------------------------------------------------------------
			""";

	static String inserirDescricaoPredial = """
			----------------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - INSERINDO DESCRIÇÃO DO IMÓVEL|
			----------------------------------------------------------------------------------
			""";

	static String inserirAreaTotal = """
			----------------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - ÁREA TOTAL DO IMÓVEL|
			----------------------------------------------------------------------------------
			""";

	static String pesquisaLojatricula = """
			----------------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - PESQUISA DE LOJA - MATRICULA|
			----------------------------------------------------------------------------------
			""";

	static String listarLojas = """
			------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - LISTAR LOJAS|
			------------------------------------------------------------------
			""";

	static String removerLojas = """
			---------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - REMOVENDO LOJA|
			---------------------------------------------------------------------
			""";

	static String pesquisaPrediomatricula = """
			-------------------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - PESQUISA DE PRÉDIO - MATRICULA|
			------------------------------------------------------------------------------------
			""";

	static String listarPredio = """
			--------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - LISTAR PRÉDIO|
			--------------------------------------------------------------------
			""";

	static String removerPredio = """
			-----------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - REMOVENDO PRÉDIO|
			-----------------------------------------------------------------------
			""";

	static String listarImoveis = """
			-----------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - LISTAR TODOS OS IMÓVEIS|
			-----------------------------------------------------------------------------
			""";

	static String zerandoBD = """
			-----------------------------------------------------------------------------
			|IMOBILIÁRIA MIRANDA - SUA CASA VOCÊ ENCONTRA AQUI  - ZERAR BD|
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

					System.out.println("Informe o nome do edifício ou Loja. ");
					String nome = scanner.nextLine();
					System.out.println("\n");

					System.out.println("Informe o tipo de edificação: C casa P prédio L loja ");
					String tipo = scanner.next();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");

					System.out.println("Informe o endereço: ");
					String endereco = scanner.nextLine();
					System.out.println("\n");

					System.out.println("Informe o valor da edificação: ");
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
						System.out.println("Tipo não existe");
					}

				} catch (Exception e) {
					System.out.println(
							"Entrada inválida! Para matriculas apenas dígitos. Digite apenas String. OBS: Tipo P L C");
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
					System.out.println("Entrada inválida! Digite apenas números inteiros.");
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
					System.out.println("Entrada inválida! Digite apenas números inteiros.");
					scanner.nextLine();
				} finally {
					scanner.nextLine();

				}
			}

			if (resp == 5) {
				try {
					System.out.println(inserirDescricaoPredial);
					System.out.println("Informe da matricula do imóvel : ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe tipo do imóvel : ");
					String tipo = scanner.next();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe a descrição do imóvel : ");
					String descricao = scanner.nextLine();

					Imobiliaria2.addDescrição(matricula, tipo, descricao);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inválida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}

			}

			if (resp == 6) {
				try {
					System.out.println(inserirAreaTotal);
					System.out.println("Informe da matricula do imóvel : ");

					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe tipo do imóvel : ");
					String tipo = scanner.next();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe a largura do imóvel : ");
					int largura = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					System.out.println("Informe a comprimento do imóvel : ");
					int comprimento = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner

					Imobiliaria2.addAreaConstruida(matricula, tipo, largura, comprimento);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inválida!");
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
					System.out.println("Entrada inválida!");
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
					System.out.println("Entrada inválida!");
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
					System.out.println("Entrada inválida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 10) {
				try {
					System.out.println(pesquisaPrediomatricula);
					System.out.println("Informe da matricula do Prédio: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					System.out.println("\n");

					Imobiliaria2.listarPredioMatricula(matricula);
					exibirMenuPrincipal();
				} catch (Exception e) {
					System.out.println("Entrada inválida!");
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
					System.out.println("Entrada inválida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 12) {
				try {
					System.out.println(removerPredio);
					System.out.println("Informe da matricula da prédio a ser removida: ");
					int matricula = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do scanner
					Imobiliaria2.removePredios(matricula);
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inválida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			if (resp == 13) {
				try {
					System.out.println(listarImoveis);
					System.out.println("Listando todos os imóveis ");
					Imobiliaria2.listarTodosImoveis();
					exibirMenuPrincipal();
					System.out.println("\n\n\n-----------------------------------------------------------\n\n\n");
				} catch (Exception e) {
					System.out.println("Entrada inválida!");
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
					System.out.println("Entrada inválida!");
					scanner.nextLine();
				} finally {
					scanner.nextLine();
				}
			}

			/*
			 * Solicita nova entrada do usuário, protegendo contra entradas inválidas O
			 * scanner int vai ler apenas inteiro Se ele digitar qualquer caracter diferente
			 * de inteiro vai gerer exceção se a entrada for válisa sair do loop e segue o
			 * código - breack
			 * 
			 */
			while (true) {
				try {
					System.out.println("Informe a sua opção! Menuprincipal :");
					resp = scanner.nextInt();
					System.out.println("\n\n-----------------------------------------------------------\n\n");
					break; // Sai do loop se a entrada for válida
				} catch (Exception e) {
					System.out.println("Entrada inválida! Digite apenas números inteiros.");
					scanner.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
				}
			}

			// Validar a opção
			if (resp < 0 || resp > 14) {
				System.out.println("Opção inválida! Escolha entre 0 - 13 ");
			}

		} // --------fim menu principal

	}
}
