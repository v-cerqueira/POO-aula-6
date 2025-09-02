# Trabalho de Programação Orientada a Objetos

## Sistema de Gerenciamento de Funcionários

### Descrição
Este projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos, com o objetivo de aplicar os conceitos de POO em Java. O sistema gerencia funcionários de uma empresa, utilizando herança, abstração, interface e polimorfismo.

### Estrutura do Projeto
- `Funcionario`: Classe abstrata base para todos os funcionários.
- `Gerente`: Classe filha de Funcionario, implementa a interface Bonificavel.
- `Estagiario`: Classe filha de Funcionario.
- `Bonificavel`: Interface para cálculo de bônus.
- `Empresa`: Classe principal para testes e demonstração do polimorfismo.

### Como Executar
1. Compile todos os arquivos Java:
   ```
javac Empresa.java
```
2. Execute o programa principal:
   ```
java Empresa
```

### Exemplos de Saída
O programa exibe informações dos funcionários, incluindo nome, salário, função e bônus (quando aplicável).

### Autor
Aluno: [Vinicius Cerqueira Silva]
Curso: [Analise e Desenvolvimento de Sistemas]
Disciplina: Programação Orientada a Objetos
Data: Setembro/2025
