package com.ihm.service;
import com.ihm.model.LoginHistory;
import java.util.List;

public interface LoginHistoryService {

	public abstract long countAllLogins();


	public abstract void deleteLoginHistory(LoginHistory loginHistory);


	public abstract LoginHistory findLoginHistory(Long id);


	public abstract List<LoginHistory> findAllLogins();


	public abstract List<LoginHistory> findLoginHistoryEntries(int firstResult, int maxResults);


	public abstract void saveLoginHistory(LoginHistory loginHistory);


	public abstract LoginHistory updateLoginHistory(LoginHistory loginHistory);

}
