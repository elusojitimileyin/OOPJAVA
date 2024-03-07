package Diarys;

import java.util.ArrayList;

public class Diaries {
private ArrayList<Diary> diaries = new ArrayList<>();


    public int getDiaries(){
        return diaries.size();
    }


    public void addToDiary(String username, String password){
        Diary myDiary = new Diary(username, password);
        diaries.add(myDiary);
    }


    public Diary findByUsername(String username){
        for(Diary myDiary : diaries){
            if(myDiary.getUsername().equals(username)){
                return myDiary;
            }
        }
        return null;
    }

    public void delete(String username, String password){
        diaries.removeIf(myDiary -> myDiary.getUsername().equals(username) && myDiary.getPassword().equals(password));
    }


}