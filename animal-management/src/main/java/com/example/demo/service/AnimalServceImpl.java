package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Race;

public class AnimalServceImpl implements AnimalService  {

	
	@Autowired
	AnimalService animalService; 
	
	@Override
	public Animal saveAnimal(Animal a) {
		return animalService.saveAnimal(a);
	}

	@Override
	public Animal updateAnimal(Animal a) {
		return animalService.updateAnimal(a);
	}

	@Override
	public void deleteAnimal(Animal a) {
		animalService.deleteAnimal(a);
		
	}

	@Override
	public void deleteAnimalById(Long id) {
		animalService.deleteAnimalById(id);
		
	}

	@Override
	public Animal getAnimal(Long id) {
		return animalService.getAnimal(id);
	}

	@Override
	public List<Animal> getAllAniamls() {
		return animalService.getAllAniamls();
	}

	@Override
	public List<Animal> findByNameAnimal(String nom) {
		return animalService.findByNameAnimal(nom);
	}

	@Override
	public List<Animal> findByNameAnimalContains(String nom) {
		return animalService.findByNameAnimalContains(nom);
	}

	@Override
	public List<Animal> findByNameAge(String nom, Long age) {
		return animalService.findByNameAge(nom, age);
	}

	@Override
	public List<Animal> findByRace(Race race) {
		return animalService.findByRace(race);
	}

	@Override
	public List<Animal> findByRaceId(Long id) {
		return animalService.findByRaceId(id);
	}

	@Override
	public List<Animal> findByOrderByNomAnimalAsc() {
		return animalService.findByOrderByNomAnimalAsc();
	}

	@Override
	public List<Animal> trierAnimalNomsAge() {
		return animalService.trierAnimalNomsAge();
	}

}
