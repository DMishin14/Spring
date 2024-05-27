package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.addCar(new Car("BMW", 5));
      userService.addCar(new Car("Audi", 8));
      userService.addCar(new Car("Mercedez", 1));
      userService.addCar(new Car("Lada", 7));

      List<Car> cars = userService.listCars();

      userService.add(new User("Валерий", "Карпин", "karp@mail.ru", cars.get(0)));
      userService.add(new User("Артем", "Дзюба", "dzuba@mail.ru", cars.get(1)));
      userService.add(new User("Григорий", "Щедрин", "chedr@mail.ru", cars.get(2)));
      userService.add(new User("Валерий", "Чащин", "4chin@mail.ru", cars.get(3)));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Car = "+user.getCar());
         System.out.println();
      }

      User owner = userService.getUserByCar("BMW", 5);
      System.out.println(owner);

      context.close();
   }
}