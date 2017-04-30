/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.lang.String;
import java.lang.Integer;

/**
 *
 * @author tux
 */
public class String_ extends Common {

    public String_(Boolean mandatory, Integer length, String name, String description) {
        super(name, description);
        this.mandatory = mandatory;
        this.length = length;
    }

    private Integer defaultValue = null;
    private Boolean mandatory;
    private Integer length;

    @Override
    public String toString() {
        return getName();
    }
}
