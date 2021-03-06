package io.honeyqa.stresstest.exception;

import io.honeyqa.stresstest.common.Command;

import org.json.JSONException;

/**
 * @author seunoh on 2014. 05. 11..
 */
public class JSONExceptionCommand extends Command {


    public JSONExceptionCommand() {
        setName(JSONException.class.getSimpleName());
    }


    @Override
    public void execute() throws Exception {
        throw new JSONException(name());
    }
}
