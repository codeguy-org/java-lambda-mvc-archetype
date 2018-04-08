package ${package}.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.compellingcode.cloud.lambda.mvc.endpoint.Endpoint;
import com.compellingcode.cloud.lambda.mvc.endpoint.EndpointParameter;
import com.compellingcode.cloud.lambda.mvc.endpoint.ParameterType;
import com.compellingcode.cloud.lambda.mvc.endpoint.RequestMethod;
import com.compellingcode.cloud.lambda.mvc.view.ClasspathResourceLambdaResponse;
import com.compellingcode.cloud.lambda.mvc.view.HtmlLambdaResponse;
import com.compellingcode.cloud.lambda.mvc.view.JSONLambdaResponse;
import com.compellingcode.cloud.lambda.mvc.view.LambdaResponse;

public class MainController {
	static final Logger logger = LogManager.getLogger(MainController.class);

	@Endpoint(value={"/home", "/"}, method=RequestMethod.GET)
	public LambdaResponse home() {
		return new HtmlLambdaResponse("home.tpl");
	}
	
	// example usage
	/*
	// This method accepts a path parameter {id}
	// This method returns a JSON response
	@Endpoint({"/getid/{id}"})
	public LambdaResponse getId(@EndpointParameter(type=ParameterType.PATH_PARAMETER, name="id") int id,
			                    @EndpointParameter(type=ParameterType.IP) String ip) {
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("id", id);
		values.put("ip", ip);
		
		return new JSONLambdaResponse(values);
	}
	
	// ClasspathResourceLambdaResponse will send a resource from src/main/resources/static
	// In this case, the file src/main/resources/static/images/testimage.jpg will be sent
	@Endpoint({"/image"})
	public LambdaResponse image() {
		return new ClasspathResourceLambdaResponse("images/testimage.jpg", true);
	}
	*/

}
