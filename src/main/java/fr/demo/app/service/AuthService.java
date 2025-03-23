package fr.demo.app.service;

import fr.demo.app.bo.Article;
import fr.demo.app.bo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    public ServiceResponse<User> login(String email, String password) {
        User fakeUser = new User("admin", "unMotDePasse");

        // Erreur couple email/mot de passe un correct
        if (!fakeUser.getEmail().equals(email) || !fakeUser.getPassword().equals(password)) {
            return ServiceResponse.performResponse("701", "Erreur couple email/mot de passe un correct", null);
        }

        return ServiceResponse.performResponse("200", "Connecté(e) avec succès", fakeUser);
    }
}
