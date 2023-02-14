import dao.Impl.UserDao;
import dao.Impl.UserDaoImplTwo;
import service.Impl.UserServiceImpl;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
      //  service.setDao(new UserDao());
        service.setDao(new UserDaoImplTwo());
        service.save();
    }
}
