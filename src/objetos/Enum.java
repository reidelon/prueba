/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Map;

/**
 *
 * @author tux
 */
public class Enum extends Common {

    public Enum(java.lang.String name, java.lang.String description, Map pkeyValue) {
        super(name, description);
        this.keyValaue = pkeyValue;
    }

    private Map keyValaue = null;

    @Override
    public java.lang.String toString() {
        return getName();
    }

    public Map getKeyValaue() {
        return keyValaue;
    }

    public void setKeyValaue(Map keyValaue) {
        this.keyValaue = keyValaue;
    }

}
