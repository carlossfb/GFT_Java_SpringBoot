package com.gftjava.springproject.controller;

import com.gftjava.springproject.entity.Client;
import com.gftjava.springproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client saveClient(Client client){
        return clientService.saveClient(client);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Client> listClient(){
        return clientService.listClient();
    }

    /*@GetMapping("/{id}")
    public Client searchClientById(@PathVariable("id") Long id){
        return clientService.clientById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado."));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClientById(@PathVariable("id") Long id){
        clientService.clientById(id)
                .map(client ->{
                    clientService.deleteClient(client.getId());
                    return Void.TYPE;
                }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado."));
    }
*/
}
