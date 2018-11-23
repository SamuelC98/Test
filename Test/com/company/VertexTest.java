package com.company;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;



/**
 * Vertex Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 19, 2018</pre>
 * @version 1.0
 */
public class VertexTest {

    private Type data;
    private Vertex sut;
    private EdgeNode firstEdge;



    @Before
    public void setUp() throws Exception {
     sut = new Vertex();
     sut.firstEdge = mock(EdgeNode.class);

    }

    @Test
    public void shouldSetCorrectData() {
        sut.setData("London");
        assertEquals("London",sut.data);

    }

    @Test(expected = NoSuchElementException.class)
    public void shouldInputData(){
        sut.setData("");
    }


    @Test
    public void shouldTestConstructor(){
        assertEquals("Paris",new Vertex<String>("Paris").data);
    }


    @Test
    public void shouldTestGetData(){
        assertEquals("Berlin",new Vertex<String>("Berlin").getData());
    }

    @Test
    public void shouldTestGetFirstEdge(){
        assertEquals(sut.getFirstEdge(),sut.firstEdge);

    }

    @Test
    public void shouldTestGetFirstEdgeDest(){
        when(sut.firstEdge.getDest()).thenReturn(192);
        assertEquals(192,sut.getFirstEdgeDest());
        verify(sut.firstEdge).getDest();

    }


    @Test
    public void shouldTestGetFirstEdgeFee(){
        when(sut.firstEdge.getFee()).thenReturn(11);
        assertEquals(11,sut.getFirstEdgeFee());
        verify(sut.firstEdge).getFee();

    }

    @Test
    public void shouldTestGetFirstEdgeDistance(){
        when(sut.firstEdge.getDistance()).thenReturn(22);
        assertEquals(22,sut.getFirstEdgeDistance());
        verify(sut.firstEdge).getDistance();

    }

}