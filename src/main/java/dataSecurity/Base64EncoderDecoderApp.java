package dataSecurity;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Base64EncoderDecoderApp extends Application {
    private Base64Encode b64e;
    private Base64Decode b64d;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        b64e = new Base64Encode();
        b64d = new Base64Decode();

        primaryStage.setTitle("Base64 Encoder/Decoder");

        // Input area
        Label inputLabel = new Label("Futni tekstin për të enkoduar:");
        TextArea inputTextArea = new TextArea();
        inputTextArea.setPrefRowCount(3);
        inputTextArea.setPrefColumnCount(40);
   
   
      // Encode button
        Button encodeButton = new Button("Enkodo");
        encodeButton.setOnAction(e -> {
            String inputText = inputTextArea.getText();
            String encodedText = b64e.encode(inputText);
            inputTextArea.setText(encodedText);
        });

        // Decode button
        Button decodeButton = new Button("Dekodo");
        decodeButton.setOnAction(e -> {
            String encodedText = inputTextArea.getText();
            String decodedText = b64d.decode(encodedText);
            inputTextArea.setText(decodedText);
        });

        // UI layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.add(inputLabel, 0, 0);
        gridPane.add(inputTextArea, 0, 1);
        gridPane.add(encodeButton, 0, 2);
        gridPane.add(decodeButton, 1, 2);

        VBox root = new VBox(gridPane);
        Scene scene = new Scene(root, 600, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }   

}
