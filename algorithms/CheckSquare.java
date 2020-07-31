/**Given coordinates of four points in a plane, find if the four points form a square or not.
To check for square, we need to check for following.
a) All fours sides formed by points are the same.
b) The angle between any two sides is 90 degree. (This condition is required as Quadrilateral also has same sides.
c) Check both the diagonals have the same distance */
public class CheckSquare {
    public static void main(String[] args) {
        Point p1 = new Point(20,20);
        Point p2 = new Point(10,10);
        Point p3 = new Point(10,20);
        Point p4 = new Point(20,10);

        System.out.println(isSquare(p1,p2,p3,p4));
    }

    static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static boolean isSquare(Point p1, Point p2, Point p3, Point p4){
        int  dist12 = findDistance(p1, p2);
        int dist13 = findDistance(p1, p3);
        int dist14 = findDistance(p1, p4);

        if(dist12==0 || dist13==0 || dist14==0){
            return false;
        }

        if (dist12==dist13 && 2*dist12 == dist14
         && 2*findDistance(p2, p4) == findDistance(p2, p3)){
            return true;
        }
        if (dist13==dist14 && 2*dist13 == dist12 
        && 2*findDistance(p3,p2) == findDistance(p3,p4)){
            return true;
        }
        if (dist14==dist12 && 2*dist12 == dist13
        && 2*findDistance(p2,p3) == findDistance(p2,p4)){
            return true;
        }
        return false;
    }

    static int findDistance(Point p1, Point p2){
        return (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y); 
    }

}