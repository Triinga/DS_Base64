package dataSecurity;



public class Base64EncoderDecoderApp {
   
      // Encode button
        Button encodeButton = new Button("Encode");
        encodeButton.setOnAction(e -> {
            String inputText = inputTextArea.getText();
            String encodedText = b64e.encode(inputText);
            inputTextArea.setText(encodedText);
        });

        // Decode button
        Button decodeButton = new Button("Decode");
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
