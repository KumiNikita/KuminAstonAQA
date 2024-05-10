public class Forms {

        interface Shape {
            double calculatePerimeter();
            double calculateArea();

            void setFillColor(String color);
            String getFillColor();

            void setBorderColor(String color);
            String getBorderColor();
        }

        class Circle implements Shape {
            private double radius;
            private String fillColor;
            private String borderColor;

            public Circle(double radius) {
                this.radius = radius;
            }

            @Override
            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public double calculateArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public void setFillColor(String color) {
                this.fillColor = color;
            }

            @Override
            public String getFillColor() {
                return fillColor;
            }

            @Override
            public void setBorderColor(String color) {
                this.borderColor = color;
            }

            @Override
            public String getBorderColor() {
                return borderColor;
            }
        }

        class Rectangle implements Shape {
            private double width;
            private double height;
            private String fillColor;
            private String borderColor;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            @Override
            public double calculatePerimeter() {
                return 2 * (width + height);
            }

            @Override
            public double calculateArea() {
                return width * height;
            }

            @Override
            public void setFillColor(String color) {
                this.fillColor = color;
            }

            @Override
            public String getFillColor() {
                return fillColor;
            }

            @Override
            public void setBorderColor(String color) {
                this.borderColor = color;
            }

            @Override
            public String getBorderColor() {
                return borderColor;
            }
        }

        class Triangle implements Shape {
            private double sideA;
            private double sideB;
            private double sideC;
            private String fillColor;
            private String borderColor;

            public Triangle(double sideA, double sideB, double sideC) {
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            }

            @Override
            public double calculatePerimeter() {
                return sideA + sideB + sideC;
            }

            @Override
            public double calculateArea() {
                double s = calculatePerimeter() / 2;
                return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
            }

            @Override
            public void setFillColor(String color) {
                this.fillColor = color;
            }

            @Override
            public String getFillColor() {
                return fillColor;
            }

            @Override
            public void setBorderColor(String color) {
                this.borderColor = color;
            }

            @Override
            public String getBorderColor() {
                return borderColor;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Shape circle = new Circle(5);
                circle.setFillColor("Red");
                circle.setBorderColor("Black");
                printShapeDetails(circle);

                Shape rectangle = new Rectangle(4, 6);
                rectangle.setFillColor("Blue");
                rectangle.setBorderColor("Green");
                printShapeDetails(rectangle);

                Shape triangle = new Triangle(3, 4, 5);
                triangle.setFillColor("Yellow");
                triangle.setBorderColor("Orange");
                printShapeDetails(triangle);
            }

            private static void printShapeDetails(Shape shape) {
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Fill Color: " + shape.getFillColor());
                System.out.println("Border Color: " + shape.getBorderColor());
                System.out.println();
            }
        }

    }



