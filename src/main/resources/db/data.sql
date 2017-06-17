insert into role(role_name) values('ADMIN');
insert into role(role_name) values('USER');
insert into role(role_name) values('GUEST');

insert into account(username, password, email) 
values('admin', 'jGl25bVBBBW96Qi9Te4V37Fnqchz/Eu4qB9vKrRIqRg=', 'admin@mail.com');

insert into account_role(account_id, role_id) values(1, 1);
