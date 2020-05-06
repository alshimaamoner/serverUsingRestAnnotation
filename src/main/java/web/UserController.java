package web;

import web.User;
import web.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/getNetSalary", method = RequestMethod.POST)
    public float getNetSalary(@RequestBody User user){
        System.out.println("test");
        return userService.getNetSalary(user);
    }
    @GetMapping(path = "/get")
    public User getUser() {
        System.out.println("get...........");
        User user = new User();
        user.setName("Alshimaaaaaaaa");
        user.setSalary(10000);
        System.out.println("ddd");
        return user;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}