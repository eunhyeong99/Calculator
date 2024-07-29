public enum Operator {

    ADDOPERATOR() {
        public int operate(int a, int b) {
            return a + b;
        }
    },
    SUBSTRACTOPERATOR {
        public int operate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLYOPERATOR {
        public int operate(int a, int b) {
            return a * b;
        }
    },
    DIVIDEOPERATOR {
        public int operate(int a, int b) {
            if (b == 0) {
                new DivisionByZeroException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        }
    },
    MODOPERATOR {
        public int operate(int a, int b) {
            if (b == 0) {
                new DivisionByZeroException("0으로 나눌 수 없습니다.");
            }
            return a % b;
        }
    };

    public abstract int operate(int a, int b);
}