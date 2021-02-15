package model;
import com.pa.proj2020.adts.graph.Graph;
import com.pa.proj2020.adts.graph.GraphEdgeList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import smartgraph.view.containers.SmartGraphDemoContainer;
import smartgraph.view.graphview.SmartCircularSortedPlacementStrategy;
import smartgraph.view.graphview.SmartGraphPanel;
import smartgraph.view.graphview.SmartPlacementStrategy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FilesReader {



    public static ArrayList<String> returnID() {
        ArrayList<String> id = new ArrayList<>();
        Graph<String, String> g = new GraphEdgeList<>();

        String path = "input_Files/relationships.csv";
        String line1;


        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line1 = br.readLine()) != null) {
                String[] values = line1.split(";");
              //  for(String i: values) {
                int a=0;
                    id.add(values[0]);
                    g.insertVertex(values[0]);

                    for(String i:values) {
                        a += 1;

                  //      System.out.println(a);
                       //
                        if(a >= values.length){
                            a=0;
                        }

                        if (a >= 2) {
                            if (line1.length()==50) {
                               // System.out.println(values[0] + " :   " + values[a]);
                         // System.out.print(g.vertices().size());
                             //  if (g.vertices().size()==50){
                                  // g.insertEdge(values[0],values[a],i);
                              //  System.out.println;
                               }
                               // relacao.add(values[a]);
                            //}
                        }


                    }



                        }
            //System.out.print(g.vertices());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        stage.show();

        graphView.init();
        return id;

    }




    public static ArrayList<String>  returnData(){
        ArrayList<String> data= new ArrayList<>();
        String path = "input_Files/relationships.csv";
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] values = line.split(";");
                //System.out.println(values[0]);
                data.add(values[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;}



    public static ArrayList<String>  returnRelacao(){
        ArrayList<String> relacao= new ArrayList<>();
        Graph<String, String> g = new GraphEdgeList<>();
        String path = "input_Files/relationships.csv";
        String line;
        try {

            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null){


                String[] values = line.split(";");

                int a=0;

                for(String i: values) {
                   // UserVertex uv = new UserVertex(i);
                    a =a+1;
                    if(a >= values.length){
                        a=0;
                    }

                      if (a > 2) {
                          if (g.vertices().size() >0) {

                              relacao.add(values[a]);
                              //System.out.print(values[0]);
                              // System.out.println(i+values[a]+"TESTE");

                              //System.out.println(values[0]+"/ " + "/" +i+"/ "+values[a]+"/ "+"EDge");
                              g.insertEdge(values[0],i, values[a]);

                              // g.insertEdge(users.get(c), p, p)
                          }
                      }

            }
               }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return relacao;
    }






}

