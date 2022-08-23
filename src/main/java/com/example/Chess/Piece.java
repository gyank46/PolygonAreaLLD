package com.example.Chess;

public abstract class Piece implements Movement{
    String name;
    MovementBehaviour movementBehaviour ;
    @Override
    public abstract void move();

    public void setMovementBehaviour(MovementBehaviour movementBehaviour){
        this.movementBehaviour = movementBehaviour;
    }
}
