# votemq

`votemq` é uma aplicação baseada em Spring Boot projetada para gerenciar o processo de votação de candidatos. A aplicação utiliza RabbitMQ para comunicação assíncrona e PostgreSQL como banco de dados subjacente. Este projeto é configurado para executar sob o Java 17 e utiliza diversas bibliotecas para auxiliar no desenvolvimento.

## Estrutura do Projeto

A seguir, uma visão geral dos diretórios e arquivos principais deste projeto:

- `src/main/java/yago/ferreira/votemq/`: Contém o código fonte principal da aplicação.
- `src/main/resources`: Contém arquivos de configuração de recursos.
- `pom.xml`: Arquivo de configuração do Maven, especifica dependências e plugins do projeto.
- `docker-compose.yml`: Arquivo para configuração e execução de serviços Docker, como banco de dados PostgreSQL e RabbitMQ.

## Requisitos

- Java 17 (Corretto)
- Maven 3.6+
- Docker e Docker Compose

## Como Executar

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu_usuario/votemq.git
   cd votemq
   ```

2. **Configuração do Banco de Dados e Broker de Mensagens**

   Utilize o Docker Compose para levantar os serviços necessários:

   ```bash
   docker-compose up
   ```

   Isso irá iniciar serviços do RabbitMQ e PostgreSQL.

3. **Construir e Executar a Aplicação**

   Compile e execute a aplicação usando Maven:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

A aplicação expõe APIs RESTful para interação. Abaixo está uma breve descrição do endpoint disponível:

- **POST /api/v1/voto**

  Processa um voto para um candidato específico.

  Exemplo de Requisição:

  ```json
  {
    "idCandidato": 1
  }
  ```

## Arquitetura

A arquitetura do `votemq` é composta por várias camadas:

- **Camada de Aplicação**: Contém serviços e controladores que lidam com a lógica de negócios e expõem APIs RESTful.
- **Camada de Domínio**: Define as entidades e casos de uso da aplicação.
- **Camada de Infraestrutura**: Gerencia a persistência de dados e a comunicação com serviços externos, como RabbitMQ.

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para construção da aplicação.
- **RabbitMQ**: Usado como sistema de mensagens para comunicação assíncrona.
- **PostgreSQL**: Banco de dados relacional para persistência de dados.
- **MapStruct**: Ferramenta para mapeamento de DTOs.
- **Lombok**: Biblioteca para redução de código boilerplate.
- **Docker**: Para gerenciar ambientes de desenvolvimento e produção.

## Contribuição

Contribuições são bem-vindas! Para contribuir, siga as etapas padrão de fork e pull request do GitHub.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

Este README fornece uma visão geral de como configurar, executar e entender a arquitetura do `votemq`. Para mais informações, consulte a documentação oficial das bibliotecas mencionadas.