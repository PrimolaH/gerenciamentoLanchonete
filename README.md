
# Web Service BurguerFast

1. [Documentação API](#doc-api)
2. [Documentação](#doc)
3. [Run projeto](#run-project)
4. [Autores](#autors)
4. [Sintaxe de Markdown](#syntax)

**Sistema da lanchonete que realiza:**
- Cadastro e gerenciamento de produto (adicionar, editar e remover);
- Consultas de produto (cardapio);
- Cadastro de cliente;
- Cadastro de pedidos e gerenciamento do pedido (atualização de status do pedido);
- Realização de pagamento do pedido;

<div id="doc-api" />

## Documentação da API

-- Swagger:http://localhost:8080/burgerfast-documentation.html

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

<div id="doc"/>

## Documentação

- Miro:https://miro.com/app/board/uXjVNW3P5mA=/?share_link_id=922512094469
- Postman: [burguerFast.postman_collection.json](collection%2FburguerFast.postman_collection.json)  na raiz do repositorio

<div id="run-project"/>

## Run Project

A aplicação possui um *DockerFile* onde controi a imagem da api e um *docker-composer* para criar as instancias do banco e da api.
para rodar a aplicação basta apenas rodar os comandos:

**Acessar a pasta aplication**
```dockerfile
cd application
```
**Construir a imagem da aplicação**
```dockerfile
docker build . -t burgerfast:latest
```
**Subir as instâncias da aplicação**
```dockerfile
docker-compose up
```

pronto a aplicação está rodando e executando perfeitamente.

<div id="autors"/>

## Autores

- RM 352282 : Diego de Lima Lopes;
- RM 352398 : Primola Helena de Oliveira

