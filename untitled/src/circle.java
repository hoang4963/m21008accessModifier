public class circle {
    private double radius = 1.0;
    private String color = "red";
    public circle(){
    }
    public circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    protected double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
