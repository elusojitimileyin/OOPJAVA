package Diarys;

import Exceptions.InvalidPinException;

import java.util.ArrayList;

public class Diary {

private String userName;

private String password;
private boolean isLocked = true;

private ArrayList<Entry> entries = new ArrayList<>();

public Diary(String userName, String password){
    this.userName = userName;
    this.password = password;

}
    public void unlockDiary (String password){
        if(getPassword().equals(password)){
            isLocked = false;
        } else {
            throw new InvalidPinException("Wrong PassWord Kindly Enter Your Password Again");
        }
    }

    private String getPassword() {
        return password;
    }

    public void  lockDiary(){
    isLocked = true;
    }
    public boolean isLocked(){
    return isLocked;
    }



    public void createEntry(int id, String title, String body){
        Entry myEntry = new Entry(1,"title","body");
        entries.add(myEntry);
    }
    public void deleteEntry(int id){
    entries.remove(id);
    }

    public Entry findEntryById(int  id) {
        return entries.remove(id - 1);
    }


    public void updateEntry(int id, String title, String body){

    }

    public boolean getUserName() {
    return true;
    }


    public int getNumberOfEntry() {
        return entries.size();
    }
}

