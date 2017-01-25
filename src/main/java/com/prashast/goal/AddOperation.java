package com.prashast.goal;

import com.prashast.Operations;
import com.prashast.plugin.AbstractArithmeticMojo;


/**
 * @goal add
 */

public class AddOperation extends AbstractArithmeticMojo{

    @Override
    protected Operations getOperation() {
        return Operations.ADD;
    }
}
