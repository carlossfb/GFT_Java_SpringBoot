package com.gftjava.springproject.service;

import com.gftjava.springproject.entity.Client;
import com.gftjava.springproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    public List<Client> listClient(){
        return clientRepository.findAll();
    }

    public Optional<Client> clientById(Long id){
        return clientRepository.findById(id);
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

}
