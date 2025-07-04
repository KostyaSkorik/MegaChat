--liquibase formatted sql
--changeset liquibase:add column password
ALTER TABLE users
