package com.ihm.service;

import com.ihm.dao.LoginHistoryDAO;
import com.ihm.model.LoginHistory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginHistoryServiceImpl implements LoginHistoryService {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
    private LoginHistoryDAO loginHistoryDAO;

	public long countAllLogins() {
        return loginHistoryDAO.count();
    }

	public void deleteLoginHistory(LoginHistory loginHistory) {
		loginHistoryDAO.delete(loginHistory);
    }

	public LoginHistory findLoginHistory(Long id) {
        return loginHistoryDAO.findOne(id);
    }

	public List<LoginHistory> findAllLogins() {
        return loginHistoryDAO.findAll();
    }

	public List<LoginHistory> findLoginHistoryEntries(int firstResult, int maxResults) {
        return loginHistoryDAO.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }

	public void saveLoginHistory(LoginHistory loginHistory) {
		loginHistoryDAO.save(loginHistory);
    }

	public LoginHistory updateLoginHistory(LoginHistory loginHistory) {
        return loginHistoryDAO.save(loginHistory);
    }
}
