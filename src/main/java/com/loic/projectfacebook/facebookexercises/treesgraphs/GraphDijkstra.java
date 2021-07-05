package com.loic.projectfacebook.facebookexercises.treesgraphs;

import java.util.HashSet;
import java.util.*;

public class GraphDijkstra {

    private Set<NodeDijkstra> nodeDijkstras = new HashSet<>();

    public void addNode(NodeDijkstra nodeDijkstraA) {
        nodeDijkstras.add(nodeDijkstraA);
    }

    // getters and setters


    public static GraphDijkstra calculateShortestPathFromSource(GraphDijkstra graph, NodeDijkstra source) {
        source.setDistance(0);

        Set<NodeDijkstra> settledNodeDijkstras = new HashSet<>();
        Set<NodeDijkstra> unsettledNodeDijkstras = new HashSet<>();

        unsettledNodeDijkstras.add(source);

        while (unsettledNodeDijkstras.size() != 0) {
            NodeDijkstra currentNodeDijkstra = getLowestDistanceNode(unsettledNodeDijkstras);
            unsettledNodeDijkstras.remove(currentNodeDijkstra);

            for (Map.Entry <NodeDijkstra, Integer> adjacencyPair:
                    currentNodeDijkstra.getAdjacentNodes().entrySet()) {
                NodeDijkstra adjacentNodeDijkstra = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();

                if (!settledNodeDijkstras.contains(adjacentNodeDijkstra)) {
                    CalculateMinimumDistance(adjacentNodeDijkstra, edgeWeight, currentNodeDijkstra);
                    unsettledNodeDijkstras.add(adjacentNodeDijkstra);
                }
            }

            settledNodeDijkstras.add(currentNodeDijkstra);
        }
        return graph;
    }

    private static NodeDijkstra getLowestDistanceNode(Set <NodeDijkstra> unsettledNodeDijkstras) {

        NodeDijkstra lowestDistanceNodeDijkstra = null;
        int lowestDistance = Integer.MAX_VALUE;

        for (NodeDijkstra nodeDijkstra : unsettledNodeDijkstras) {
            int nodeDistance = nodeDijkstra.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNodeDijkstra = nodeDijkstra;
                }
        }
        return lowestDistanceNodeDijkstra;
    }

    private static void CalculateMinimumDistance(NodeDijkstra evaluationNodeDijkstra,
                                                 Integer edgeWeigh, NodeDijkstra sourceNodeDijkstra) {
        Integer sourceDistance = sourceNodeDijkstra.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNodeDijkstra.getDistance()) {
            evaluationNodeDijkstra.setDistance(sourceDistance + edgeWeigh);
            LinkedList<NodeDijkstra> shortestPath = new LinkedList<>(sourceNodeDijkstra.getShortestPath()); //
            shortestPath.add(sourceNodeDijkstra); //
            evaluationNodeDijkstra.setShortestPath(shortestPath);  //
        }
    }

    public static void main(String[] args) {


        NodeDijkstra nodeDijkstraA = new NodeDijkstra("A");
        NodeDijkstra nodeDijkstraB = new NodeDijkstra("B");
        NodeDijkstra nodeDijkstraC = new NodeDijkstra("C");
        NodeDijkstra nodeDijkstraD = new NodeDijkstra("D");
        NodeDijkstra nodeDijkstraE = new NodeDijkstra("E");
        NodeDijkstra nodeDijkstraF = new NodeDijkstra("F");

        nodeDijkstraA.addDestination(nodeDijkstraB, 10);
        nodeDijkstraA.addDestination(nodeDijkstraC, 15);

        nodeDijkstraB.addDestination(nodeDijkstraD, 12);
        nodeDijkstraB.addDestination(nodeDijkstraF, 15);

        nodeDijkstraC.addDestination(nodeDijkstraE, 10);

        nodeDijkstraD.addDestination(nodeDijkstraE, 2);
        nodeDijkstraD.addDestination(nodeDijkstraF, 1);

        nodeDijkstraF.addDestination(nodeDijkstraE, 5);

        GraphDijkstra graph = new GraphDijkstra();

        graph.addNode(nodeDijkstraA);
        graph.addNode(nodeDijkstraB);
        graph.addNode(nodeDijkstraC);
        graph.addNode(nodeDijkstraD);
        graph.addNode(nodeDijkstraE);
        graph.addNode(nodeDijkstraF);

        graph = GraphDijkstra.calculateShortestPathFromSource(graph, nodeDijkstraA);
        System.out.println(graph);


    }


}
