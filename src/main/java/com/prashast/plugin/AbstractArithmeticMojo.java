package com.prashast.plugin;

import com.prashast.Operations;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;


public abstract class AbstractArithmeticMojo extends AbstractMojo{


    /**
	 * @parameter default-value = "10" expression="${a}"
	 */
    private int a;

     /**
	 * @parameter default-value = "20" expression="${b}"
	 */
    private int b;


    private int result;


    public void execute() throws MojoExecutionException, MojoFailureException {

        switch (getOperation()){
            case ADD:
                result = add(a,b);
                break;
            case SUB:
                result = sub(a,b);
                break;
            case MUL:
                result = mul(a,b);
                break;
            case DIV:
                result = div(a,b);
                break;
        }
        System.out.println("Result of operation " +getOperation()+ " on "+a+" and "+b+" is "+result);
        return;
    }

    protected abstract Operations getOperation();

    private int add(int a, int b){
        return a + b;
    }

    private int sub(int a, int b){
        return a - b;
    }

    private int mul(int a, int b){
        return a * b;
    }

    private int div(int a, int b){
        return a / b;
    }



}
