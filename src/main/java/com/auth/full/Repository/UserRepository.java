package com.auth.full.Repository;

import com.auth.full.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {

    public UserInfo findByUserName(String userName);

}
