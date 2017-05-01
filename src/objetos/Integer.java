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

    public Integer(Boolean mandatory, java.lang.Integer min, java.lang.Integer max, java.lang.String name, java.lang.String description, java.lang.Integer defaultValue) {
        super(name, description);
        this.mandatory = mandatory;
        this.min = min;
        this.max = max;
        this.defaultValue = defaultValue;
        this.description = description;
    }

    private java.lang.Integer defaultValue = null;

    public java.lang.Integer getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(java.lang.Integer defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public java.lang.Integer getMin() {
        return min;
    }

    public void setMin(java.lang.Integer min) {
        this.min = min;
    }

    public java.lang.Integer getMax() {
        return max;
    }

    public void setMax(java.lang.Integer max) {
        this.max = max;
    }
    private Boolean mandatory;
    private java.lang.Integer min;
    private java.lang.Integer max;

    @Override
    public java.lang.String toString() {
        return getName();
    }
}
