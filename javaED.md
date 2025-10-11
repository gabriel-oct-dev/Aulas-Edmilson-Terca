
# Linguagem de Programação

## O que é uma linguagem de alto nível?

Uma **linguagem de programação de alto nível** permite que programadores escrevam instruções de forma mais próxima da linguagem humana, facilitando o desenvolvimento de programas.

> **Exemplos:** Java, Python, C#

---

## Comentários em Java

Comentários servem para explicar, documentar ou facilitar a leitura do código. São ignorados pelo compilador.

- **Comentário de linha:** começa com `//` e vai até o final da linha.
    ```java
    // Este é um comentário de linha
    int idade = 20; // Comentário ao lado do código
    ```
- **Comentário de bloco:** começa com `/*` e termina com `*/`, podendo ocupar várias linhas.
    ```java
    /*
     * Este é um comentário de bloco
     * que pode ocupar várias linhas.
     */
    System.out.println("Exemplo");
    ```

> Utilize comentários para tornar seu código mais compreensível!

---

## Variáveis

- **Nome:** Identificador usado para acessar o valor armazenado.
- **Tipo:** Define o tipo de dado que a variável pode armazenar (ex: `int`, `double`, `String`).

**Exemplo:**
```java
int idade = 25;
double altura = 1.75;
String nome = "Ana";
```

---

## Comandos de Entrada e Saída

- **Entrada:** Receber dados do usuário (classe `Scanner` em Java).
    ```java
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    int idade = sc.nextInt();
    String nome = sc.nextLine();
    ```
- **Saída:** Exibir informações na tela.
    ```java
    System.out.println("Olá, mundo!");
    ```

---

## Estruturas de Controle

### Decisão

Permite executar comandos diferentes dependendo de uma condição.

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

Também é possível usar `switch` para múltiplas opções:
```java
int dia = 2;
switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    // ...
    default:
        System.out.println("Dia inválido");
}
```

---

### Repetição

Permite executar um bloco de código várias vezes.

- **for**: Quando se sabe o número de repetições.
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }
    ```
- **while**: Quando não se sabe o número de repetições.
    ```java
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }
    ```
- **do-while**: Garante pelo menos uma execução.
    ```java
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);
    ```
