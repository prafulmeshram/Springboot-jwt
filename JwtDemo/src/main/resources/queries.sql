insert into tab_user(user_id, email, mobile_number, password, username)values(1, 'meshrampraful3@gmail.com', '8408070640', '$2a$10$xKJ4XNL6TrUfaCPue983T.m5MOmVlzM2bpDzSghrAklCJpcQ954ku', 'admin');

INSERT INTO tab_role (id,  name) VALUES (1,'ADMIN'),(2,'USER');

insert into tab_user_roles(user_id,role_id)values(1,1);



