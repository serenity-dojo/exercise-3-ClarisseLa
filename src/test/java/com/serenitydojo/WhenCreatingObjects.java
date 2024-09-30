package com.serenitydojo;

import com.serenitydojo.checks.DogClassTest;
import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido","Bone", 5);
        fido.setFavoriteToy("Bone");

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());
        fido.age = 5;



    }
}

