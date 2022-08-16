package com.isa.models;

public abstract class Entity {
    protected int Id;

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
}
