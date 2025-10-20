package dk.easv.exercise403;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private ListView<String> lstTodo;

    @FXML
    private ListView<String> lstInProgress;

    @FXML
    private ListView<String> lstDone;


    private List<String> todoList = new ArrayList<>();
    private List<String> inProgressList = new ArrayList<>();
    private List<String> doneList = new ArrayList<>();


    int todoNumber = 0; // Used in numbering the newtodo objects



    @FXML
    void onFirstColFirstBtnClicked(ActionEvent event){
        String selectedItem = lstTodo.getSelectionModel().getSelectedItem();
        if (selectedItem != null){
            lstTodo.getItems().remove(selectedItem);
            todoList.remove(selectedItem);

            lstInProgress.getItems().add(selectedItem);
            inProgressList.add(selectedItem);

            lstTodo.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void onFirstColSecondBtnClicked(ActionEvent event){
        String selectedItem = lstInProgress.getSelectionModel().getSelectedItem();
        if (selectedItem != null){
            lstInProgress.getItems().remove(selectedItem);
            inProgressList.remove(selectedItem);

            lstTodo.getItems().add(selectedItem);
            todoList.add(selectedItem);

            lstInProgress.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void onSecondColFirstBtnClicked(ActionEvent event){
        String selectedItem = lstInProgress.getSelectionModel().getSelectedItem();
        if (selectedItem != null){
            lstInProgress.getItems().remove(selectedItem);
            inProgressList.remove(selectedItem);

            lstDone.getItems().add(selectedItem);
            doneList.add(selectedItem);

            lstInProgress.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void onSecondColSecondBtnClicked(ActionEvent event){
        String selectedItem = lstDone.getSelectionModel().getSelectedItem();
        if (selectedItem != null){
            lstDone.getItems().remove(selectedItem);
            doneList.remove(selectedItem);

            lstInProgress.getItems().add(selectedItem);
            inProgressList.add(selectedItem);

            lstDone.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void onCreateNewTodoClicked(ActionEvent event){
        lstTodo.getSelectionModel().clearSelection();
        todoList.add("New Todo #" + todoNumber);
        lstTodo.getItems().setAll(todoList);
        todoNumber = todoNumber +1;
    }

    public void initialize(){

        inProgressList.add("Test in progress");
        doneList.add("Test done");

        lstTodo.getItems().setAll(todoList);
        lstInProgress.getItems().setAll(inProgressList);
        lstDone.getItems().setAll(doneList);
    }

}
