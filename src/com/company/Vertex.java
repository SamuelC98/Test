package com.company;

import java.util.NoSuchElementException;

public class Vertex<Type> {

    public Type data;
    public EdgeNode firstEdge;

    public Vertex(Type d){
        data = d;
        firstEdge = null;
    }

    public Vertex() {

    }

    //set method
    public void setData(Type data) {
        if(data == "") throw new NoSuchElementException();
        this.data = data;
    }

    //get method
    public Type getData() {
        return data;
    }


    public EdgeNode getFirstEdge(){
        return firstEdge;
    }

    //get destination of firstedge
    public int getFirstEdgeDest(){
        return firstEdge.getDest();

    }

    //get fee of firstedge
    public int getFirstEdgeFee(){
        return firstEdge.getFee();

    }

    //get distance in firstedge
    public int getFirstEdgeDistance(){
        return firstEdge.getDistance();

    }




}
