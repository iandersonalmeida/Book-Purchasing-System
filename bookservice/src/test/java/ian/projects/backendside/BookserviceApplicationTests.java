package ian.projects.backendside;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ian.projects.backendside.controller.BookServiceController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BookserviceApplicationTests {
	
	@Autowired	
	private BookServiceController bookServiceController;

	@Test
	void contextLoads() throws Exception {
		assertThat(bookServiceController).isNotNull();				
	}

}
