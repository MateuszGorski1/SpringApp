FROM postgres:14.7-bullseye
ENV PGDATA=/var/lib/postgresql/data/pgdata
ENV POSTGRES_PASSWORD=postgres
COPY init.sql /docker-entrypoint-initdb.d/
