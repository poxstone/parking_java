package com.brisasparking.controller;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brisasparking.model.ClienteRespository;
import com.brisasparking.model.ClienteModel;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteRespository repository;
   
    @GetMapping("/list")
    public String listClients() {
    	
    	// save new
    	//repository.save(new Cliente("juanito", "alimania"));
    	
    	/*
        Iterable<Cliente> iterator = repository.findAll();
        System.out.println("All expense items: ");
        iterator.forEach(item -> System.out.println(item));
        
        List<Cliente> breakfast = repository.findByApellido("ortiz");
        System.out.println("\nHow does my breakfast cost?: ");
        breakfast.forEach(item -> System.out.println(item));
    	 */
        
        List<ClienteModel> listado = repository.listApellido("ortiz");
        System.out.println("\nHow does my breakfast cost?: ");
        listado.forEach(item -> System.out.println(item));

        return "cliente";
    }
    
    @GetMapping("/getByName/{name}")
    public List<ClienteModel> getClient(@PathVariable String name) {
    	
    	List<ClienteModel> cliente = repository.findByNombre(name);
    	cliente.forEach(item -> System.out.println(item));

        return cliente;
    }
    
    @PutMapping("/add")
    public ResponseEntity<ClienteModel> addClient(@RequestBody ClienteModel cliente) {
    	
    	// save new
    	//Cliente nuevoCliente = repository.save(new Cliente("juanito", "alimania"));
    	ClienteModel nuevoCliente = repository.save(cliente);

        return ResponseEntity.created(URI.create("/cliente/" + nuevoCliente.getId_cliente())).body(nuevoCliente);
    }
    
    @DeleteMapping("/del/{id_cliente}")
    public ResponseEntity<ClienteModel> delClient(@PathVariable Integer id_cliente) {
    	
    	// delete cliente
    	repository.deleteById(id_cliente);

        return ResponseEntity.noContent().build();
    }
    
    @PostMapping("/edit/{id_cliente}")
    public ResponseEntity<ClienteModel> editClient(@PathVariable Integer id_cliente, @RequestBody ClienteModel cliente) {
    	repository.updateClient(1, "aminta", "idalid");
        return ResponseEntity.noContent().build();
    }
}

