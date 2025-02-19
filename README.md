# FucturaImobiliaria
 Criação de um crud Imobiliária - projeto de entrega Mod-1 java Fuctura

- Projeto Imobiliária
    
    Você foi contratado para desenvolver um sistema de gestão de imóveis para uma nova imobiliária. A imobiliária oferece diversos tipos de construções, como casas, prédios e lojas, e deseja uma estrutura flexível para adicionar outros tipos de construções ao catálogo.
    
    **Especificações**
    
    **Interface Construcao**:
    
    → Crie uma interface Construcao com os seguintes métodos:
    
    - double calcularArea(): Calcula a área da construção.
    - String getDescricao(): Retorna uma descrição genérica da construção.
    
    **Classe Abstrata Imovel**:
    
    → Crie uma classe abstrata Imovel que implementa a interface Construcao. Esta classe contém:
    
    - Atributos endereco e preco.
    double calcularArea(): Método abstrato para calcular a área da construção.
    String getDescricao(): Método abstrato para obter uma descrição genérica da construção.
    
    **Três Tipos de Construção (Subclasses de Imovel)**:
    
    → Crie três classes concretas que herdam da classe Imovel: Casa, Predio e Loja.
    
    - Implemente os métodos abstratos calcularArea e getDescricao de acordo com as especificidades de cada tipo de construção.
    
    **Classe Imobiliaria**
    
    → Crie uma classe chamada Imobiliaria que fará a gestão do catálogo de construções.
    
    - Utilize uma ArrayList para armazenar as construções adicionadas.
    - Implemente os seguintes métodos:
        - void adicionarConstrucao(Construcao construcao): Adiciona uma construção ao catálogo.
        - void removerConstrucao(Construcao construcao): Remove uma construção do catálogo.
        - void listarConstrucoes(): Lista as construções no catálogo.
        - double informarArea(): Informa a área total das construções no catálogo.
    
    **Classe Menu**
    
    → Crie uma classe Menu que interage com o sistema da imobiliária.
    
    - Implemente um menu interativo com opções para adicionar, remover, listar construções e informar a área total.
    - Utilize a classe Scanner para receber entradas do usuário.
    
    **Classe Principal para Testar o Sistema**
    
    → Crie uma classe principal com o método main para testar o sistema da imobiliária.
    
    → Crie um objeto do tipo Imobiliaria, adicione diferentes construções ao catálogo, liste as construções disponíveis e informe a área total das construções no catálogo.
