--liquibase formatted sql
--changeset liquibase:add default password
ALTER TABLE users alter column password set default '{noop}123'
