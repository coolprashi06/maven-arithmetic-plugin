package com.prashast.goal;

import com.prashast.Operations;
import com.prashast.plugin.AbstractArithmeticMojo;


/**
 * @goal div
 */
public class DivisionOperation extends AbstractArithmeticMojo{

    @Override
    protected Operations getOperation() {
        return Operations.DIV;
    }
}
