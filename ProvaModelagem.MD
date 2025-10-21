# Guia de Estudos Completo - Modelagem de Software

Este guia foca nos conceitos aprofundados de planejamento, estrutura e design da interface e dos dados de um sistema, utilizando os princípios de HCI e a definição estrutural de bancos de dados.

---

## 1. Modelagem da Experiência do Usuário (HCI)

A Interação Humano-Computador (HCI) é fundamental para criar interfaces que sejam intuitivas, acessíveis e eficientes. A modelagem da experiência considera fatores humanos, cognitivos e emocionais que influenciam a interação do usuário com o sistema.

### 1.1 Fatores Humanos no Design da Interface

**Cor**
* **Importância:** As cores são essenciais para identificação, diferenciação e associação de elementos na interface.
* **Dicas Práticas:**
    * Use cores para indicar diferentes estados do sistema (ex: vermelho para erro, verde para sucesso, amarelo para atenção).
    * Evite depender exclusivamente da cor para transmitir informações importantes, levando em conta usuários com daltonismo.
    * Garanta que haja contraste suficiente entre o texto e a cor de fundo para assegurar a legibilidade.
* **Exemplo:** Um botão de "Excluir" é frequentemente vermelho, enquanto um de "Salvar" pode ser verde.

**Fonte (Tipografia)**
* **Importância:** Uma tipografia adequada é crucial para facilitar a leitura e a compreensão das informações apresentadas.
* **Boas Práticas:**
    * Escolha fontes que sejam simples e legíveis.
    * Utilize tamanhos de fonte apropriados para diferentes dispositivos e tamanhos de tela.
    * Evite usar muitas fontes diferentes na mesma interface para manter a consistência visual.
    * Para acessibilidade, considere permitir que o usuário ajuste o tamanho da fonte.

### 1.2 Engenharia Semiótica e Meta-Mensagem

**Engenharia Semiótica**
* Estuda como os designers comunicam significados através de símbolos, ícones, cores e linguagem visual. O usuário interpreta esses símbolos com base em suas experiências, cultura e contexto.
* **Exemplos Visuais Universais:**
    * Um **X** ou sinal vermelho geralmente indica "fechar", "cancelar" ou "excluir".
    * Um "checkmark" verde normalmente significa "confirmar" ou "sucesso".
    * Ícones como lixeira, lupa e engrenagem são compreendidos de forma quase universal.
* **Dica:** Sempre que possível, combine ícones com rótulos de texto para garantir maior clareza na comunicação.

**Meta-Mensagem**
* Refere-se à intenção implícita que é transmitida pelo design da interface.
* **Exemplos:**
    * Um botão destacado com uma cor vibrante sugere ser a principal ação a ser realizada na tela.
    * Um texto em cinza claro pode indicar que uma opção está desabilitada ou indisponível.

### 1.3 Engenharia Cognitiva e Modelos de Design

A Engenharia Cognitiva aplica conhecimentos sobre como as pessoas pensam e aprendem para criar sistemas mais eficientes.

* **Modelo de Usuário (User Model):** Representa o que o usuário acredita sobre o funcionamento do sistema. Por exemplo, um usuário espera que clicar em um ícone de "casa" o leve para a página inicial.
* **Modelo do Designer (Designer's Model):** É a visão e a intenção do designer ao criar a interface, incluindo decisões sobre cores, fluxo de tarefas e organização.
* **Imagem do Sistema (System Image):** É a interface real que é apresentada ao usuário, com todos os seus elementos visuais e interações. O objetivo é que a Imagem do Sistema seja o mais próxima possível do Modelo de Usuário.
* **Modelo de Tarefas (Task Model):** Descreve as etapas e ações que um usuário precisa realizar para atingir um objetivo específico.

> **Dica:** Teste a interface com usuários reais para garantir que o modelo mental deles esteja alinhado com o design proposto pelo sistema.

### 1.4 Exercícios Práticos

1. Identifique três problemas de usabilidade em uma interface que você utiliza frequentemente e sugira melhorias.
2. Crie um protótipo simples de uma tela de login, considerando as boas práticas de HCI.
3. Liste os elementos visuais de uma interface e explique como eles comunicam suas funções ao usuário.

---

## 2. Modelagem de Banco de Dados (DDL)

Esta etapa consiste em definir a estrutura lógica onde os dados do sistema serão armazenados.

### DDL (Data Definition Language)
* **O que é?** É a Linguagem de Definição de Dados, utilizada para definir e modificar a estrutura do banco de dados, como tabelas e esquemas.
* **Principais Comandos DDL:**

| Comando | Função na Modelagem |
|:---:|:---|
| `CREATE` | Cria a estrutura de novas tabelas e esquemas. |
| `USE` | Seleciona qual o banco de dados que será utilizado. |
| `ALTER` | Altera a estrutura de tabelas que já existem. |
| `DROP` | Remove completamente tabelas e esquemas do banco de dados. |

* **Exemplo de Código DDL:**
    ```sql
    CREATE TABLE alunos (
      id INT PRIMARY KEY,
      nome VARCHAR(100),
      ativo BOOLEAN DEFAULT true
    );
    ```

### 2.1 Exercícios Práticos

1. Crie uma tabela chamada `produtos` com os campos `id`, `nome`, `preco` e `estoque`.
2. Altere a tabela `produtos` para adicionar um campo `categoria`.
3. Escreva um comando para deletar a tabela `clientes` do banco de dados.