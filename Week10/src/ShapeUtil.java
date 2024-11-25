import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /** Print info for all shapes from the list. */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder result = new StringBuilder();
        List<GeometricObject> triangles = new ArrayList<>();

        result.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                result.append(shape.getInfo() + "\n");
            } else {
                triangles.add(shape);
            }
        }
        result.append("Triangle:\n");
        for (GeometricObject shape : triangles) {
            result.append(shape.getInfo() + "\n");
        }

        return result.toString();
    }
}
