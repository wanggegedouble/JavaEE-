import com.wy.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        UserServiceImpl bookService = (UserServiceImpl) context.getBean("bookService");
        bookService.ServiceSave();
    }
}
