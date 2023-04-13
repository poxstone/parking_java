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

# update
curl -X POST "http://localhost:8080/clientes/edit/1" -H "Content-Type: application/json" -d '{"nombre": "aminta", "apellido": "perez"}';

# delete
curl -X DELETE "http://localhost:8080/clientes/del/2" -H "Content-Type: application/json";
```

### Vehiculos:

```bash
# List all
curl -X GET "http://localhost:8080/vehiculos/list";

# Get by id_client
curl -X GET "http://localhost:8080/vehiculos/getByClientId/2";

# Insert
curl -X PUT "http://localhost:8080/vehiculos/add" -H "Content-Type: application/json" -d '{"placa":"bhz-222", "tipo_vehiculo": "cedan", "id_cliente": 1}';

# update
curl -X POST "http://localhost:8080/vehiculos/edit/bhz-222" -H "Content-Type: application/json" -d '{"tipo_vehiculo": "furgon", "id_cliente": 2}';

# delete
curl -X DELETE "http://localhost:8080/vehiculos/del/2" -H "Content-Type: application/json";
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

# update
curl -X POST "http://localhost:8080/operadores/edit/1" -H "Content-Type: application/json" -d '{"nombre": "carlos", "apellido": "puertas"}';

# delete
curl -X DELETE "http://localhost:8080/operadores/del/2" -H "Content-Type: application/json";
```

### Recaudo:

```bash
# List all
curl -X GET "http://localhost:8080/recaudos/list";

# Get by id_client
curl -X GET "http://localhost:8080/recaudos/getByRecaudoId/1";

# Get by id_movimiento
curl -X GET "http://localhost:8080/recaudos/getByMovimientoId/1";

# Insert
curl -X PUT "http://localhost:8080/recaudos/add" -H "Content-Type: application/json" -d '{"valor_minuto": 60, "total_minutos": 90, "total_pagar": 5400, "id_movimiento": 1}';

# update
curl -X POST "http://localhost:8080/recaudos/edit/1" -H "Content-Type: application/json" -d '{"valor_minuto": 60, "total_minutos": 45, "total_pagar": 2700, "id_movimiento": 1}';

# delete
curl -X DELETE "http://localhost:8080/recaudos/del/2" -H "Content-Type: application/json";
```


