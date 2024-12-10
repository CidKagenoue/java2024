package clinic;

import dao.AnimalDAO;
import model.Animal;
import model.AnimalType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AnimalClinicV2Test {

    @Test
    void addOneAnimal() {
        // Mock the AnimalDAO
        AnimalDAO dao = mock(AnimalDAO.class);
        AnimalClinicV2 clinic = new AnimalClinicV2(dao);
        Animal animal = new Animal("spike", AnimalType.CAT, "Jeroen");

        when(dao.existAnimal(animal)).thenReturn(false);  // Animal doesn't exist in the list
        when(dao.findAll()).thenReturn(Arrays.asList(animal));  // Mock the list of animal

        clinic.addAnimal(animal);

        // Verify the correct interactions with the mocked DAO
        verify(dao, times(1)).existAnimal(animal);  // Should check if the animal exists
        verify(dao, times(1)).createAnimal(animal); // Should create the animal if it doesn't exist
        verify(dao, times(1)).findAll();  // Should check the list of all animals (although it's not used in this case)
    }
}
