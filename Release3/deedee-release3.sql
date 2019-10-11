Q1. Who checked out the book "The Hobbit"?

select member.name from book JOIN checkout_item on book.ID = checkout_item.book_id JOIN member on member.id = checkout_item.member_id where book.title = "The Hobbit";

→ Anand Beck 

----------------------------------------------------------------------
Q2. How many people have not checked out anything? 

select (Select count(*) from member) - (select count(distinct member_id) from checkout_item);


→ 37

----------------------------------------------------------------------
Q3. What books and movies aren't checked out? 

select title from book UNION ALL select title from movie except select title from (select * from checkout_item left join book on checkout_item.book_id = book.id where book.title is not null UNION ALL select * from checkout_item left join movie on checkout_item.movie_id = movie.id where movie.title is not null);

→  
1984
Catcher in the Rye
Crouching Tiger, Hidden Dragon
Domain Driven Design
Fellowship of the Ring
Lawrence of Arabia
Office Space
Thin Red Line
To Kill a Mockingbird
Tom Sawyer

----------------------------------------------------------------------
Q4. Add the book "The Pragmatic Programmer", and add yourself as a member. Check out "The Pragmatic Programmer". Use your query from question 1 to verify that you have checked it out. Also, provide the SQL used to update the database.

insert into book(title) values ("The Pragmatic Programmer");
insert into member(name) values ("Deedee");

insert into checkout_item(member_id, book_id, movie_id) values((select id from member where name = "Deedee"), (select id from book where title = "The Pragmatic Programmer"), NULL);

select member.name from book JOIN checkout_item on book.ID = checkout_item.book_id JOIN member on member.id = checkout_item.member_id where book.title = "The Pragmatic Programmer";

→ Deedee

----------------------------------------------------------------------
Q5. Who has checked out more than 1 item? Tip: Research the GROUP BY syntax. 

Select name from checkout_item join member where member.id = checkout_item.member_id group by member_id having count(*) > 1;

→ 
Anand Beck
Frank Smith