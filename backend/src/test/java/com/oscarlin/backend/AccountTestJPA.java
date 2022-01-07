package com.oscarlin.backend;

import com.oscarlin.backend.entity.domain.Department;
import com.oscarlin.backend.entity.domain.Group;
import com.oscarlin.backend.entity.domain.User;
import com.oscarlin.backend.entity.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountTestJPA {


    private UserRepository userRepository;



    @Autowired
    public void autoWired(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void add() {

        Department department = new Department();
        department.setDepartmentId("D0520900");

        Group group=new Group();
        group.setGroupId("300");

        User user = new User();
        user.setUserId("124");
        user.setUserName("企業網站技術member4");
        user.setIsDelete("N");
        user.setDepartment(department);
        user.setGroup(group);
        userRepository.save(user);

    }

    @Test
    public void find() {
        List<User> users = userRepository.findByUserNameContains("boss");

        System.out.println("find");
        if (!users.isEmpty()) {
            for (User user : users) {
                System.out.println(user.getUserId());
                System.out.println(user.getUserName());
                System.out.println(user.getDepartment());
                System.out.println(user.getGroup());
                System.out.println(user.getIsDelete());
                System.out.println(user);
            }
        } else {
            System.out.println("empty");
        }
    }

    @Test
    public void check() {
        Table table = User.class.getAnnotation(Table.class);
        String tableName = table.name();

        System.out.println(tableName);

    }

}
