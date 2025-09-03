# Practical Activity – Project `prjBook`

Build a project identified as **prjBook**.  
Based on the modeling of the **Book** class, implement it in the **Java** language.

---

## Class Book

| Attribute         | Description                                      |
|-------------------|--------------------------------------------------|
| `id : int`        | Book Identifier                                  |
| `title : String`  | Book Title                                       |
| `status : boolean`| Book Status:<br>- `false` → Available<br>- `true` → Borrowed |
| `dailyFineValue : double` | Daily fee charged for late returns        |

### Methods
| Método                              | Descrição                                                                                   |
|--------------------------------------|---------------------------------------------------------------------------------------------|
| `Book(int, String)`                  | Construtor com parâmetros (identificador e título do livro).                                |
| `setDailyFineValue(double) : void`   | Define o valor da multa diária.                                                             |
| `getId() : int`                      | Retorna o identificador do livro.                                                           |
| `getTitle() : String`                | Retorna o título do livro.                                                                  |
| `getStatus() : boolean`              | Retorna o status do livro (disponível ou emprestado).                                       |
| `borrow() : void`                    | Empresta o livro, alterando o status para **emprestado** (`true`).                          |
| `returnBook(int) : double`           | Recebe o número de dias de atraso, define o status para **disponível** (`false`) e retorna o valor da multa. |

---

## Class Aplic (Aplic.java)

This class is responsible for running the application.  
It must instantiate a **Book** object and interact with it using the following menu:

### Menu
```

1 - Consult book
2 - Borrow book
3 - Return book
4 - Exit

Enter your option:

```

---

## Considerations

- Input data must be read using the **Scanner** class.
- **Consult book:** should display the identifier, title, and status (Available or Borrowed).
- If attempting to **borrow** a book that is already borrowed → show:  
  `"The book is already borrowed!"`
- If attempting to **return** a book that is already available → show:  
  `"The book is already available!"`
- On **Borrow book** operation → show:  
  `"The book status has been updated!"`
- On **Return book** operation → show:  
  `"The book has been returned!"`  
  If there is a fine, display the amount due.
