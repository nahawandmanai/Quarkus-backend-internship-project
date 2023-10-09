package org.acme.services;

import org.acme.entities.Pompe;

import java.util.List;

public interface PompeInterface {

        List<Pompe> retrieveAllPompe();

        Pompe addPompe(Pompe e);

        Pompe updatePompe(Pompe e);

        void removePompe(Long idPompe);

}
