package io.swagger.api.dao;

import io.swagger.model.Client;
import io.swagger.model.Clients;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// Classe substituta do BD
public class ClientDAO {

    private static Clients clients;

    public ClientDAO() {
        clients = new Clients();
        clients.add(mockInitial());
    }

    public Clients findAll() {
        return clients;
    }

    public Client save(Client client) {
        client.setId(generateId());
        client.setLastUpdate(OffsetDateTime.now());
        client.setStatus(true);

        clients.add(client);

        return client;
    }

    public boolean delete(Integer id) {
        Integer idToRemove = null;

        for (Client client : clients) {
            if (client.getId().equals(id)) {
                idToRemove = clients.indexOf(client);
            }
        }

        if (idToRemove != null) {
            return clients.remove(idToRemove);
        }

        return false;
    }

    public Client findById(Integer id) {
        Integer idToRead = null;

        for (Client client : clients) {
            if (client.getId().equals(id)) {
                idToRead = clients.indexOf(client);
            }
        }

        if (idToRead != null) {
            return clients.get(idToRead);
        }

        return null;
    }

    public List<Client> findByLastName(String lastName) {
        return clients.stream()
                .filter(c -> c.getLastName().contains(lastName))
                .collect(Collectors.toList());
    }

    private Client mockInitial() {
        Client client = new Client();
        client.setId(125);
        client.setName("Bruno César");
        client.setLastName("Vicente");
        client.setInitials("BCV");
        client.setStatus(Boolean.TRUE);
        client.setType(Client.TypeEnum.INTERN);
        client.setBirthDate(LocalDate.of(1996, 3, 12));
        client.setLastUpdate(OffsetDateTime.now());

        return client;
    }

    private Integer generateId() {
        Double random = Math.random() * 112;
        return new Random().nextInt(random.intValue()) + 132;
    }
}
