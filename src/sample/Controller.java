package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import sample.Model.Task;
import sample.Model.Worker;


public class Controller {

    @FXML
    private Text newEmployee;
    Task task = new Task();

    public void newEmployeeClick(ActionEvent actionEvent){
    newEmployee.setText("New Employee:");
    Worker one = new Worker();
    Worker two = new Worker();

    double compareOne = Math.ceil(task.points / one.ability);
    double compareTwo = Math.ceil(task.points / two.ability);
    }
}








