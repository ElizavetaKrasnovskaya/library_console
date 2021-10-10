package com.bsuir.lab.service;

import com.bsuir.lab.dao.Dao;
import com.bsuir.lab.dao.RoleDaoImpl;
import com.bsuir.lab.model.Role;

public class RoleServiceImpl implements Service<Role> {

    private Dao<Role> dao = new RoleDaoImpl();

    @Override
    public Role getById(int id) {
        return dao.getById(id);
    }

    @Override
    public void save(Role role) {
        dao.save(role);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void update(Role role) {
        dao.update(role);
    }
}