package Main;

import Controller.AnimalController;
import Model.Animal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //instância do controller
        AnimalController animalController = new AnimalController();

        //POST
        animalController.createAnimal(new Animal(1, "Leão", "Felino"));
        animalController.createAnimal(new Animal(2, "Pinguim", "Ave"));
        animalController.createAnimal(new Animal(3, "Cobra", "Réptil"));

        //GET
        List<Animal> animais = animalController.getAllAnimais();
        System.out.println("Lista de Animais:");
        for (Animal animal : animais) {
            System.out.println(animal.getId() + ": " + animal.getNome() + " - " + animal.getEspecie());
        }

        //GET by ID
        int idBusca = 2;
        Animal animalEncontrado = animalController.getAnimalById(idBusca);

        if (animalEncontrado != null) {
            System.out.println("\nAnimal encontrado com ID " + idBusca + ": " + animalEncontrado.getNome() + " - " + animalEncontrado.getEspecie());
        } else {
            System.out.println("\nAnimal com ID " + idBusca + " não encontrado1");
        }
    }
}
