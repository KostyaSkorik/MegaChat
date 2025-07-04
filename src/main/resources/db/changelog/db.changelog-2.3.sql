--liquibase formatted sql
--changeset liquibase:add column password
ALTER TABLE users add column password varchar(150);
