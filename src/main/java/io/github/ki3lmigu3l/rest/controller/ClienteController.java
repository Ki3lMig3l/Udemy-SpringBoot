package io.github.ki3lmigu3l.rest.controller;

import io.github.ki3lmigu3l.domain.entity.Cliente;
import io.github.ki3lmigu3l.domain.repositorios.Clientes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ClienteController {

    private Clientes clientes;

    public ClienteController(Clientes clientes){
        this.clientes = clientes;
    }


    @GetMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity getClienteById( @PathVariable("id") Integer id){

        Optional<Cliente> cliente = clientes.findById(id);
        if(cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());

        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
