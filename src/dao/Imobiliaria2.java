package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Casa;
import model.Loja;
import model.Predio;

public class Imobiliaria2 {
	static List<Casa> listaCasa = new ArrayList<>();
	static List<Predio> listaPredio = new ArrayList<>();
	static List<Loja> listaLoja = new ArrayList<>();

	public static void adicionarConstrucao(int matricula, String nome, String tipo, String endereco, double valor) {
		try {
			Scanner scanner = new Scanner(System.in);

			if (tipo.equalsIgnoreCase("C")) {
				Casa casa = new Casa(matricula, nome, tipo, endereco, valor);
				listaCasa.add(casa);
			} else if (tipo.equalsIgnoreCase("P")) {
				Predio predio = new Predio(matricula, nome, tipo, endereco, valor);
				listaPredio.add(predio);
			} else if (tipo.equalsIgnoreCase("L")) {
				Loja loja = new Loja(matricula, nome, tipo, endereco, valor);
				listaLoja.add(loja);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// removendo casa
	public static void remover(int matricula) {
		try {
			listaCasa.removeIf(casa -> casa.getMatricula() == matricula);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Imobiliaria [toString()=" + super.toString() + "]";
	}

	// listar todas as casas
	public static void listarTodasCasas() {
		try {
			for (Casa casa : listaCasa) {
				System.out.println(casa.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// listando casa pela matricula
	public static void listarCasaMatricula(int matricula) {
		try {
			for (Casa casa : listaCasa) {
				if (casa.getMatricula() == matricula) {
					System.out.println(casa.toString());
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// inserindo descrição
	public static void addDescrição(int matricula, String tipo, String inserirDescricao) {
		try {
			if (tipo.equalsIgnoreCase("c")) {
				for (Casa casa : listaCasa) {
					if (casa.getMatricula() == matricula) {
						casa.descricaoInterface(inserirDescricao);
					} else {
						System.out.println("Matricula não encontada");
					}

				}
			} else if (tipo.equalsIgnoreCase("l")) {
				for (Loja loja : listaLoja) {
					if (loja.getMatricula() == matricula) {
						loja.descricaoInterface(inserirDescricao);
					} else {
						System.out.println("Matricula não encontada");
					}
				}
			} else if (tipo.equalsIgnoreCase("p")) {
				for (Predio predio : listaPredio) {
					if (predio.getMatricula() == matricula) {
						predio.descricaoInterface(inserirDescricao);
					} else {
						System.out.println("Matricula não encontada");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Area construida
	public static void addAreaConstruida(int matricula, String tipo, double largura, double comprimento) {
		try {
			if (tipo.equalsIgnoreCase("c")) {
				for (Casa casa : listaCasa) {
					if (casa.getMatricula() == matricula) {
						casa.calcularAreaInterface(largura, comprimento);
					} else {
						System.out.println("Matricula não encontrada");
					}
				}
			} else if (tipo.equalsIgnoreCase("l")) {
				for (Loja loja : listaLoja) {
					if (loja.getMatricula() == matricula) {
						loja.calcularAreaInterface(largura, comprimento);
					} else {
						System.out.println("Matricula não encontrada");
					}
				}
			} else if (tipo.equalsIgnoreCase("p")) {
				for (Predio predio : listaPredio) {
					if (predio.getMatricula() == matricula) {
						predio.calcularAreaInterface(largura, comprimento);
					} else {
						System.out.println("Matricula não encontrada");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// listando loja pela matricula
	public static void listarLojaMatricula(int matricula) {
		try {
			for (Loja loja : listaLoja) {
				if (loja.getMatricula() == matricula) {
					System.out.println(loja.toString());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// listar todas as lojas
	public static void listarTodasLojas() {
		try {
			for (Loja loja : listaLoja) {
				System.out.println(loja.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// remover lojas
	public static void removerLojas(int matricula) {
		try {
			listaLoja.removeIf(loja -> loja.getMatricula() == matricula);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// listando predio pela matricula
	public static void listarPredioMatricula(int matricula) {
		try {
			for (Predio predio : listaPredio) {
				if (predio.getMatricula() == matricula) {
					System.out.println(predio.toString());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// listar todas os predios
	public static void listarTodasPredios() {
		try {
			for (Predio predio : listaPredio) {
				System.out.println(predio.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// remover predios
	public static void removePredios(int matricula) {
		try {
			listaPredio.removeIf(predio -> predio.getMatricula() == matricula);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Listando todos os imóveis
	public static void listarTodosImoveis() {
		try {
			System.out.println("------------ Listando todas as casas --------------");
			if (listaCasa.isEmpty()) {
				System.out.println("Não possui casa cadastrada");
			} else {
				for (Casa casa : listaCasa) {
					System.out.println(casa.toString());
				}
			}

			System.out.println("\n------------ Listando todas as lojas --------------");
			if (listaLoja.isEmpty()) {
				System.out.println("Não possui loja cadastrada");
			} else {
				for (Loja loja : listaLoja) {
					System.out.println(loja.toString());
				}
			}

			System.out.println("\n------------ Listando todos os prédios --------------");
			if (listaPredio.isEmpty()) {
				System.out.println("Não possui prédio cadastrado");
			} else {
				for (Predio predio : listaPredio) {
					System.out.println(predio.toString());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	//Zerando BD
	public static void zerandoBD() {
		try {
			listaCasa.removeAll(listaCasa);
			listaLoja.removeAll(listaLoja);
			listaPredio.removeAll(listaPredio);

			if (listaCasa.isEmpty() && listaLoja.isEmpty() && listaPredio.isEmpty()) {
				System.out.println("Banco zerado");
			} else {
				System.out.println("Não foi possível zerar o banco de dados");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
