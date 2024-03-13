package org.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDAO userDAO;

    public void SignUp(String userId, String password){
        userDAO.saveUser(new User(userId, password));

    }

    public String login(String userId, String password){
        User user = userDAO.findUser(userId);

        if(user == null){
            return "아이디에 해당하는 유저를 찾을 수 없어요.";
        }
        if(!password.equals(user.getPassword())){
            return "비밀번호가 일치하지 않아요.";
        }
        return "로그인 성공!!!!\n" + user.getUserId() + "님 환영할까요????";
    }

}
