create table cliente
(
    id_cliente bigint auto_increment
        primary key,
    ds_email   varchar(255) null,
    nm_cliente varchar(255) null,
    nr_cpf     varchar(255) null
);

create table pagamento
(
    vl_total     int    null,
    id_cliente   bigint null,
    id_pagamento bigint auto_increment
        primary key,
    constraint FK4m0hn0cs8y78h61cnj0ay0w2
        foreign key (id_cliente) references cliente (id_cliente)
);

create table pedido
(
    ds_status  tinyint        null,
    vl_total   decimal(38, 2) null,
    id_cliente bigint         null,
    id_pedido  bigint auto_increment
        primary key,
    constraint FK9y4jnyp1hxqa386cnly0ay9uw
        foreign key (id_cliente) references cliente (id_cliente),
    check (`ds_status` between 0 and 3)
);

create table produto
(
    id_categoria int            null,
    vl_preco     decimal(38, 2) null,
    id_produto   bigint auto_increment
        primary key,
    ds_imagem    varchar(255)   null,
    ds_produto   varchar(255)   null,
    nm_produto   varchar(255)   null
);

create table produto_pedido
(
    id_pedido  bigint not null,
    id_produto bigint not null,
    constraint FK3moid9j0iyby8p094vaij1bo5
        foreign key (id_pedido) references pedido (id_pedido),
    constraint FKcfjlvdadqb9dtdqptw61mpl7l
        foreign key (id_produto) references produto (id_produto)
);

