package net.suncaper.mallanli.service;

import net.suncaper.mallanli.common.domain.Admin;

public interface AdminServie {
    public Admin findAdminByLoginName(Admin admin);

    public int addAdmin(Admin admin);
}
