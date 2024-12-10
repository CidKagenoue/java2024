package controller;

import dao.AnimalDAO;
import dao.ConsultDAO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.AnimalClinicService;

import java.util.List;

@Path("/animals")
public class AnimalClinicController {

    private final AnimalClinicService service;

    public AnimalClinicController() {
        AnimalDAO animalDAO = new AnimalDAO();
        ConsultDAO consultDAO = new ConsultDAO();
        this.service = new AnimalClinicService(consultDAO, animalDAO);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNewAnimal(AnimalDTO dto) {
        if (dto.name() != null && dto.type() != null && dto.owner() != null) {
            boolean success = service.addAnimal(dto);
            return success ? Response.status(Response.Status.CREATED).build()
                    : Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.BAD_REQUEST)
                .entity("Invalid animal data").build();
    }

    @GET
    @Path("/owner/{ownerName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllAnimalsForOwner(@PathParam("ownerName") String ownerName) {
        List<AnimalDTO> animals = service.findAllAnimalsForOwner(ownerName);
        return Response.ok(animals).build();
    }

    @POST
    @Path("/consults")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createConsult(ConsultDTO dto) {
        boolean success = service.addConsult(dto);
        return success ? Response.status(Response.Status.CREATED).build()
                : Response.status(Response.Status.BAD_REQUEST).build();
    }

    @GET
    @Path("/{animalId}/consults")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllConsultsForAnimal(@PathParam("animalId") int animalId) {
        List<ConsultDTO> consults = service.findAllConsultsForAnimal(animalId);
        return Response.ok(consults).build();
    }
}

