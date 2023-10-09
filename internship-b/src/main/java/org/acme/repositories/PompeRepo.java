package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entities.Pompe;

@ApplicationScoped
public class PompeRepo implements PanacheRepository<Pompe>, PompeRepository  {
}
