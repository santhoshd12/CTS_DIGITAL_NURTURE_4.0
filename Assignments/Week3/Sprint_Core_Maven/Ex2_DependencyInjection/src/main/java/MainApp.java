

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // Load Spring ApplicationContext from XML file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean from Spring container
        BookService bookService = (BookService) context.getBean("bookService");

        // Call service method
        bookService.addBook("Spring Framework Essentials");

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
