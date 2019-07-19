package jaxrs.dao;

import jaxrs.model.Human;

import java.util.List;

public interface HumanDao {
    public List<Human> getHumans();
    public void addHuman(Human human);
}
