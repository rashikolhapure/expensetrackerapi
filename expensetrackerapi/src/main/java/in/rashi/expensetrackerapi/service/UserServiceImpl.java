package in.rashi.expensetrackerapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rashi.expensetrackerapi.entity.User;
import in.rashi.expensetrackerapi.entity.UserModel;
import in.rashi.expensetrackerapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository; 

    @Override
    public User createUser(UserModel User) {
        User newUser = new User();
        BeanUtils.copyProperties(User, newUser);      
        return userRepository.save(newUser);
    }

    @Override
    public User read(Long id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User update(User user, Long id) {
        User oUser = read(id);

        oUser.setName(user.getName() != null ? user.getName() : oUser.getName());

        oUser.setEmail(user.getEmail() != null ? user.getEmail() : oUser.getEmail());

        oUser.setPassword(user.getPassword() != null ? user.getPassword() : oUser.getPassword());

        oUser.setAge(user.getAge() != null ? user.getAge() : oUser.getAge());

        return userRepository.save(oUser);
    }

    @Override
    public void delete(Long id) {
        User user = read(id);
        userRepository.delete(user);
    }
}
