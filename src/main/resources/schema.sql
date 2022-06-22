create table movie(
 movie_id int primary key auto_increment,
 name varchar(50) not null,
 director varchar(50) not null,
 producer varchar(50) not null,
 actor_id int not null
);