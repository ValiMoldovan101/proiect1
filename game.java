public class game {
    private String name;
    private String genre;
    private Double dimension;
    private Double playTime;
    public game(){
        name="no name";
        genre= "no genre";
        dimension=-1.0;
        playTime=-1.0;
    }
    public game(String n,String g, Double dim, Double playT){
        name=n;
        genre=g;
        dimension=dim;
        playTime=playT;
    }

    public String getName(){
        //return name of Game
        return this.name;
    }
    public String getGenre(){
        //return genre of Game
        return this.genre;
    }
    public Double getDimension(){
        //return dimensions of Game
        return this.dimension;
    }
    public double getPlayTime(){
        //return playTime of Game
        return this.playTime;
    }

    public void setDimension(Double dimension) {
        //set dimensions of Game
        this.dimension = dimension;
    }
    public void setGenre(String genre) {
        //set genre of Game
        this.genre = genre;
    }
    public void setName(String name) {
        //set name of Game
        this.name = name;
    }
    public void setPlayTime(Double playTime) {
        //set playTime of Game
        this.playTime = playTime;
    }

    public String toString(){
        return this.name+" "+this.genre+" "+this.dimension+" "+this.playTime;
    }

}
