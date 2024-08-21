package org.fastcampus.fastcampusprojectboard.repository;


import org.fastcampus.fastcampusprojectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}