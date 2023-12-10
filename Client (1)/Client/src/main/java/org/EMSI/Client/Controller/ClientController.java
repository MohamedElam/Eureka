package org.EMSI.Client.Controller;

import org.EMSI.Client.Model.Client;
import org.EMSI.Client.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List FindAll() {
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client ClientById(@PathVariable Long id) throws Exception {
        return this.clientRepository.findById(id).orElseThrow(() -> new Exception("Client inexistant"));
    }
}
