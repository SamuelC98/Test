package com.company;

public class EdgeNode {
    public int dest;


    public int distance;//
    public int fee;

    public EdgeNode next;

    public EdgeNode(int dest, int fee, int distance) {

    }

    public EdgeNode(int dest, int fee, int distance, EdgeNode next) {

    }

    public int getDest() {
          return 0;
    }

    public int getDistance() {
        return 0;
    }

    public int getFee()
    {return 0;}

    public EdgeNode getNext() {
        return null;
    }
}

