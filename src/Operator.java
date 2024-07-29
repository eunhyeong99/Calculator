public enum Operator {

    ADDOPERATOR() {
        public double operate(int a, int b) {
            return a + b;
        }
    },
    SUBSTRACTOPERATOR {
        public double operate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLYOPERATOR {
        public double operate(int a, int b) {
            return a * b;
        }
    },
    DIVIDEOPERATOR {
        public double operate(int a, int b) {
            if (b == 0) {
                new DivisionByZeroException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        }
    },
    MODOPERATOR {
        public double operate(int a, int b) {
            if (b == 0) {
                new DivisionByZeroException("0으로 나눌 수 없습니다.");
            }
            return a % b;
        }
    };

    public abstract double operate(int a, int b);
}