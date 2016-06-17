
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
public class DemoGraph2 {
                   
    public static void main(String[] args) throws Exception{
        
        final int ROAD = 1;
        final int RIVER = 2;
        final int SEA = 3;
        final int SHORE = 4;
        final int PORT = 5;
        final int BRIDGE = 6;
        
        Graph graph = new Graph();
        
        final int SIZE = 58;
        int n = 0;
        
        //initialize some vertices and add them to the graph
        TileVertex[] vertices = new TileVertex[58];       
              
        loadVertexData(vertices);
                
        for(int i = 0; i < SIZE; i++){
            graph.addVertex(vertices[i], true);
        }
        
        graph.addEdge(vertices[0], vertices[1], SHORE);
        graph.addEdge(vertices[0], vertices[3], SHORE);
        graph.addEdge(vertices[0], vertices[4], SEA);
        graph.addEdge(vertices[0], vertices[6], SHORE);
        graph.addEdge(vertices[0], vertices[10], SEA);
        graph.addEdge(vertices[0], vertices[6], SHORE);
        graph.addEdge(vertices[0], vertices[11], SHORE);
        graph.addEdge(vertices[0], vertices[12], SHORE); 
        
        graph.addEdge(vertices[1], vertices[2], SHORE);
        graph.addEdge(vertices[1], vertices[3], ROAD);
        graph.addEdge(vertices[1], vertices[5], ROAD);
        
        graph.addEdge(vertices[2], vertices[5], SHORE);
        graph.addEdge(vertices[2], vertices[3], SHORE);
        graph.addEdge(vertices[2], vertices[7], SHORE);
        graph.addEdge(vertices[2], vertices[9], SHORE);
        graph.addEdge(vertices[2], vertices[14], SEA);
        
        graph.addEdge(vertices[3], vertices[4], PORT);
        graph.addEdge(vertices[3], vertices[5], ROAD);
        graph.addEdge(vertices[3], vertices[6], ROAD);
        graph.addEdge(vertices[3], vertices[7], ROAD);
        graph.addEdge(vertices[3], vertices[12], RIVER); 
        graph.addEdge(vertices[3], vertices[13], ROAD);
        
        graph.addEdge(vertices[7], vertices[8], PORT);
        graph.addEdge(vertices[7], vertices[9], ROAD);
        graph.addEdge(vertices[7], vertices[13], ROAD);
        graph.addEdge(vertices[7], vertices[14], SHORE);
        
        graph.addEdge(vertices[8], vertices[14], SEA);
        
        graph.addEdge(vertices[9], vertices[14], SHORE);
        
        graph.addEdge(vertices[10], vertices[11], SHORE);
        graph.addEdge(vertices[10], vertices[15], SEA);
        graph.addEdge(vertices[10], vertices[24], SEA);
        graph.addEdge(vertices[10], vertices[31], SHORE);
        
        graph.addEdge(vertices[11], vertices[12], ROAD);
        graph.addEdge(vertices[11], vertices[12], ROAD);
        graph.addEdge(vertices[11], vertices[15], SHORE);
        
        graph.addEdge(vertices[12], vertices[13], ROAD);
        graph.addEdge(vertices[12], vertices[15], SHORE);
        graph.addEdge(vertices[12], vertices[18], ROAD);
        
        graph.addEdge(vertices[13], vertices[14], SHORE);
        graph.addEdge(vertices[13], vertices[18], ROAD);
        graph.addEdge(vertices[13], vertices[19], ROAD);
        
        graph.addEdge(vertices[14], vertices[19], SHORE);
        graph.addEdge(vertices[14], vertices[20], SHORE);
        graph.addEdge(vertices[14], vertices[22], SHORE);
        graph.addEdge(vertices[14], vertices[23], SHORE);
        graph.addEdge(vertices[14], vertices[29], SHORE);
        graph.addEdge(vertices[14], vertices[30], SEA);
        
        graph.addEdge(vertices[15], vertices[16], SHORE);
        graph.addEdge(vertices[15], vertices[17], SEA);
        graph.addEdge(vertices[15], vertices[18], SHORE);
        graph.addEdge(vertices[15], vertices[21], SHORE);
        graph.addEdge(vertices[15], vertices[24], SEA);
        
        graph.addEdge(vertices[16], vertices[17], PORT);
        
        graph.addEdge(vertices[18], vertices[19], BRIDGE);
        //RiverEdge edge = (RiverEdge)(vertices[18].getNeighbor(3));
        //edge.setBridge(true);
        graph.addEdge(vertices[18], vertices[21], ROAD);
        
        graph.addEdge(vertices[19], vertices[20], ROAD);
        graph.addEdge(vertices[19], vertices[22], ROAD);
        
        graph.addEdge(vertices[20], vertices[22], ROAD);
        
        graph.addEdge(vertices[21], vertices[24], SHORE);
        graph.addEdge(vertices[21], vertices[25], ROAD);
        graph.addEdge(vertices[21], vertices[22], RIVER);
        graph.addEdge(vertices[21], vertices[27], ROAD);
        graph.addEdge(vertices[21], vertices[28], ROAD);
        
        graph.addEdge(vertices[22], vertices[23], ROAD);
        graph.addEdge(vertices[22], vertices[28], RIVER);
        graph.addEdge(vertices[22], vertices[29], BRIDGE);
        //edge = (RiverEdge)(vertices[22].getNeighbor(6));
        //edge.setBridge(true);
        
        graph.addEdge(vertices[24], vertices[25], SHORE);
        graph.addEdge(vertices[24], vertices[26], SEA);
        graph.addEdge(vertices[24], vertices[31], SHORE);
        
        graph.addEdge(vertices[25], vertices[26], PORT);
        graph.addEdge(vertices[25], vertices[27], ROAD);
        graph.addEdge(vertices[25], vertices[31], ROAD);
        
        graph.addEdge(vertices[27], vertices[28], ROAD);
        graph.addEdge(vertices[27], vertices[31], ROAD);
        graph.addEdge(vertices[27], vertices[32], ROAD);
        
        graph.addEdge(vertices[28], vertices[29], ROAD);
        graph.addEdge(vertices[28], vertices[32], ROAD);
        
        graph.addEdge(vertices[29], vertices[30], SHORE);
        graph.addEdge(vertices[29], vertices[32], ROAD);
        graph.addEdge(vertices[29], vertices[33], ROAD);
        graph.addEdge(vertices[29], vertices[34], SHORE);
        
        graph.addEdge(vertices[30], vertices[35], SHORE);
        graph.addEdge(vertices[30], vertices[36], SEA);
        graph.addEdge(vertices[30], vertices[34], SEA);
        graph.addEdge(vertices[30], vertices[41], SHORE);
        graph.addEdge(vertices[30], vertices[46], SHORE);
        graph.addEdge(vertices[30], vertices[47], SEA);
        graph.addEdge(vertices[30], vertices[57], SEA);
        
        graph.addEdge(vertices[31], vertices[32], ROAD);
        graph.addEdge(vertices[31], vertices[37], SHORE);
        graph.addEdge(vertices[31], vertices[39], ROAD);
        graph.addEdge(vertices[31], vertices[40], ROAD);
        
        graph.addEdge(vertices[32], vertices[33], ROAD);
        graph.addEdge(vertices[32], vertices[40], ROAD);
        
        graph.addEdge(vertices[33], vertices[34], SHORE);
        graph.addEdge(vertices[33], vertices[40], ROAD);
        graph.addEdge(vertices[33], vertices[41], ROAD);
        
        graph.addEdge(vertices[34], vertices[41], SHORE);
        
        graph.addEdge(vertices[35], vertices[36], PORT);
        
        graph.addEdge(vertices[37], vertices[39], SHORE);
        graph.addEdge(vertices[37], vertices[38], SEA);
        graph.addEdge(vertices[37], vertices[51], SHORE);
        graph.addEdge(vertices[37], vertices[48], SHORE);
        graph.addEdge(vertices[37], vertices[52], SHORE);
        graph.addEdge(vertices[37], vertices[57], SEA);
        
        graph.addEdge(vertices[38], vertices[39], SHORE);
        graph.addEdge(vertices[38], vertices[42], SHORE);
        graph.addEdge(vertices[38], vertices[43], SEA);
        graph.addEdge(vertices[38], vertices[48], SHORE);
        graph.addEdge(vertices[38], vertices[51], SHORE);
        
        graph.addEdge(vertices[39], vertices[40], ROAD);
        graph.addEdge(vertices[39], vertices[42], ROAD);
        graph.addEdge(vertices[39], vertices[44], ROAD);
        
        graph.addEdge(vertices[40], vertices[41], ROAD);
        graph.addEdge(vertices[40], vertices[44], ROAD);
        graph.addEdge(vertices[40], vertices[45], ROAD);
        
        graph.addEdge(vertices[41], vertices[45], ROAD);
        graph.addEdge(vertices[41], vertices[46], ROAD);
        
        graph.addEdge(vertices[42], vertices[43], PORT);
        graph.addEdge(vertices[42], vertices[44], ROAD);
        graph.addEdge(vertices[42], vertices[48], ROAD);
        
        graph.addEdge(vertices[44], vertices[45], ROAD);
        graph.addEdge(vertices[44], vertices[48], ROAD);
        graph.addEdge(vertices[44], vertices[49], ROAD);
        
        graph.addEdge(vertices[45], vertices[46], ROAD);
        graph.addEdge(vertices[45], vertices[49], ROAD);
        graph.addEdge(vertices[45], vertices[50], SHORE);
        graph.addEdge(vertices[45], vertices[53], ROAD);
        
        graph.addEdge(vertices[46], vertices[47], PORT);
        graph.addEdge(vertices[46], vertices[50], SHORE);
        graph.addEdge(vertices[46], vertices[57], SHORE);
        
        graph.addEdge(vertices[48], vertices[49], ROAD);
        graph.addEdge(vertices[48], vertices[52], RIVER);
        
        graph.addEdge(vertices[49], vertices[52], ROAD);
        graph.addEdge(vertices[49], vertices[53], ROAD);
        
        graph.addEdge(vertices[50], vertices[53], SHORE);
        graph.addEdge(vertices[50], vertices[54], SHORE);
        graph.addEdge(vertices[50], vertices[57], SEA);
        
        graph.addEdge(vertices[52], vertices[53], ROAD);
        graph.addEdge(vertices[52], vertices[56], ROAD);
        graph.addEdge(vertices[52], vertices[57], SHORE);
        
        graph.addEdge(vertices[53], vertices[54], ROAD);
        graph.addEdge(vertices[53], vertices[56], ROAD);
        
        graph.addEdge(vertices[54], vertices[55], PORT);
        graph.addEdge(vertices[54], vertices[56], ROAD);
        graph.addEdge(vertices[54], vertices[57], SHORE);
        
        graph.addEdge(vertices[55], vertices[57], SEA);
        
        graph.addEdge(vertices[56], vertices[57], SHORE);
        
        TileVertex vertex;
        //display the initial setup- all vertices adjacent to each other
        for (int i = 0; i < SIZE; i++) {
            vertex = graph.getVertex(i);
            System.out.println(vertex);
            for (int j = 0; j < vertex.getNeighborCount(); j++) {
                System.out.println(vertex.getNeighbor(j));
            }
            System.out.println();
        }
    }
    
    public static void loadVertexData(TileVertex[] tiles)
        throws Exception {
            
        String line;
        String data[];
        int count = 0;
            
        File inFile = new File("VertexDataFile.txt");
        try (Scanner input = new Scanner(inFile)) {
            while (input.hasNext()) {
                line = input.nextLine();
                data = line.split("!");

                switch(data[0]){
                    
                    case "Land":
                        tiles[count] = new LandTile(data[1], 
                                Integer.parseInt(data[2]), data[3],
                                Integer.parseInt(data[4]), Integer.parseInt(data[5]), 
                                Integer.parseInt(data[6]));
                                break;
                    case "Port":
                        tiles[count] = new PortTile(data[1], 
                                Integer.parseInt(data[2]), data[3]);
                        break;
                    case "Sea":
                        tiles[count] = new SeaTile(data[1], 
                                Integer.parseInt(data[2]), 
                                data[3]);
                }
                System.out.println(tiles[count]);
                count++;
            }
            System.out.print("\n");
        }
        }
        
        public static void saveVertexData(TileVertex[] tiles)
        throws Exception{
            
            PrintWriter writer;
            File outFile = new File("VertexDataFile.txt");

            writer = new PrintWriter(outFile);
            
            for(TileVertex i : tiles)
            {
                System.out.println(i.saveString());
                writer.println(i.saveString());            
            }      
            writer.close();
        }
}
