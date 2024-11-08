package service.impl;

import model.Principal;
import service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {


    @Override
    public void display(Principal principal) {
        System.out.println("Full Name : " +
                principal.getName() + "\n" +
                "Gender : " + principal.getGender() + "\n" +
                "Age : " + principal.getAge());
    }
    }
