package annotation;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 


@RunWith(Cucumber.class) 
@Cucumber.Options(format={"SimpleHtmlReport:report/annotation.html"},tags={"@annotation"}) 

public class runTest { 
	
}