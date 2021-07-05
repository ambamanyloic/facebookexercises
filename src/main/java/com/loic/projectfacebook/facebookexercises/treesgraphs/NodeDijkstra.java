package com.loic.projectfacebook.facebookexercises.treesgraphs;

import java.util.*;

public class NodeDijkstra {



    private String name;

    private List<NodeDijkstra> shortestPath = new LinkedList<>();


    private Integer distance = Integer.MAX_VALUE;

    Map<NodeDijkstra, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(NodeDijkstra destination, int distance) {

        adjacentNodes.put(destination, distance);
    }

    public NodeDijkstra(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<NodeDijkstra> getShortestPath() {

        return shortestPath;
    }

    public void setShortestPath(List<NodeDijkstra> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {

        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<NodeDijkstra, Integer> getAdjacentNodes() {

        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<NodeDijkstra, Integer> adjacentNodes) {

        this.adjacentNodes = adjacentNodes;
    }


}
