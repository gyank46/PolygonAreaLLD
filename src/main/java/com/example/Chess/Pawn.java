package com.example.Chess;

public class Pawn extends Piece{
    @Override
    public void move() {
        this.movementBehaviour.move();
    }
}
