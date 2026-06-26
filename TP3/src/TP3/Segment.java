package TP3;

class Segment {
    private Point orig;
    private Point extrem;
    
    public Segment(double x1, double y1, double x2, double y2) {
        this.orig = new Point(x1, y1);
        this.extrem = new Point(x2, y2);
    }
    public void afficher() {
        System.out.println("Segment:");
        System.out.println("  Origine: " + orig);
        System.out.println("  Extrémité: " + extrem);
    }
    
    public double longueur() {
        double dx = extrem.getX() - orig.getX();
        double dy = extrem.getY() - orig.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
