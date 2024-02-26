package Diarys;

import java.util.ArrayList;

public class Diaries {
private ArrayList<Diary> diaries = new ArrayList<>();


public void addToDiary(String userName, String password){
    Diary myDiary = new Diary(userName,password);
    diaries.add(myDiary);


}
//public Diary findByUserName(String userName){
//    for (Diary myDiary : diaries){
//        if (myDiary.getUserName());
//    }
////    return myDiary;
//}
public void delete(String userName, String password){


    }

    public int getDiaries() {
        return diaries.size();
    }
}
