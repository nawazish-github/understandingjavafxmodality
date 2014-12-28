/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package understandingjavafxmodality;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBoxBuilder;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author NawazishMohammad
 */
public class UnderstandingJavaFXModality extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Open Child Window/Stage");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Opening child stage");
                Stage childStage = new Stage ();
                childStage.setTitle("Child Window");
                childStage.initModality(Modality.WINDOW_MODAL);
                //childStage.initModality(Modality.APPLICATION_MODAL);

                childStage.initOwner(primaryStage);
                Button closeChildBtn = new Button ("Close Child Window");
                 closeChildBtn.setOnAction(new EventHandler<ActionEvent> (){

                    @Override
                    public void handle(ActionEvent event) {
                        childStage.close();
                    }
                    
            });
                 final Scene childScene = new Scene (HBoxBuilder.
                                                        create().
                                                        children(closeChildBtn).
//                                                        layoutX(100).
//                                                        layoutY(100).
                                                        build());
                 childStage.setScene(childScene);
                 childStage.setIconified(false);
                 childStage.setFullScreen(false);
                 childStage.setMaxHeight(200);
                 childStage.setMaxWidth(200);
                 childStage.setResizable(false);
                 childStage.setHeight(100);
                 childStage.setWidth(100);
                 childStage.show();
                
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Parent Window");
        primaryStage.setScene(scene);
        primaryStage.setIconified(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
