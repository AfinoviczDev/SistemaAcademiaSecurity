package dev.afinovicz.springbootessentialsJPA.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Graph;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "tb_roles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RolesEntity implements GrantedAuthority {

    @Id
    private Integer id;
    private String nome;

    @Override
    public @Nullable String getAuthority() {
        return nome;
    }
}
