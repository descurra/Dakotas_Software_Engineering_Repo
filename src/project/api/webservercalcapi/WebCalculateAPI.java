package project.api.webservercalcapi;

import project.annotations.ConceptualAPI;
import project.api.webservercalcapi.calculate.Solution;
import project.api.webservercalcapi.webserver.Comp;


@ConceptualAPI
public interface WebCalculateAPI{
    Solution computeResult(Comp cal);
    //Creating solution from computed calculation

}

//Input computation
//Webserver gives calculation to compute engine
//Compute engine returns solution to webserver