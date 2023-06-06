CREATE TABLE public.books
(
    book_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
    bookname character varying NOT NULL,
    author character varying NOT NULL,
    price integer NOT NULL,
    PRIMARY KEY (book_id)
);

ALTER TABLE IF EXISTS public.books
    OWNER to postgres;
