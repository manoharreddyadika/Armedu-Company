package com.example.armedu.shortestpath;

import java.util.*;

class Edge {
    String target;
    int distance;

    public Edge(String target, int distance) {
        this.target = target;
        this.distance = distance;
    }
}

class Node {
    String name;
    List<Edge> edges;
    int distance; 
    int heuristic; 
    int cost;
    Node prev; 

    public Node(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
        this.heuristic = 0;
        this.cost = Integer.MAX_VALUE;
        this.prev = null;
    }
}

class Graph {
    Map<String, Node> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public void addNode(String name) {
        vertices.putIfAbsent(name, new Node(name));
    }

    public void addEdge(String source, String target, int distance) {
        Node srcNode = vertices.get(source);
        Node tgtNode = vertices.get(target);
        if (srcNode != null && tgtNode != null) {
            srcNode.edges.add(new Edge(target, distance));
        }
    }

    public List<String> astar(String start, String goal) {
        if (!vertices.containsKey(start) || !vertices.containsKey(goal)) {
            return null;
        }

        Node startNode = vertices.get(start);
        Node goalNode = vertices.get(goal);
        startNode.distance = 0;
        startNode.cost = startNode.heuristic;

        PriorityQueue<Node> openSet = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        Set<Node> closedSet = new HashSet<>();
        openSet.add(startNode);

        while (!openSet.isEmpty()) {
            Node current = openSet.poll();

            if (current == goalNode) {
                return reconstructPath(current);
            }

            closedSet.add(current);

            for (Edge edge : current.edges) {
                Node neighbor = vertices.get(edge.target);
                if (neighbor == null || closedSet.contains(neighbor)) {
                    continue;
                }

                int tentativeDistance = current.distance + edge.distance;
                if (tentativeDistance < neighbor.distance) {
                    neighbor.prev = current;
                    neighbor.distance = tentativeDistance;
                    neighbor.cost = neighbor.distance + neighbor.heuristic;

                    if (!openSet.contains(neighbor)) {
                        openSet.add(neighbor);
                    }
                }
            }
        }

        return null;
    }

    private List<String> reconstructPath(Node node) {
        List<String> path = new ArrayList<>();
        while (node != null) {
            path.add(0, node.name);
            node = node.prev;
        }
        return path;
    }
}

public class AStarShortestPath {
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

      
        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "C", 5);
        graph.addEdge("B", "C", 3);
        graph.addEdge("C", "D", 7);
        graph.addEdge("D", "A", 3);
        graph.addEdge("D", "E", 11);

        
        String source = "A";
        String destination = "E";

        
        List<String> shortestPath = graph.astar(source, destination);

      
        if (shortestPath != null) {
            System.out.println("Path: " + String.join("->", shortestPath));
            int totalCost = graph.vertices.get(destination).distance;
            System.out.println("Cost: " + totalCost);
        } else {
            System.out.println("No path found from " + source + " to " + destination);
        }
    }
}

