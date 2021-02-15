package model;

import com.pa.proj2020.adts.graph.Graph;
import com.pa.proj2020.adts.graph.GraphEdgeList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import smartgraph.view.containers.SmartGraphDemoContainer;
import smartgraph.view.graphview.SmartCircularSortedPlacementStrategy;
import smartgraph.view.graphview.SmartGraphPanel;
import smartgraph.view.graphview.SmartPlacementStrategy;

import java.util.ArrayList;

public class SocialNetwork {
  //  GraphEdgeList<UserVertex, UserRelationship> graph = new GraphEdgeList<>();

    Graph<String, String> g = new GraphEdgeList<>();
    public void main() {
        ArrayList<String> users = FilesReader.returnID();
        ArrayList<String> data = FilesReader.returnData();
        ArrayList<String> relacao = FilesReader.returnRelacao();
//System.out.print(users);


       for(String i: users){
            UserVertex uv = new UserVertex(i);
           UserRelationship ur = new UserRelationship(users.toString(), relacao.toString());
             uv.setId(i);
           //System.out.println(ur.getRelacao()+"DEU");
          // System.out.print(+"oi");
           // g.insertVertex(uv.getId());










       }
int c=0;
String v= "";
        //for (String u : users) {

            for(String p : relacao) {
              //  c= c+1;
                UserRelationship ur = new UserRelationship(users.toString(), relacao.toString());
                ur.setRelacao(relacao.toString());
               // System.out.println(ur.getRelacao().concat(ur.getID())+"DEU");
               // if(u > ur.getID().)
               // g.insertEdge(users.get(c), p, p);
             //   if()
       // break;

            }

   // }
        // System.out.print(g.vertices());
      // System.out.println(g.numVertices()+"Vertices");
       // System.out.print(g.numEdges()+"Arestas");
        //System.out.println(g.vertices());
        SmartPlacementStrategy strategy = new SmartCircularSortedPlacementStrategy();
        //SmartPlacementStrategy strategy = new SmartRandomPlacementStrategy();
        SmartGraphPanel<String, String> graphView = new SmartGraphPanel(g, strategy);

        Scene scene = new Scene(new SmartGraphDemoContainer(graphView), 1024, 768);

        Stage stage = new Stage(StageStyle.DECORATED);
        graphView.setVertexDoubleClickAction(graphVertex -> {
                    System.out.println("Vertex contains element: " + graphVertex.getUnderlyingVertex().element());
                });

            stage.setTitle("JavaFX SmartGraph Visualization");
        stage.setMinHeight(500);
        stage.setMinWidth(800);
        stage.setScene(scene);
      //  stage.show();

       // graphView.init();


    }

}
