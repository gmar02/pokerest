package br.com.pokerest.pokerest.converters;

import java.util.Arrays;
import java.util.List;

import com.opencsv.bean.AbstractBeanField;

public class AbilitiesConverter extends AbstractBeanField<List<String>, String> {
    
    @Override
    protected Object convert(String value) {
        return Arrays.stream(value
                .replace("[", "")
                .replace("]", "")
                .replace("'", "")
                .replace("\"", "")
                .split(","))
            .map(String::trim)
            .toList();
    }
}
