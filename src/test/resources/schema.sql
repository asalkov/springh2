DROP TABLE ITEM IF EXISTS;
CREATE TABLE IF NOT EXISTS ITEM  (
	ID BIGINT IDENTITY NOT NULL PRIMARY KEY ,
	NAME VARCHAR(100) NOT NULL,
);