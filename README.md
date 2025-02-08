# controle-pessoas-api
API RESTful para cadastro e gerenciamento de pessoas, desenvolvida com Spring Boot, JPA e consumo de API ViaCEP.

## **2️⃣ Estruturando o Projeto no Repositório**  
Crie a seguinte estrutura de pastas e arquivos no seu projeto:

```
controle-pessoas-api/
│── src/
│   ├── main/
│   │   ├── java/br/com/controle/pessoas/
│   │   │   ├── controller/    # Controladores da API
│   │   │   ├── service/       # Regras de negócio
│   │   │   ├── repository/    # Repositórios JPA
│   │   │   ├── model/         # Modelos de entidades
│   │   │   ├── dto/           # Objetos de Transferência de Dados
│   │   │   ├── mapper/        # Conversões entre DTO e Model
│   │   │   ├── ControlePessoasApplication.java
│   ├── test/   # Testes unitários e de integração
│── .gitignore
│── README.md
│── pom.xml
```

---

## **3️⃣ Criando um `README.md` Profissional**  
O `README.md` é a vitrine do seu projeto! Um bom exemplo para você:  

```markdown
# Controle de Pessoas API 🏡

API RESTful para cadastro e gerenciamento de pessoas, desenvolvida com Spring Boot, JPA e consumo da API ViaCEP.

## 🚀 Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- Jakarta Validation
- WebClient (consumo de API externa)
- Banco de dados MySQL

## 📌 Funcionalidades
- Cadastro de pessoas com validações de entrada
- Busca automática de endereço via API do ViaCEP
- Persistência dos dados com JPA e banco relacional

## 🔧 Como Executar
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/controle-pessoas-api.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd controle-pessoas-api
   ```
3. Compile e execute:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API no navegador ou via Postman:
   ```
   http://localhost:8080/pessoas
   ```

## 📩 Endpoints
| Método | Endpoint | Descrição |
|--------|---------|-----------|
| POST   | `/pessoas` | Cadastrar uma nova pessoa |

## 📄 Melhorias Futuras
- Implementação de atualização e remoção de registros
- Implementação de testes unitários e integração com JUnit

## 📌 Contato
👤 **Magno Souza**  
📧 magnoapt@gmail.com

---

## **4️⃣ Adicionando ao GitHub**
Agora, no seu terminal (dentro da pasta do projeto), execute:  

```sh
git init
git add .
git commit -m "Primeiro commit - Estrutura inicial do projeto"
git branch -M main
git remote add origin https://github.com/seu-usuario/controle-pessoas-api.git
git push -u origin main
```
