package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.entities.Pompe;

public interface PompeRepository extends PanacheRepository<Pompe> {
}
