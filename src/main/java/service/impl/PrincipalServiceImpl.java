package service.impl;

import model.Principal;
import service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {


    @Override
    public void display(@org.jetbrains.annotations.NotNull Principal principal) {
        System.out.println("Full Name : " +
                principal.getName() + "\n" +
                "Age : " + principal.getAge() + "\n" +
                "Gender : " + principal.getGender());
    }
    }
