package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entities.citerne;

import java.util.List;


public interface CiterneInterface {

    List<citerne> retrieveAllCiterne();

    citerne addCiterne(citerne e);

    citerne updateCiterne(citerne e);

    void removeCiterne(Long idCiterne);
}
