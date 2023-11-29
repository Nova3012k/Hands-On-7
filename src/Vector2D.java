public class Vector2D {
    private double[] vector;

    public Vector2D(double[] vector) {
        this.vector = vector;
    }

    public double[] add(Vector2D v) {
        return new double[]{this.vector[0] + v.vector[0], this.vector[1] + v.vector[1]};
    }
    public double[] rest(Vector2D v) {return new double[]{this.vector[0] - v.vector[0], this.vector[1] - v.vector[1]}; }
    public double[] scalarMultiplicationOfSum(Vector2D vectorA, Vector2D vectorC, double scalar){
        double[] sumResult = vectorA.add(vectorC);
        double[] result = new double[]{scalar*sumResult[0], scalar * sumResult[1]};
        return result;
    }
    public double[] customOperation(Vector2D vectorA, Vector2D vectorB, Vector2D vectorC, double anotherScalar) {

        double[] sumResult = vectorA.add(vectorB);
        double[] scalarSumResult = new double[]{anotherScalar * sumResult[0], anotherScalar * sumResult[1]};
        double[] resultado = new double[]{scalarSumResult[0] - vectorC.vector[0], scalarSumResult[1] - vectorC.vector[1]};

        return resultado;
    }

    public double[] customOperation2(Vector2D vectorA, Vector2D vectorB, Vector2D vectorC) {
        double[] fourTimesA = new double[]{4 * vectorA.vector[0], 4 * vectorA.vector[1]};
        double[] fiveTimesB = new double[]{5 * vectorB.vector[0], 5 * vectorB.vector[1]};

        double[] results = new double[]{fourTimesA[0] + fiveTimesB[0] - vectorC.vector[0],
                fourTimesA[1] + fiveTimesB[1] - vectorC.vector[1]};

        return results;
    }


    public double dotProduct(Vector2D v) {
        return this.vector[0] * v.vector[0] + this.vector[1] * v.vector[1];
    }
}
