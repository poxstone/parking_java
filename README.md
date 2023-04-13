# application

## curls

```bash

Insert
curl -L -X PUT "http://localhost:8080/clientes/add" -H "Content-Type: application/json" -d '{"nombre": "walter", "apellido": "mojica"}';

delete
curl -L -X DELETE "http://localhost:8080/clientes/del/2" -H "Content-Type: application/json";

update
curl -L -X POST "http://localhost:8080/clientes/edit/1" -H "Content-Type: application/json" -d '{"nombre": "aminta", "apellido": "perez"}';

```