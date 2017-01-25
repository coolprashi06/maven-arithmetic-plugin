package com.prashast.goal;

import com.prashast.Operations;
import com.prashast.plugin.AbstractArithmeticMojo;

/**
 * @goal sub
 */
public class SubtractionOperation extends AbstractArithmeticMojo {

    @Override
    protected Operations getOperation() {
        return Operations.SUB;
    }
}
