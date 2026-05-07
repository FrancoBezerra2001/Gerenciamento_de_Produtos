🚀 Sistema de Gerenciamento de Produtos e Categorias
Este é um projeto desenvolvido com Spring Boot, JPA e Hibernate para gerenciar produtos e suas respectivas categorias. O sistema permite o cadastro de itens, associação entre tabelas e consultas avançadas com paginação e ordenação.

🛠️ Tecnologias Utilizadas
Java 17 (ou superior)

Spring Boot 3.x

Spring Data JPA (Persistência de dados)

Hibernate (Implementação do ORM)

H2 Database (Banco de dados em memória para testes rápidos)

Maven (Gerenciador de dependências)

📁 Estrutura do Projeto
A organização segue o padrão de camadas para garantir a separação de responsabilidades:
src/main/java/com/exemplo/gerenciamento
├── config/       # Configuração de carga inicial (DataLoader)
├── controller/   # Endpoints REST da aplicação
├── dto/          # Objetos de transferência de dados
├── entities/     # Mapeamento das tabelas Categoria e Produto
├── repositories/ # Interfaces de acesso ao banco (Spring Data JPA)
└── services/     # Lógica de negócio e regras de persistência

⚙️ Como Executar o Projeto
Clone o repositório:

Bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
Abra no VS Code:

Certifique-se de ter a extensão Extension Pack for Java instalada.

Execute a aplicação:

Localize o arquivo principal GerenciamentoApplication.java e clique em Run.

Ou utilize o terminal:

Bash
mvn spring-boot:run
Acesse o Banco de Dados (H2 Console):

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

User: sa | Password: (em branco)

📡 Endpoints Principais
Produtos
Cadastrar Produto: POST /api/produtos

JSON
{
  "nome": "Teclado Mecânico",
  "descricao": "Switch Blue RGB",
  "preco": 250.0,
  "categoria": { "id": 1 }
}
Listar com Filtro e Paginação: GET /api/produtos?nome=Teclado&page=0&size=5&direction=asc

🧠 Conceitos Aplicados
Relacionamento ManyToOne: Muitos produtos podem pertencer a uma única categoria.

Lazy Loading: Carregamento sob demanda para otimizar o desempenho do sistema.

JPQL Customizada: Uso da anotação @Query para buscas personalizadas por nome.

Paginação e Ordenação: Implementação nativa com Pageable e Sort para lidar com grandes volumes de dados de forma eficiente.

⭐ Este projeto foi desenvolvido como parte de um estudo prático de Java Back-end.
