package com.shanInfotech.mvnProject;

import com.shanInfotech.mvnProject.entity.Mobile;
import com.shanInfotech.mvnProject.entity.Sim;

public class App {
    public static void main(String[] args) {
    	Mobile m=new Mobile(18210901, "Apple");
    	Sim s=new Sim(109812, 9886443661L, "Airtel", m);
    	System.out.println(s);
    }
}

// jar,war,ear
// java archive files, web archive files, enterprise archive files