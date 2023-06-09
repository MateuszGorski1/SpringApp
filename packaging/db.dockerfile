FROM postgres:14.7-bullseye
COPY init.sql /docker-entrypoint-initdb.d/
