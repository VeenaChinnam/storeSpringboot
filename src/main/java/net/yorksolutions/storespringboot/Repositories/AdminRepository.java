package net.yorksolutions.storespringboot.Repositories;

import net.yorksolutions.storespringboot.Entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
}

