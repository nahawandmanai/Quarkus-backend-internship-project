package org.acme.controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.acme.entities.Pompe;
import org.acme.services.PompeInterface;

import java.util.List;


@AllArgsConstructor
@Path("/pompe")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class pompeController {
    @Inject
    PompeInterface pompeService;

    @GET
    @Path("/retrieve-all-pompes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pompe> getPompe() {
        List<Pompe> listPompes = pompeService.retrieveAllPompe();
        return listPompes;
    }

    @POST
    @Path("/add-pompe")
    @Transactional
    public Pompe addPompe(Pompe e) {
        Pompe pompe = pompeService.addPompe(e);
        return pompe;
    }

    @PUT
    @Path("/update-pompe")
    @Transactional
    public Pompe updatePompe(Pompe e) {
        Pompe pompe = pompeService.updatePompe(e);
        return pompe;
    }

    @DELETE
    @Path("/delete-pompe/{idPompe}")
    @Transactional
    public void removePompe(@PathParam("idPompe") Long idPompe) {
        pompeService.removePompe(idPompe);
    }

}
