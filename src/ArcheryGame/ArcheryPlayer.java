package ArcheryGame;


public class ArcheryPlayer {

        private final int id;

        public ArcheryPlayer(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void play(ArcheryGame archeryGame){
            archeryGame.markScoreBoard(this.id);

        }

    }

