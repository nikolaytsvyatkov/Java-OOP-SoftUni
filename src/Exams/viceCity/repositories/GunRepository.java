package Exams.viceCity.repositories;

import Exams.viceCity.models.guns.Gun;
import Exams.viceCity.repositories.interfaces.Repository;

import java.util.*;


import java.util.List;

public class GunRepository implements Repository {
    List<Gun> models;

    @Override
    public Collection getModels() {
        return null;
    }

    @Override
    public void add(Object model) {

    }

    @Override
    public boolean remove(Object model) {
        return false;
    }

    @Override
    public Object find(String name) {
        return null;
    }
}
