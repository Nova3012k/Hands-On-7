public class Vector3D {
    private double[] vector;

    public Vector3D(double[] vector) {
        this.vector = vector;
    }

    public double[] add(Vector3D v) { return new double[]{this.vector[0] + v.vector[0], this.vector[1] + v.vector[1], this.vector[2] + v.vector[2]}; }
    public double[] rest(Vector3D v) { return new double[]{this.vector[0] - v.vector[0], this.vector[1] - v.vector[1], this.vector[2] - v.vector[2]}; }

    public double dotProduct(Vector3D v) {
        return this.vector[0] * v.vector[0] + this.vector[1] * v.vector[1] + this.vector[2] * v.vector[2];
    }

    public double[] crossProduct(Vector3D v) {
        return new double[]{this.vector[1] * v.vector[2] - this.vector[2] * v.vector[1],
                this.vector[2] * v.vector[0] - this.vector[0] * v.vector[2],
                this.vector[0] * v.vector[1] - this.vector[1] * v.vector[0]};
    }

    public double[] customOperation3(Vector3D vectorA, Vector3D vectorB, Vector3D vectorC, Vector3D vectorD) {
        // Multiplicación de A por 4
        double[] fourTimesA = new double[]{4 * vectorA.vector[0], 4 * vectorA.vector[1], 4 * vectorA.vector[2]};

        // Multiplicación de B por 2
        double[] twoTimesB = new double[]{2 * vectorB.vector[0], 2 * vectorB.vector[1], 2 * vectorB.vector[2]};

        // Producto del resultado de (4A * 2B) por D
        double[] productResult = new double[]{
                fourTimesA[0] * twoTimesB[0] * vectorD.vector[0],
                fourTimesA[1] * twoTimesB[1] * vectorD.vector[1],
                fourTimesA[2] * twoTimesB[2] * vectorD.vector[2]
        };

        // Producto final por C
        double[] resultados = new double[]{
                productResult[0] * vectorC.vector[0],
                productResult[1] * vectorC.vector[1],
                productResult[2] * vectorC.vector[2]
        };

        return resultados;
    }

}

