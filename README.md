<h2>About the project</h2>
<p>
  This project is a list of games that has a database connection to save all game information, and has a customizable order
</p>
<h2>Description</h2>
<p>
  Project done during the Spring Boot intensive by teacher Nelio Alves, one big reference about programming in Brazil
</p>

<h2>Technologies used and versions</h2>
<table>
<tr>
  <th>Java</th>
  <th>Spring Boot</th>
  <th>Maven</th>
</tr>
<tr>
  <td>17</td>
  <td>3.3.5</td>
  <td>3.1.0</td>
</tr>
</table>

<h2>Postman</h2>

![Screenshot](https://github.com/pbelem/SpringBootProject/blob/main/assets/Screenshot%20%28160%29.png?raw=true)


<h2>Learned concepts</h2>
  <ul>
    <li>Web systems and resources</li>
    <li>Client/server, HTTP, JSON</li>
    <li>Rest pattern for web API</li>
    <li>Spring Rest project structuring</li>
    <li>Entities and ORM</li>
    <li>Database seeding</li>
    <li>Pattern layers</li>
    <li>Controller, service, repository</li>
    <li>DTO standart</li>
    <li>Association class, embedded id</li>
    <li>SQL queries in Spring Data JPA</li>
    <li>Projections</li>
  </ul>

  <h2>Script docker compose</h2>
  
  ```bash
  version: "3.7"
services:
  # ====================================================================================================================
  # POSTGRES SERVER
  # ====================================================================================================================
  pg-docker:
    image: postgres:14-alpine
    container_name: dev-postgresql
    environment:
      POSTGRES_DB: mydatabase
      POSTGRES_PASSWORD: 1234567
    ports:
      - 5434:5432
    volumes:
      - ./.data/postgresql/data:/var/lib/postgresql/data
    networks:
      - dev-network
  # ====================================================================================================================
  # PGADMIN
  # ====================================================================================================================
  pgadmin-docker:
    image: dpage/pgadmin4
    container_name: dev-pgadmin
    environment:
      PGADMIN_DEFAULT_EMAIL: me@example.com
      PGADMIN_DEFAULT_PASSWORD: 1234567
    ports:
      - 5050:80
    volumes:
      - ./.data/pgadmin:/var/lib/pgadmin
    depends_on:
      - pg-docker
    networks:
      - dev-network
# ======================================================================================================================
# REDE
# ======================================================================================================================
networks:
  dev-network:
    driver: bridge
    ```
