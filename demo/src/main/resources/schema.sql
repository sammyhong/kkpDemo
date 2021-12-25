DROP TABLE IF EXISTS User;

CREATE TABLE User
(
    id          VARCHAR(255)    PRIMARY KEY,
    name        VARCHAR(255)    NOT NULL,
    age    		VARCHAR(255)    NOT NULL,
    regi_dt     VARCHAR(255)
);

DROP TABLE IF EXISTS Account;

CREATE TABLE Account
(
    id          VARCHAR(255)    NOT NULL,
    account     VARCHAR(255)    PRIMARY KEY
);

DROP TABLE IF EXISTS AccountContent;

CREATE TABLE AccountContent
(
    account     	VARCHAR(255)    NOT NULL,
    in_out_yn     	VARCHAR(255)    NOT NULL,
    deposit     	NUMBER    NOT NULL,
    deposit_date     DATE    		NOT NULL
);