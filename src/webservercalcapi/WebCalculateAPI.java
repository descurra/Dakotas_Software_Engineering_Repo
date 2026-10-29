package webservercalcapi;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface WebCalculateAPI{
    Solution computeResult(Comp cal);
    //Creating solution from computed calculation

}