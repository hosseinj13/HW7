CREATE TABLE IF NOT EXISTS authors
(
    author_id  SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    age        DATE
);

CREATE TABLE IF NOT EXISTS books
(
    book_id          SERIAL PRIMARY KEY,
    title            VARCHAR(255),
    publication_year SMALLINT,
    author_id        INT,
    FOREIGN KEY (author_id) REFERENCES authors (author_id)
);