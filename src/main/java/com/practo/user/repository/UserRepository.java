package com.practo.user.repository;

import com.practo.user.entities.User;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository implements PanacheRepositoryBase<User, Integer> {
}
