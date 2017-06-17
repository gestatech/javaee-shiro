create table account(
    id serial primary key,
    username varchar(100) not null,
    password varchar(255) not null,
    email varchar(100) not null
);

create table role(
    id serial primary key,
    role_name varchar(25) not null
);

create table account_role(
    id serial primary key,
    account_id integer not null,
    role_id integer not null,
    foreign key(account_id) references account(id),
    foreign key(role_id) references role(id)
);
