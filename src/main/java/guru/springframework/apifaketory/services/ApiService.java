package guru.springframework.apifaketory.services;

import guru.springframework.apifaketory.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
