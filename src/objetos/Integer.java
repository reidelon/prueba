/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.lang.String;

/**
 *
 * @author tux
 */
public class Integer extends Common {

    public Integer(Boolean mandatory, java.lang.Integer min, java.lang.Integer max, String name, String description) {
        super(name, description);
        this.mandatory = mandatory;
        this.min = min;
        this.max = max;
    }

    private java.lang.Integer defaultValue = null;
    private Boolean mandatory;
    private java.lang.Integer min;
    private java.lang.Integer max;

    @Override
    public String toString() {
        return getName();
    }
}
