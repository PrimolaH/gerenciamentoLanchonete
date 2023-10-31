create table cliente
(
    nr_cpf     int          null,
    id         bigint       not null
        primary key,
    ds_email   varchar(255) null,
    nm_cliente varchar(255) null
);

create table pagamento
(
    vl_total   int    null,
    id         bigint not null
        primary key,
    id_cliente bigint null,
    constraint FK4m0hn0cs8y78h61cnj0ay0w2
        foreign key (id_cliente) references cliente (id)
);

create table pedido
(
    ds_status  tinyint        null,
    vl_total   decimal(38, 2) null,
    id         bigint         not null
        primary key,
    id_cliente bigint         null,
    constraint FK9y4jnyp1hxqa386cnly0ay9uw
        foreign key (id_cliente) references cliente (id),
    check (`ds_status` between 0 and 3)
);

create table produto
(
    id_categoria tinyint        null,
    vl_preco     decimal(38, 2) null,
    id_produto   bigint         not null
        primary key,
    ds_imagem    varchar(255)   null,
    ds_produto   varchar(255)   null,
    nm_produto   varchar(255)   null,
    check (`id_categoria` between 0 and 3)
);

create table produto_pedido
(
    id_pedido  bigint not null,
    id_produto bigint not null,
    constraint FK3moid9j0iyby8p094vaij1bo5
        foreign key (id_pedido) references pedido (id),
    constraint FKcfjlvdadqb9dtdqptw61mpl7l
        foreign key (id_produto) references produto (id_produto)
);