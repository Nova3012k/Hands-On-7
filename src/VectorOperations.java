public class VectorOperations {

    public static void main(String[] args) {

        // Vectores en R^2
        Vector2D vector2D_A = new Vector2D(new double[]{3, 3});
        Vector2D vector2D_B = new Vector2D(new double[]{1, 4});
        Vector2D vector2D_C = new Vector2D(new double[]{4, 7});

        // Vectores en R^3
        Vector3D vector3D_A = new Vector3D(new double[]{3, 3, 2});
        Vector3D vector3D_B = new Vector3D(new double[]{1, 4, 4});
        Vector3D vector3D_C = new Vector3D(new double[]{4, 7, 5});
        Vector3D vector3D_D = new Vector3D(new double[]{4, 3, -5});

        // Operaciones en R^2
        double[] suma2D = vector2D_A.add(vector2D_B);
        double[] resta2D = vector2D_A.rest(vector2D_B);
        double scalar = 7;
        double[] scalarSumResult = vector2D_A.scalarMultiplicationOfSum(vector2D_A, vector2D_C, scalar);
        double anotherScalar = 7;
        double[] customOperationResult = vector2D_A.customOperation(vector2D_A, vector2D_B, vector2D_C, anotherScalar);
        double[] customOperation2Result = vector2D_A.customOperation2(vector2D_A, vector2D_B, vector2D_C);
        double productoEscalar2D = vector2D_A.dotProduct(vector2D_B);

        // Operaciones en R^3
        double[] suma3D = vector3D_A.add(vector3D_B);
        double[] resta3D = vector3D_A.rest(vector3D_B);
        double productoEscalar3D = vector3D_A.dotProduct(vector3D_B);
        double[] productoCruz3D = vector3D_A.crossProduct(vector3D_B);
        double[] customOperation3Result = vector3D_A.customOperation3(vector3D_A, vector3D_B, vector3D_C, vector3D_D);

        // Mostrar resultados
        System.out.println();
        System.out.println("---R^2---");
        System.out.println("Suma en R^2: (" + suma2D[0] + ", " + suma2D[1] + ")");
        System.out.println("Resta en R^2: (" + resta2D[0] + ", " + resta2D[1] + ")");

        System.out.println("Escalar por la suma un conjunto en R^2: (" + scalarSumResult[0] + ", " +scalarSumResult[1] + ")");
        System.out.println("Escalar por la suma de un conjunto menos un conjunto en R^2: (" + customOperationResult[0] + ", " + customOperationResult[1] + ")");
        System.out.println("2 escalares por dos conjuntos menos un conjunto en R^2: (" + customOperation2Result[0] + ", " + customOperation2Result[1] + ")");
        System.out.println();

        System.out.println("Producto Escalar en R^2: " + productoEscalar2D);
        System.out.println();
        System.out.println("---R^3---");
        System.out.println("Suma en R^3: (" + suma3D[0] + ", " + suma3D[1] + ", " + suma3D[2] + ")");
        System.out.println("Resta en R^3: (" + resta3D[0] + ", " + resta3D[1] + ", " + resta3D[2] + ")");
        System.out.println("Producto Escalar en R^3: " + productoEscalar3D);
        System.out.println("Producto Cruz en R^3: (" + productoCruz3D[0] + ", " + productoCruz3D[1] + ", " + productoCruz3D[2] + ")");
        System.out.println();
        System.out.println("2 escalares por todos los conjuntos en R^3: (" + customOperation3Result[0] + ", " + customOperation3Result[1] + ", " + customOperation3Result[2] + ")");
    }
}