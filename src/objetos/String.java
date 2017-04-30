/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.lang.Integer;

/**
 *
 * @author tux
 */
public class String extends Common {

    public String(Boolean mandatory, Integer length, java.lang.String name, java.lang.String description) {
        super(name, description);
        this.mandatory = mandatory;
        this.length = length;
    }

    private Integer defaultValue = null;
    private Boolean mandatory;
    private Integer length;

    @Override
    public java.lang.String toString() {
        return getName();
    }
}
