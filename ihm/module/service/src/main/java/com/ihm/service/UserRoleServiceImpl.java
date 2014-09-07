package com.ihm.service;

import com.ihm.dao.UserRoleDAO;
import com.ihm.model.UserRole;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
    private UserRoleDAO userRoleDAO;

	public long countAllUserRoles() {
        return userRoleDAO.count();
    }

	public void deleteUserRole(UserRole userRole) {
        userRoleDAO.delete(userRole);
    }

	public UserRole findUserRole(Long id) {
        return userRoleDAO.findOne(id);
    }

	public List<UserRole> findAllUserRoles() {
        return userRoleDAO.findAll();
    }

	public List<UserRole> findUserRoleEntries(int firstResult, int maxResults) {
        return userRoleDAO.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveUserRole(UserRole userRole) {
        userRoleDAO.save(userRole);
    }

	public UserRole updateUserRole(UserRole userRole) {
        return userRoleDAO.save(userRole);
    }


}
