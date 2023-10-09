package org.acme.services;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.acme.entities.citerne;
import org.acme.repositories.CiterneRepository;

import java.util.List;

@ApplicationScoped
public class CiterneService implements CiterneInterface {
    @Inject
    CiterneRepository citerneRepository;

    public List<citerne> retrieveAllCiterne() {
        return citerne.listAll(Sort.by("Nature"));
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public citerne addCiterne(citerne e) {
        citerneRepository.persist(e);;
        return e;
    }

    public citerne updateCiterne(citerne e) {
        e.persist();
        return e;
    }

    public void removeCiterne(Long idCiterne) {
        citerne.deleteById(idCiterne);
    }
}