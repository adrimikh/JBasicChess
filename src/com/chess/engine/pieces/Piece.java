package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.*;

import java.util.List;
import java.util.Set;

public abstract class Piece {
    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    public Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }

    public Alliance getPieceAlliance() {
        return pieceAlliance;
    }
    public abstract Set<Move> calculateLegalMoves(final Board board);

}
