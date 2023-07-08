package hm3;
    class Grade {
        public enum GradeValue {
            A(91, 100),
            B(81, 90),
            C(71, 80),
            D(61, 70),
            E(0, 60);

            private final int lowerBound;
            private final int upperBound;

            GradeValue(int lowerBound, int upperBound) {
                this.lowerBound = lowerBound;
                this.upperBound = upperBound;
            }


            public boolean isInRange(int inputMark) {
                return inputMark >= lowerBound && inputMark <= upperBound;

            }
        }
    }