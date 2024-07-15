public class Shape {

    private String color;
    private boolean filled;

    public Shape(){

    }

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(){
        return filled;
    }

    @Override
    public String toString() {
        return "\nColor: "+color+ "\nfilled? "+filled;
    }
}