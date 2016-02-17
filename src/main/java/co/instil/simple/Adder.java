// Insert copyright here
package co.instil.simple;

import com.google.common.base.Preconditions;

/**
 * Simple class for adding numbers.
 */
public class Adder {
    public Integer add(Integer value1, Integer value2) {
        Preconditions.checkNotNull(value1);
        Preconditions.checkNotNull(value2);
        return value1 + value2;
    }

    public Boolean equals(Integer value1, Integer value2) {
        Preconditions.checkNotNull(value1);
        Preconditions.checkNotNull(value2);
        // Fix equals to use object equality rather than reference equality
        return value1 == value2;
    }
}
