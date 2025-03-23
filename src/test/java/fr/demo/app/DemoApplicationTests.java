package fr.demo.app;

import fr.demo.app.bo.Article;
import fr.demo.app.bo.User;
import fr.demo.app.service.ArticleService;
import fr.demo.app.service.AuthService;
import fr.demo.app.service.ServiceResponse;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ArticleService articleService;

	@Autowired
	AuthService authService;

	@Test
	void contextLoads() {
	}

	@Test
	void articleTest() {

		// Articles fonctionelles
		ServiceResponse<List<Article>> response = articleService.getAll();

		assertEquals("200", response.code);
	}

	@Test
	void authTest() {

		// User existant
		ServiceResponse<User> response = authService.login("admin", "unMotDePasse");
		assertEquals("200", response.code);

		// User inexistant
		ServiceResponse<User> responseNotWork = authService.login("admin", "admin");
		assertEquals("701", responseNotWork.code);
	}

}
