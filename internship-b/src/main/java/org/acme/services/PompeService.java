package org.acme.services;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.entities.Pompe;
import org.acme.repositories.PompeRepository;

import java.util.List;

@ApplicationScoped
public class PompeService implements PompeInterface {

    @Inject
    PompeRepository pompeRepository;

    public List<Pompe> retrieveAllPompe() {
        return Pompe.listAll(Sort.by("Nature"));
    }

    public Pompe addPompe(Pompe e) {
        e.persist();
        return e;
    }

    public Pompe updatePompe(Pompe e) {
        e.persist();
        return e;
    }

    public void removePompe(Long idPompe) {
        Pompe.deleteById(idPompe);
    }

}
