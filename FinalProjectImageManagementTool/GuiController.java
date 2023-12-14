package com.example.finalprojectimagemanagementtool;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;



//encapsulate image processing logic, and use abstract class to declare an abstract class which is similar to interface
abstract class ImageProcessor {
    abstract void processImage(File file, String format) throws IOException;
}
//fileimageprocessor specializes the behavior defied in imageprocessor
class FileImageProcessor extends ImageProcessor {
    @Override
    void processImage(File file, String format) throws IOException {

        if (file != null) {
            //loading image
            BufferedImage image = ImageIO.read(file);
            //build filechooser function
            FileChooser fileChooser = new FileChooser();
            //limit proper file extensions for image
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*." + format.toLowerCase()));
            //direct to file's parent directory
            fileChooser.setInitialDirectory(file.getParentFile());
            //save to desktop by user's choices and convert to proper format
            ImageIO.write(image, format, fileChooser.showSaveDialog(new Stage()));
        } else {
            throw new IllegalArgumentException("File cannot be null.");
        }
    }
}

public class GuiController {
    @FXML
    ImageView imageView;
    @FXML
    TextArea text;
    private File file;
    @FXML
    private ComboBox<String> box;


    private String[] formatName = {"jpeg", "bmp", "png", "jpg", "gif"};
    private FileImageProcessor imageProcessor = new FileImageProcessor();

    //initialize format combobox
    public void initialize(){
        box.setItems(FXCollections.observableArrayList(formatName));
    }



    // method to choose and upload image from desktop
    @FXML
    protected void filechooseButton(ActionEvent event) throws java.io.IOException{
        //build filechooser function
        FileChooser fileChooser = new FileChooser();
        //limit proper file extensions for image
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files","*.jpeg","*.bmp", "*.png", "*.jpg", "*.gif"));
        file = fileChooser.showOpenDialog( new Stage());

        //display image properties
        if (file != null) {
            Image image = new Image(file.toURI().toString());
            text.setWrapText(true);
            text.setEditable(false);

            StringBuilder properties = new StringBuilder();
            // Append image properties to the StringBuilder
            properties.append("Original Image Width: ").append(image.getWidth()).append("\n");
            properties.append("Original Image Height: ").append(image.getHeight()).append("\n");
            properties.append("Original Image Size: ").append(file.length() / 1024).append(" KB").append("\n"); // Size in KB
            properties.append("File Path: ").append(file.getAbsolutePath()).append("\n");
            // Set the properties to the TextArea
            text.setText(properties.toString());
            //Set image to thumbnail size(100x100)
            imageView.setImage(image);
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            imageView.setPreserveRatio(true);
        }
        //error message if did not select a file
        else{
            showAlert("Error", "Input Error", "Please Select a File");
        }
    }


    //format convert method
    @FXML
    protected void formatConvert(ActionEvent event) {
        try {
            if (file != null && box.getValue() != null) {
                imageProcessor.processImage(file, box.getValue());
            } else if (file == null) {
                showAlert("Error", "Input Error", "You Did Not Select a File");
            } else {
                showAlert("Error", "Input Error", "Please Select a Format");
            }
        } catch (IOException e) {
            showAlert("Error", "Image Processing Error", "An error occurred while processing the image.");
        }
    }

    //error message handler
    private void showAlert(String title, String header, String content) {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle(title);
        errorAlert.setHeaderText(header);
        errorAlert.setContentText(content);
        errorAlert.showAndWait();
    }


}