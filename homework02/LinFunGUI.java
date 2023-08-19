// Delta College - CST 283 - Homework 2
// Name:

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class LinFunGUI extends Application
{
    // Declare objects
    private TextField mField, bField, xField;
    private Label funFormLabel, mLabel, bLabel, xValueLabel, functionLabel;
    private Button calcYbutton, clearButton;

    public static void main(String[] args)
    {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Initialize label objects
        funFormLabel = new Label("Function:  y = mx + b");

        // Define and organize function input fields
        mLabel = new Label("m");
        mField = new TextField();
        bLabel = new Label("b");
        bField = new TextField();
        HBox mBox = new HBox(10,mLabel,mField);
        HBox bBox = new HBox(10,bLabel,bField);
        HBox funBox = new HBox(30,mBox,bBox);
        funBox.setAlignment(Pos.CENTER);

        // Define and organize x input fields
        xValueLabel = new Label("x");
        xField = new TextField();
        HBox xValueBox = new HBox(10,xValueLabel,xField);
        xValueBox.setAlignment(Pos.CENTER);

        // Define calculate button and register button event handler
        calcYbutton = new Button("Calculate");
        calcYbutton.setOnAction(new ConvertButtonClickHandler());

        // Define "clear" button and locally define action.
        clearButton = new Button("Clear");
        clearButton.setOnAction(event ->
        {
            mField.setText("");
            bField.setText("");
            xField.setText("");
        });

        // Combine buttons in horizontal box.
        HBox buttonBox  = new HBox(10, calcYbutton, clearButton);
        buttonBox.setAlignment(Pos.CENTER);

        // Set up function and y labels - will be "set" via button event listener
        functionLabel = new Label();
        HBox functionBox  = new HBox(functionLabel);
        functionBox.setAlignment(Pos.CENTER);

        // Combine all horizontal rows of interface components in a primary vertical box.
        VBox mainBox = new VBox(10,funFormLabel,funBox,xValueBox,functionLabel,buttonBox);
        mainBox.setAlignment(Pos.CENTER);

        // Set up overall scene
        Scene scene = new Scene(mainBox, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Linear Function Calculator");
        primaryStage.show();
    }

    // Handle "Calculate" button click event.
    class ConvertButtonClickHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            double mValue=0, bValue=0, xValue=0, yValue=0;

            // Get inputs from text fields
            String mSlope = mField.getText();
            String bIntercept = bField.getText();
            String xVariable = xField.getText();

            boolean inputOK = true;

            // Parse inputs and perform input number format check
            try
            {
                mValue = Double.parseDouble(mSlope);
                bValue = Double.parseDouble(bIntercept);
                xValue = Double.parseDouble(xVariable);
            }
            catch (NumberFormatException e)
            {
                inputOK = false;
            }

            // Perform calculations.  Set values in fields.
            if (inputOK == true)
            {
                yValue = mValue * xValue + bValue;
                functionLabel.setText(Double.toString(yValue) + " = " +
                        Double.toString(mValue) + "(" +Double.toString(xValue) + ") + " +
                        Double.toString(bValue));
            }
            else   // If any errors,
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Input Error.");
                alert.setContentText("Please check input values.");
                alert.showAndWait();
            }
        }
    }
}