package com.api.eCommerceProducts.services;

import com.api.eCommerceProducts.models.Client;
import com.api.eCommerceProducts.repositorys.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientService implements ClientInterface{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client CreateClient(Client paramClient) {
        try {
            if(paramClient.getName().trim() != "" && paramClient.getSurname().trim() != "" && paramClient.getEmail().trim() != ""){
                return clientRepository.save(paramClient);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Client> GetAllClient() {
        try{
            return clientRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
