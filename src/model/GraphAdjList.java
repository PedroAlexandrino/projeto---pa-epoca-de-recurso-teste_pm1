package model;

import com.pa.proj2020.adts.graph.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GraphAdjList<V, E>  implements Graph<V, E>  {
    private Map<V, Vertex<V>> vertices;
    private Map<E, Edge<E, V>> edges;

    public GraphAdjList() {
        this.vertices = new HashMap<>();
        this.edges = new HashMap<>();

    }



    @Override
    public int numVertices() {

        return 0;
    }

    @Override
    public int numEdges() {
        return 0;
    }

    @Override
    public Collection<Vertex<V>> vertices() {
        return null;
    }

    @Override
    public Collection<Edge<E, V>> edges() {
        return null;
    }

    @Override
    public Collection<Edge> incidentEdges(Vertex v) throws InvalidVertexException {
        return null;
    }

    @Override
    public Vertex opposite(Vertex v, Edge e) throws InvalidVertexException, InvalidEdgeException {
        return null;
    }

    @Override
    public boolean areAdjacent(Vertex u, Vertex v) throws InvalidVertexException {
        return false;
    }

    @Override
    public Vertex insertVertex(Object vElement) throws InvalidVertexException {
        return null;
    }

    @Override
    public Edge insertEdge(Vertex u, Vertex v, Object edgeElement) throws InvalidVertexException, InvalidEdgeException {
        return null;
    }

    @Override
    public Edge insertEdge(Object vElement1, Object vElement2, Object edgeElement) throws InvalidVertexException, InvalidEdgeException {
        return null;
    }

    @Override
    public Object removeVertex(Vertex v) throws InvalidVertexException {
        return null;
    }

    @Override
    public Object removeEdge(Edge e) throws InvalidEdgeException {
        return null;
    }

    @Override
    public Object replace(Vertex v, Object newElement) throws InvalidVertexException {
        return null;
    }

    @Override
    public Object replace(Edge e, Object newElement) throws InvalidEdgeException {
        return null;
    }
}
