package service;

import controller.AnimalDTO;
import controller.ConsultDTO;
import dao.AnimalDAO;
import dao.ConsultDAO;
import entity.Animal;
import entity.AnimalType;
import entity.Consult;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalClinicService {
    private final ConsultDAO consultDAO;
    private final AnimalDAO animalDAO;

    public AnimalClinicService(ConsultDAO consultDAO, AnimalDAO animalDAO) {
        this.consultDAO = consultDAO;
        this.animalDAO = animalDAO;
    }

    /**
     * Adds an unique Animal to the clinic.
     *
     * @param dto AnimalDTO
     * @return true if successful, false if failed
     */
    public boolean addAnimal(AnimalDTO dto) {
        AnimalType type = AnimalType.valueOf(dto.type());
        if (!this.animalDAO.existAnimal(dto.name(), type, dto.owner())) {
            Animal animal = new Animal(dto.name(), type, dto.owner());
            this.animalDAO.create(animal);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Finds all animals for an owner
     *
     * @param owner name of the owner
     * @return list of Animals for the owner
     */
    public List<AnimalDTO> findAllAnimalsForOwner(String owner) {
        return this.animalDAO.findAll().stream()
                .filter(p -> p.getOwner().equals(owner))
                .map(this::assemble)
                .collect(Collectors.toList());
    }

    /**
     * Adds a consult to the clinic.
     *
     * @param dto ConsultDTO : required
     * @return true if successful, false if failed
     */
    public boolean addConsult(ConsultDTO dto) {
        Optional<Animal> animal = this.animalDAO.findById(dto.animalId());
        if (animal.isPresent()) {
            Consult consult = new Consult(animal.get(), dto.date(), dto.reason());
            this.consultDAO.create(consult);
            return true;
        } else {
            return false;
        }
    }


    /**
     * Finds all consults for an animal.
     *
     * @param animalId the id of the animal
     * @return list of Consult objects if animal is found, or empty list if animal is not found
     */
    public List<ConsultDTO> findAllConsultsForAnimal(int animalId) {
        Optional<Animal> animal = this.animalDAO.findById(animalId);
        if (animal.isPresent()) {
            return this.consultDAO.findAll().stream()
                    .filter(p -> p.getAnimal().equals(animal.get()))
                    .map(this::assemble)
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    private AnimalDTO assemble(Animal animal) {
        return new AnimalDTO(animal.getId(), animal.getName(), animal.getType().toString(), animal.getOwner());
    }

    private ConsultDTO assemble(Consult consult) {
        return new ConsultDTO(consult.getId(), consult.getAnimal().getId(), consult.getDate(), consult.getReason());
    }
}
