/**
* Autores:
*       Santiago Agredo Vallejo 
*       Pablo Jose Restrepo Ruiz
*       Jojan Esteban Serna Serna
*       Arturo Restrepo Ruiz
*/

/**
*
*/

create table user(
    user_id integer not null,
    rol_id integer not null, 
    user_birth_date date not null,
    user_email text not null,
    user_phone text not null,
    user_card text not null,
    user_realname text not null,
    user_username text not null,
    user_password text not null,
    constraint pk_user primary key (user_id), 
    constraint fk_user_rol FOREIGN key (rol_id) REFERENCES rol(rol_id)
);

create table rol(
    rol_id integer not null,
    rol_name text not null,
    constraint pk_rol primary key(rol_id)
);

create table category(
    category_id integer not null,
    category_name text not null,
    constraint pk_category primary key (category_id)
);

create table product(
    product_id integer not null,
    user_id integer not null,
    category_id integer not null,
    product_name text not null,
    product_description text not null,
    product_price real not null,
    product_stock integer not null,
    product_latitude integer not null,
    product_length integer not null,
    constraint pk_product primary key (product_id),
    constraint fk_product_user FOREIGN KEY (user_id) REFERENCES user(user_id),
    constraint fk_product_category FOREIGN KEY (category_id) REFERENCES category(category_id)
);

CREATE TABLE orders(
  orders_id INTEGER not null, ----Incrementativa
  user_id INTEGER not null,
  product_id INTEGER not null,
  orders_status TEXT not null,
  orders_price REAL not null,
  constraint pk_orders primary key (orders_id),
  constraint fk_orders_user FOREIGN KEY (user_id) REFERENCES user(user_id),
  constraint fk_orders_product FOREIGN KEY (product_id) REFERENCES product(product_id),
  constraint ckc_status CHECK (orders_status IN ('entregado','cancelado','en espera'))
);

create table delivery(
    delivery_id integer not null, ----Incrementativa
    orders_id integer not null,
    repartidor_id integer not null,
    delivery_receptor text not null,
    delivery_date date not null,
    constraint pk_delivery primary key (delivery_id),
    constraint fk_delivery_orders FOREIGN KEY (orders_id) REFERENCES orders(orders_id),
    constraint fk_delivery_user FOREIGN KEY (repartidor_id) REFERENCES user(user_id)
);