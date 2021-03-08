package com.bankapp.backend.web.v1;

import com.bankapp.backend.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.bankapp.backend.web.ApiConstatns.API_PREFIX;
import static com.bankapp.backend.web.ApiConstatns.CLIENT_PREFIX;
import static com.bankapp.backend.web.ApiConstatns.V1;

@RestController(value = API_PREFIX + V1 + CLIENT_PREFIX)
@RequiredArgsConstructor
public class ClientController {


    @GetMapping("/{id}")
    public Mono<Client> getClientById(@PathVariable String id) {
        return null;
    }

    @GetMapping()
    public Flux<Client> getClients(@RequestParam String offset,
                                   @RequestParam String limit) {
        return null;
    }

    @PutMapping("/{id}")
    public Mono<Client> editClient(@PathVariable String id,
                                   @RequestBody Client client) {
        return null;
    }

    @PostMapping()
    public Mono<Client> createClient(@RequestBody Client client) {
        return null;
    }
}
