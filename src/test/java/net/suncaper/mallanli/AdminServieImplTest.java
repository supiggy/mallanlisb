package net.suncaper.mallanli;

import net.suncaper.mallanli.common.domain.Admin;
import net.suncaper.mallanli.service.AdminServie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminServieImplTest {
    @Autowired
    AdminServie adminServie;

    @Test
    public void findAdminByLoginName() {
        Admin a = new Admin();
        a.setLoginname("admin");
        Admin admin = adminServie.findAdminByLoginName(a);
        System.out.println(admin);
    }

    @Test
    public void addAdmin() {
        adminServie.addAdmin(new Admin("hello","hello123"));
    }
}