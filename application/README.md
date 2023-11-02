
# Web Service BurguerFast

**Sistema da lanchonete que realiza:**
- Cadastro e gerenciamento de produto (adicionar, editar e remover);
- Consultas de produto (cardapio);
- Cadastro de cliente;
- Cadastro de pedidos e gerenciamento do pedido (atualização de status do pedido);
- Realização de pagamento do pedido;


## Documentação da API

#### Criar cadastro Cliente

```http
  POST /cliente
```

| Parâmetro   | Tipo       | Obrigatoriedade |
| :---------- | :--------- | :---------------------------------- |
| `cpf` | `string` | **Obrigatório**. |
| `nome` | `string` | **Obrigatório**. |
| `email` | `string` | **Obrigatório**. |

Exemplo:
```json
{
    "cpf":"40037881957",
    "name": "Jose Carlos da Silva",
    "email":"jose@gmail.com"
}
```

#### Retorna cliente cadastrado

```http
  GET /cliente/{cpf}
```

| Parâmetro   | Tipo       | Obrigatoriedade                                   |
| :---------- | :--------- | :------------------------------------------ |
| `cpf`      | `string` | **Obrigatório**. |


Exemplo retorno:
```json
{
    "id": 1,
    "cpf": "40037881957",
    "name": "Jose Carlos da Silva",
    "email": "jose@gmail.com"
}
```

#### Adicionar produto

```http
  POST /produto
```

| Parâmetro   | Tipo       | Obrigatoriedade                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | **Obrigatório**. |
| `categoria` | `string` | **Obrigatório**.  |
| `preco` | `string` | **Obrigatório**. |
| `descricao` | `string` | **Obrigatório**. |
| `image` | `string` | **Obrigatório**.  |

Exemplo:
```json
{
    "nome":"Guarana",
    "categoria":"BEBIDA",
    "preco":"10.00",
    "descricao":"Refrigerante de Guarana",
    "imagem":""
}
```

#### Editar produto

```http
  PUT /produto
```

| Parâmetro   | Tipo       | Obrigatoriedade                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | **Obrigatório**. |
| `categoria` | `string` | **Obrigatório**.  |
| `preco` | `string` | **Obrigatório**. |
| `descricao` | `string` | **Obrigatório**. |
| `image` | `string` | **Obrigatório**.  |

Exemplo:
```json
{
    "nome":"Coca Cola",
    "categoria":"BEBIDA",
    "preco":"10.00",
    "descricao":"Refrigerante",
    "imagem":""
}
```


#### remover produto

```http
  DELETE /produto/{id_produto}
```

| Parâmetro   | Tipo       | Obrigatoriedade                           |
| :---------- | :--------- | :---------------------------------- |
| `id_produto` | `string` | **Obrigatório**. |


#### Consultar lista de  produtos

```http
  GET /produto/{categoria}
```

| Parâmetro   | Tipo       | Obrigatoriedade                           |
| :---------- | :--------- | :---------------------------------- |
| `categoria` | `string` | **Obrigatório**. |

Exemplo:
```json
{
    "nome":"Coca Cola",
    "categoria":"BEBIDA",
    "preco":"10.00",
    "descricao":"Refrigerante",
    "imagem":""
}
```


#### Efetuar Pagamento

```http
  POST /pagamento
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `categoria` | `string` | **Obrigatório**. A chave da sua API |

Exemplo:
```json
{
  "cliente": {
    "id": 1
  },
  "pedido": {
    "id": 1
  },
  "total": 10.00
}
```


#### Criar pedido

```http
  POST /pedido
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `categoria` | `string` | **Obrigatório**. A chave da sua API |

Exemplo:
```json
{
  "status": "RECEBIDO",
  "produtos": [
    {
      "id": 1
    }
  ],
  "cliente": {
    "id": 1
  }
}
```

 

#### Consultar pedido

```http
  GET /pedido
```

Exemplo:
```json
[
    {
        "id": 4,
        "status": "RECEBIDO",
        "produtos": [
            {
                "id": 1,
                "nome": "x-salada",
                "categoria": "LANCHE",
                "preco": 25.00,
                "descricao": "pão, hamburguer (200g), alface, tomate, e queijo prato",
                "imagem": ""
            }
        ],
        "cliente": {
            "id": 1,
            "cpf": "40037881957",
            "name": "Jose Carlos da Silva",
            "email": "jose@gmail.com"
        },
        "total": 25.00
    }
]
```


## Documentação

- Repositório:
- Miro:https://miro.com/app/board/uXjVNW3P5mA=/?share_link_id=922512094469
- Swagger:http://localhost:8080/burgerfast-documentation.html
- Postman



## Autores

- RM 352282 : Diego de Lima Lopes;
- RM 352398 : Primola Helena de Oliveira

