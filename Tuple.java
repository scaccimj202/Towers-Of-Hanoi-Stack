/** 
*@Author Matthew Scaccia
*Description Tuple class to simulate TOH 
*/

public class Tuple{

    String operation;
    int disk;
    Pole start, finish, aux;

    public Tuple(int disk_, String operation_, Pole start_,
        Pole finish_, Pole aux_){
        disk = disk_;
        operation = operation_;
        start = start_;
        finish = finish_;
        aux = aux_;
    }
}
/*
    public int getData(){
        return data;
    }

    public String getState(){
        return state;
    }

    private void setData(int data_){
        data = data_;
    }

    private void setState(String state_){
        state = state_;
    }
}
*/