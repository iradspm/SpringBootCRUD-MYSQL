package com.iradspm.springbootcrudmysql.Repository;

import com.iradspm.springbootcrudmysql.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD operations will be fetched from JpaRepository/CRUDRepository
public interface UserRepository extends JpaRepository<User,Integer> {

}
