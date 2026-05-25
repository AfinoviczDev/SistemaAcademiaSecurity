package dev.afinovicz.springbootessentialsJPA.database.repository;

import dev.afinovicz.springbootessentialsJPA.database.model.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository  extends JpaRepository<RolesEntity, Integer> {
}
