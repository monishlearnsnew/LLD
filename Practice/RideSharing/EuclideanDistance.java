package Practice.RideSharing;

public class EuclideanDistance  implements NearestDistance{

    @Override
    public int calculateNearestDistance(Location x1, Location x2) {
        int corX1 = x1.getXCordinate();
        int corX2 = x2.getXCordinate();
        int corY1 = x1.getYCordinate();
        int corY2 = x2.getYCordinate();

        return (int) Math.sqrt((corX2-corX1)*(corX2-corX1)+(corY2-corY1)*(corY2-corY1));
    }
    
}
