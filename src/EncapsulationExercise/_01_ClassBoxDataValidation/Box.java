package EncapsulationExercise._01_ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {

        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        checkForNegativeArgument(length, "Length");

        //добра практика е тук да не се принтира
        // а да се хвърли грешка
        this.length = length;
    }

    private void setWidth(double width) {
        checkForNegativeArgument(width, "Width");
        this.width = width;
    }


    private void setHeight(double height) {
        checkForNegativeArgument(height, "Height");
        this.height = height;
    }

    //!!!! не заправяме да поменим конструктора,като му подадем сетърите
    private void checkForNegativeArgument(double argument, String typeArgument) {
        if (argument <= 0) {
            throw new IllegalArgumentException(typeArgument + " cannot be zero or negative.");
// за да може да се променя аргумента в зависимост от случите по - горе
            // Слагаме String typeArgument също
        }
    }


    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;

    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;

    }

    public double calculateVolume() {
        return width * height * length;

    }

}
