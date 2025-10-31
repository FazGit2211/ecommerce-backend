package com.api.eCommerceProducts.repositorys;

import com.api.eCommerceProducts.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
