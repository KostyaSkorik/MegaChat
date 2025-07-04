--liquibase formatted sql
--changeset liquibase:drop company-locales
DROP TABLE company_locales cascade;
