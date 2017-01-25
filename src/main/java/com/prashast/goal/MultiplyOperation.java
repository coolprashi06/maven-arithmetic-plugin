package com.prashast.goal;

import com.prashast.Operations;
import com.prashast.plugin.AbstractArithmeticMojo;


/**
 * @goal mul
 */
public class MultiplyOperation extends AbstractArithmeticMojo {

    @Override
    protected Operations getOperation() {
        return Operations.MUL;
    }
}
