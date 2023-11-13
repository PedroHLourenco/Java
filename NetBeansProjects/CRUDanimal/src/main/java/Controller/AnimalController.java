package Controller;

import Model.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    private List<Animal> animalList;
    
    public AnimalController(){
        this.animalList = new ArrayList<>();
    }
    
    //GET
    public List<Animal> getAllAnimais(){
        return animalList;
    }
    
    //GET by ID
    public Animal getAnimalById(int id){
        for (Animal animal : animalList){
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null; //animal não encontrado
    }
    
    //POST
    public void createAnimal(Animal animal){
        animalList.add(animal);
    }
    
    //PUT by ID
    public void updateAnimal(int id, Animal newAnimal) throws AnimalNotFoundException {
        boolean animalFound = false;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getId() == id) {
                animalList.set(i, newAnimal);
                animalFound = true;
                break;
            }
        }
        
        if (!animalFound){
            throw new AnimalNotFoundException("Animal com ID " + id + " não encontrado");
        }
    }
    
    //DELETE by ID
    public void deleteAnimal(int id){
        animalList.removeIf(animal -> animal.getId() == id);
    }

    private static class AnimalNotFoundException extends Exception {

        public AnimalNotFoundException(String message) {
            super(message);
        }
    }
}
