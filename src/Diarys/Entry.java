package Diarys;

import java.time.LocalDateTime;

public class Entry {
    private int id ;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
public Entry(int id, String title, String body){
    this.id = id;
    this.title = title;
    this.body = body;
}
    public void createEntry( String title, String body){

        this.title = title;
        this.body = body;
    }


}
