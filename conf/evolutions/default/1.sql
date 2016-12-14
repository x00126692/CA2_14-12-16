# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  id                            bigint not null,
  name                          varchar(255),
  description                   varchar(255),
  price                         double,
  constraint pk_product primary key (id)
);
create sequence product_seq;

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);


# --- !Downs

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists user;

