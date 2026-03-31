public class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        // BUG: division not handling divide by zero
        public int divide(int a, int b) {
            return a / b;
        }

}
