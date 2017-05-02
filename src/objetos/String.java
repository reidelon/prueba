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

    public String(Boolean mandatory, Integer length, java.lang.String name, java.lang.String description, java.lang.String defaultValue) {
        super(name, description);
        this.mandatory = mandatory;
        this.length = length;
        this.defaultValue = defaultValue;
    }

    private java.lang.String defaultValue = null;

    public java.lang.String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    private Boolean mandatory;
    private Integer length;

    @Override
    public java.lang.String toString() {
        return getName();
    }
}
