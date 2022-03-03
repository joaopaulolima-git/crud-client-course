package com.jpdev.crudclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpdev.crudclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity <List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "João","123456789", 200.00 , null , 2 ));
		list.add(new Client(2L, "Bob","987654321", 200.00 , null , 3 ));
		list.add(new Client(3L, "Maria","1111222333", 200.00 , null , 2 ));
		return ResponseEntity.ok().body(list);
		
	}
}
