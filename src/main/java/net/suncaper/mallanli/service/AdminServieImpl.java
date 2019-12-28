package net.suncaper.mallanli.service;

import net.suncaper.mallanli.common.domain.Admin;
import net.suncaper.mallanli.common.domain.AdminExample;
import net.suncaper.mallanli.mapper.extend.AdminMapperExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminServieImpl implements AdminServie {
    @Autowired
    private AdminMapperExtend adminMapper;

    public Admin findAdminByLoginName(Admin admin) {
        AdminExample example = new AdminExample();
        example.createCriteria().andLoginnameEqualTo(admin.getLoginname());
        List<Admin> list = adminMapper.selectByExample(example);
        return list.size()>0?list.get(0):null;
    }

    @Transactional
    public int addAdmin(Admin admin) {
        return adminMapper.insert(admin);
    }
}
