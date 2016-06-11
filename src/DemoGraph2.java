/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
public class DemoGraph2 {
    
    public static void main(String[] args){
        
        Graph graph = new Graph();
        
        final int SIZE = 10;
        
        //initialize some vertices and add them to the graph
        Vertex[] vertices = new Vertex[SIZE];       
        
        vertices[0] = new SeaTile("Bay of Ice", 1, "None");
        vertices[1] = new LandTile("Castle Black", 2, "None");
        vertices[2] = new SeaTile("The Shivering Sea", 3, "None");
        vertices[3] = new LandTile("Winterfell", 4, "Stark");
        vertices[4] = new PortTile("Winterfell Port", 5, "Stark");
        vertices[5] = new LandTile("Karhold", 6, "None");
        vertices[6] = new LandTile("The Stony Shore", 7, "None");
        vertices[7] = new LandTile("White Harbor", 8, "None");
        vertices[8] = new PortTile("White Harbor Port", 9, "None");
        vertices[9] = new LandTile("Widow's Watch", 10, "None");
        
        for(int i = 0; i < SIZE; i++){
            graph.addVertex(vertices[i], true);
        }
        
        graph.addEdge(vertices[0], vertices[1]);
        graph.addEdge(vertices[0], vertices[3]);
        graph.addEdge(vertices[0], vertices[4]);
        graph.addEdge(vertices[0], vertices[6]);
        
        graph.addEdge(vertices[1], vertices[2]);
        graph.addEdge(vertices[1], vertices[3]);
        graph.addEdge(vertices[1], vertices[5]);
        
        graph.addEdge(vertices[2], vertices[5]);
        graph.addEdge(vertices[2], vertices[3]);
        graph.addEdge(vertices[2], vertices[5]);
        graph.addEdge(vertices[2], vertices[8]);
        graph.addEdge(vertices[2], vertices[9]);
        
        graph.addEdge(vertices[3], vertices[4]);
        graph.addEdge(vertices[3], vertices[6]);
        //graph.addEdge(vertices[3], vertices[]);
        
        
        
        //display the initial setup- all vertices adjacent to each other
        for (Vertex vertice : vertices) {
            System.out.println(vertice);
            for (int j = 0; j < vertice.getNeighborCount(); j++) {
                System.out.println(vertice.getNeighbor(j));
            }
            System.out.println();
        }
    }
}
