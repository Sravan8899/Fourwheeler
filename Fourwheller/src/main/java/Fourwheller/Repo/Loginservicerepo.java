package Fourwheller.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Fourwheller.entity.Loginuser;

public interface Loginservicerepo extends JpaRepository<Loginuser, String>{


}
