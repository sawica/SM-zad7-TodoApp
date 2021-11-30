package pl.edu.pb.todoapp;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }


}
