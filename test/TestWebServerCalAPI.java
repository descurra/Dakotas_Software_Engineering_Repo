//SMOKE TEST FOR API 3
//Components within compute engine
//Testing: Soltion, Comp

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



import project.api.webservercalcapi.calculate.Solution;
import project.api.webservercalcapi.webserver.Comp;
import project.api.webservercalcapi.WebCalculateAPI;
import project.api.webservercalcapi.ConceptualAPIImplementation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestWebServerCalAPI{
    @Test
    void testSolution() throws Exception{
        WebCalculateAPI mockConceptualAPI = Mockito.mock(WebCalculateAPI.class);
        ConceptualAPIImplementation solutionCAI = new ConceptualAPIImplementation(mockConceptualAPI);

        Comp mockComp = mock(Comp.class);
        Solution mockSolution = mock(Solution.class);
        when(mockSolution.getResult()).thenReturn(30);

        when(mockConceptualAPI.computeResult(mockComp)).thenReturn(mockSolution);
        Solution actualSolution = solutionCAI.computeResult(Mockito.mock(Comp.class));

        Assertions.assertEquals(30, mockSolution.getResult());
        Assertions.assertNotNull(actualSolution);
    }

    @Test
    void testComp() throws Exception{
        WebCalculateAPI mockConceptualAPI = Mockito.mock(WebCalculateAPI.class);
        ConceptualAPIImplementation CompCAI = new ConceptualAPIImplementation(mockConceptualAPI);


        Comp mockComp = mock(Comp.class);
        when(mockComp.getExpression()).thenReturn("mock_expression");

        CompCAI.computeResult(mockComp);

        Assertions.assertEquals("mock_expression", mockComp.getExpression());
    }






}