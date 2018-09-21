package com.promineotech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.entities.Pokemon;

@RestController
public class PokemonController {
	
	List<Pokemon> pokemon = new ArrayList<Pokemon>();
	
	@RequestMapping(value="/pokemon", method=RequestMethod.GET)
	public List<Pokemon> getAllPokemon() {
		return pokemon;
	}
	
	@RequestMapping(value="/pokemon/{id}", method=RequestMethod.GET)
	public Pokemon getPokemonById(@PathVariable int id) {
		Pokemon foundPokemon = null;
		if (id < pokemon.size() && id >= 0) {
			foundPokemon = pokemon.get(id);
		}
		return foundPokemon;
	}
	
	@RequestMapping(value="/pokemon", method=RequestMethod.POST)
	public Pokemon createPokemon(@RequestBody Pokemon newPokemon) {
		pokemon.add(newPokemon);
		return newPokemon;
	}
	
	@RequestMapping(value="/pokemon/{id}", method=RequestMethod.DELETE)
	public Pokemon deletePokemonById(@PathVariable int id) {
		Pokemon foundPokemon = null;
		if (id < pokemon.size() && id >= 0) {
			foundPokemon = pokemon.remove(id);
		}
		return foundPokemon;
	}
	
	@RequestMapping(value="/pokemon/{id}", method=RequestMethod.PUT)
	public Pokemon updatePokemon(@PathVariable int id, @RequestBody Pokemon updates) {
		Pokemon updatedPokemon = null;
		if (id < pokemon.size() && id >= 0) {
			updatedPokemon = pokemon.get(id);
			updatedPokemon.setLevel(updates.getLevel());
			updatedPokemon.setName(updates.getName());
			updatedPokemon.setType(updates.getType());
		}
		return updatedPokemon;
	}
}
