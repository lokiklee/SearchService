package integration.ninjas;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerString implements RequestHandler<String, Response> {

    @Override
    public Response handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Input TYPE: " + input.getClass().toString());
        logger.log("Input Value: " + input);
        Map<String, String> headers = new HashMap<>();
        headers.put("Access-Control-Allow-Origin", "*");

        return new Response(200, headers, new StringBuilder(input).reverse().toString());
    }
}