DELETE TABLE IF EXISTS public."Books"
CREATE TABLE public."Books"
(
    book_id integer NOT NULL,
    bookname character varying NOT NULL,
    author character varying NOT NULL,
    price integer NOT NULL,
);
ALTER TABLE IF EXISTS public."Books"    
   OWNER to postgres;
