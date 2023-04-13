# application

## curls

### Clientes:

```bash
# List all
curl -X GET "http://localhost:8080/clientes/list";

# Get by id_client
curl -X GET "http://localhost:8080/clientes/getById/1";

# Get by nombre and apellido
curl -X GET "http://localhost:8080/clientes/getByNameLastName/walter/mojica";

# Insert
curl -X PUT "http://localhost:8080/clientes/add" -H "Content-Type: application/json" -d '{"nombre": "walter", "apellido": "mojica"}';

# delete
curl -X DELETE "http://localhost:8080/clientes/del/2" -H "Content-Type: application/json";

# update
curl -X POST "http://localhost:8080/clientes/edit/1" -H "Content-Type: application/json" -d '{"nombre": "aminta", "apellido": "perez"}';
```

### Vehiculos:

```bash
# List all
curl -X GET "http://localhost:8080/vehiculos/list";

# Get by id_client
curl -X GET "http://localhost:8080/vehiculos/getByClientId/2";

# Insert
curl -X PUT "http://localhost:8080/vehiculos/add" -H "Content-Type: application/json" -d '{"placa":"bhz-222", "tipo_vehiculo": "cedan", "id_cliente": 1}';

# delete
curl -X DELETE "http://localhost:8080/vehiculos/del/2" -H "Content-Type: application/json";

# update
curl -X POST "http://localhost:8080/vehiculos/edit/bhz-222" -H "Content-Type: application/json" -d '{"tipo_vehiculo": "furgon", "id_cliente": 2}';
```

### Operador:

```bash
# List all
curl -X GET "http://localhost:8080/operadores/list";

# Get by id_client
curl -X GET "http://localhost:8080/operadores/getById/1";

# Get by nombre and apellido
curl -X GET "http://localhost:8080/operadores/getByNameLastName/sergio/cabrera";

# Insert
curl -X PUT "http://localhost:8080/operadores/add" -H "Content-Type: application/json" -d '{"nombre": "sergio", "apellido": "cabrera"}';

# delete
curl -X DELETE "http://localhost:8080/operadores/del/2" -H "Content-Type: application/json";

# update
curl -X POST "http://localhost:8080/operadores/edit/1" -H "Content-Type: application/json" -d '{"nombre": "carlos", "apellido": "puertas"}';
```


