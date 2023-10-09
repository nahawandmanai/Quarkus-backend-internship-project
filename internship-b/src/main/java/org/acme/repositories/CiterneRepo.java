package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entities.citerne;

@ApplicationScoped
public class CiterneRepo implements PanacheRepository<citerne>, CiterneRepository  {
}
