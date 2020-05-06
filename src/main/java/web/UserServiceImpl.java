package web;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public float getNetSalary(User user) {
        return user.getSalary() + user.getBonus() - user.getDeduction();
    }
}