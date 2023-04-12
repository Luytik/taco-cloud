package tacos.web;

import tacos.Ingredient;
import tacos.data.IngredientRepository;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
	
	private IngredientRepository ingredientRepo;
    
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String arg0) {
        return ingredientRepo.findById(arg0).orElse(null);
    }
}
