package com.BKM.demo;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controllers {

    /*@RequestMapping(value = "/SecondPage", method= RequestMethod.GET)
    public String GetUser(String userName, String lastName){

    }*/

    @RequestMapping(value = "/Controllers", method= RequestMethod.POST)
    public String PostUser(String userName, String lastName, String password){
        ArrayList<User> users = new ArrayList<>();

        User user1=new User();
        user1.name="Nurgül";
        user1.lastName="Sezgin";
        user1.password="123";

        users.add(user1);

        User user2=new User();
        user2.name="Ayşegül";
        user2.lastName="Kut";
        user2.password="123";

        users.add(user2);

        String nameControl="",lastNameControl="",passwordControl="";
        boolean isSuccess=false;

        for (int i=0;i<users.size();i++){

            if(users.get(i).name.equals(userName) && users.get(i).lastName.equals(lastName)&& users.get(i).password.equals(password)){
                nameControl=userName;
                lastNameControl=lastName;
                passwordControl=password;
                isSuccess=true;
                break;
            }

        }

        if (isSuccess) return "Merhaba "+ nameControl+" "+lastNameControl;
        else return "Kullanıcı adı yada Şifre Hatlı";
    }
    @RequestMapping("/SecondPage")
    public String SecondPage(){
        return "SecondPage";
    }
    @RequestMapping("/Home")
    public String Home(){
        return "Home";
    }
}
