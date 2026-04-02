package br.com.pokerest.pokerest;

import com.opencsv.bean.AbstractBeanField;

public class LegendaryConverter extends AbstractBeanField<Boolean, String>{
    
    @Override
    protected Boolean convert(String value) {
        return "1".equals(value);
    }

}
