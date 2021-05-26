package guru.springframework.apifaketory.services;

import guru.springframework.apifaketory.api.domain.User;
import guru.springframework.apifaketory.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://private-anon-4a160623e5-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);
        return userData.getData();
    }
}
