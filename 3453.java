class Solution {
    public double separateSquares(int[][] squares) {
        List<double[]> events = new ArrayList<>();
        double totalArea = 0;
        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];
            events.add(new double[]{y, l});
            events.add(new double[]{y + l, -l});
            totalArea += l * l;
        }
        events.sort((a, b) -> Double.compare(a[0], b[0]));
        double half = totalArea / 2.0;
        double currWidth = 0;
        double currArea = 0;
        double prevY = events.get(0)[0];
        for (double[] event : events) {
            double y = event[0];
            double height = y - prevY;
            double areaGain = currWidth * height;
            if (currArea + areaGain >= half) {
                return prevY + (half - currArea) / currWidth;
            }
            currArea += areaGain;
            currWidth += event[1];
            prevY = y;
        }
        return prevY;
    }
}
