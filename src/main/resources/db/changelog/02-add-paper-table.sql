CREATE TABLE paper
(
    id        BIGSERIAL PRIMARY KEY,
    person_id BIGINT REFERENCES person (id) ON DELETE CASCADE,
    authors   VARCHAR(255),
    isbn      VARCHAR(255),
    topic     VARCHAR(255)
);