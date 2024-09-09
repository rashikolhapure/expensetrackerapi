package in.rashi.expensetrackerapi.service;

import in.rashi.expensetrackerapi.entity.User;
import in.rashi.expensetrackerapi.entity.UserModel;

public interface UserService {

    User createUser(UserModel User);

    User read(Long id);

    User update(User user, Long id);

    void delete(Long id);

}
