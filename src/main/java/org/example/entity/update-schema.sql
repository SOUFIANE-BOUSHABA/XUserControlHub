CREATE TABLE users
(
    id                    BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    first_name            VARCHAR(255)                            NOT NULL,
    last_name             VARCHAR(255)                            NOT NULL,
    identification_number VARCHAR(255),
    nationality           VARCHAR(255),
    registration_date     date,
    expiration_date       date,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE users
    ADD CONSTRAINT uc_users_identification_number UNIQUE (identification_number);