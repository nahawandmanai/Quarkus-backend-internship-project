package org.acme.controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.acme.entities.citerne;
import org.acme.services.CiterneInterface;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Path("/internship/citerne")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class citerneController {

    private Set<citerne> citernes = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    @Inject
CiterneInterface citerneService;

    @GET
    @Path("/retrieve-all-citernes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<citerne> getCiterne() {
        List<citerne> listCiternes = citerneService.retrieveAllCiterne();
        return listCiternes;
    }


    @POST
    @Path("/add-citerne")
    public Set<citerne> addCiterne(citerne e) {
        citerne citerne = citerneService.addCiterne(e);
        return citernes;
    }

    @PUT
    @Path("/update-citerne")
    @Transactional
    public citerne updateCiterne(citerne e) {
        citerne citerne = citerneService.updateCiterne(e);
        return citerne;
    }


    @DELETE
    @Path("/delete-citerne/{idCiterne}")
    @Transactional
    public void removeCiterne(@PathParam("idCiterne") Long idCiterne) {
        citerneService.removeCiterne(idCiterne);
    }

}
