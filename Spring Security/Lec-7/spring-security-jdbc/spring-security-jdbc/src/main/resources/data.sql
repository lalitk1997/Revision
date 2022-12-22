INSERT INTO users (username, password, enabled)
VALUES('lalit', 'password', true);

INSERT INTO users (username, password, enabled)
VALUES('mr bean', 'teddy', true);

INSERT INTO authorities(username, authority)
VALUES('lalit', 'ROLE_USER');

INSERT INTO authorities(username, authority)
VALUES('mr bean', 'ROLE_ADMIN');