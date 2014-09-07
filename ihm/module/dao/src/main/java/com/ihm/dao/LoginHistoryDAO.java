package com.ihm.dao;
import com.ihm.model.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginHistoryDAO extends JpaRepository<LoginHistory, Long>, JpaSpecificationExecutor<LoginHistory> {
}
