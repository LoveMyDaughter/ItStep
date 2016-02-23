package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    PersonLogic pLogic = new PersonLogic();

    @FXML
    TextField textField1;

    @FXML
    Button btn1;

    @FXML
    ListView listView1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //  btn1.setPrefSize(200, 10);
    }
    // список - коллекция
    ObservableList<String> items = FXCollections.observableArrayList ();

    // GUI ListView визуальный список
    //ListView<String> list = new ListView<String>(items);

    // обработчик события - нажатие кнопки btn1
    public void btn1Click(ActionEvent actionEvent) {
        pLogic.addPerson(textField1.getText().toString());
        //items.add(textField1.getText().toString());
        System.out.println(pLogic.personList);

    }

    public void btnRemoveClick(ActionEvent actionEvent) {
        if (listView1.getFocusModel().getFocusedIndex() != -1) {
            items.remove(listView1.getFocusModel().getFocusedIndex());
        }

    }

    public void btnShow(ActionEvent actionEvent) {
        //System.out.println("btnShow нажата");
        listView1.setItems(items);
    }
}


