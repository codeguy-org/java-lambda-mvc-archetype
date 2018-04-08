package ${package};

import com.compellingcode.cloud.lambda.mvc.exception.EndpointConflictException;
import com.compellingcode.cloud.lambda.mvc.handler.StreamHandler;
import com.compellingcode.cloud.lambda.mvc.view.LambdaResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ${package}.controller.MainController;


/**
 * Main Application Lambda MVC Handler
 *
 */
public class AppHandler  extends StreamHandler {
	static final Logger logger = LogManager.getLogger(AppHandler.class);
	
	private MainController mainController;
	
	@Override
	protected void configure() throws EndpointConflictException {
		mainController = new MainController();
		
		try {
			addController(mainController);
		} catch(Exception ex) {
			throw new EndpointConflictException(ex);
		}
	}
	
	@Override
	protected LambdaResponse errorHandler(int errorNumber) {
		return super.errorHandler(errorNumber);
	}

}
