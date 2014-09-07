package com.ihm.service;
import com.ihm.model.UserRole;
import java.util.List;

public interface UserRoleService {

	public abstract long countAllUserRoles();


	public abstract void deleteUserRole(UserRole role);


	public abstract UserRole findUserRole(Long id);


	public abstract List<UserRole> findAllUserRoles();


	public abstract List<UserRole> findUserRoleEntries(int firstResult, int maxResults);


	public abstract void saveUserRole(UserRole userRole);


	public abstract UserRole updateUserRole(UserRole userRole);

}
