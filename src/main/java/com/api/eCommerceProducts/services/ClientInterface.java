package com.api.eCommerceProducts.services;

import com.api.eCommerceProducts.models.Client;

import java.util.List;

public interface ClientInterface {
    Client CreateClient(Client paramClient);
    List<Client> GetAllClient();
}
