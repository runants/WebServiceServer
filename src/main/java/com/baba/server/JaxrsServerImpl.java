package com.baba.server;

import com.baba.entity.Car;
import com.baba.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Ant
 * @Date: 2018/12/14 15:17
 * @Version 1.0
 */
public class JaxrsServerImpl implements JaxrsServer {
    @Override
    public void saveUser(User user) {
        System.out.println("save user:"+user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setId(1);
        user1.setUsername("小明");
        user1.setCity("北京");

        users.add(user1);

        List<Car> carList1 = new ArrayList<Car>();
        Car car1 = new Car();
        car1.setId(101);
        car1.setCarName("保时捷");
        car1.setPrice(1000000d);
        carList1.add(car1);
        Car car2 = new Car();
        car2.setId(102);
        car2.setCarName("宝马");
        car2.setPrice(400000d);
        carList1.add(car2);
        user1.setCars(carList1);

        return users;
    }

    @Override
    public void update(User user) {

        User user1 = new User();
        System.out.println(user1);

    }

    @Override
    public User finUserById(Integer id) {

        if (id == 1) {
            User user1 = new User();
            user1.setId(1);
            user1.setUsername("小明");
            user1.setCity("北京");
            return user1;
        } else if (id == 2) {
            User user2 = new User();
            user2.setId(1);
            user2.setUsername("小明2");
            user2.setCity("北京2");
            return user2;
        }
        return null;

    }

    @Override
    public void delete(Integer id) {
        System.out.println("delete user id :" + id);
    }
}
