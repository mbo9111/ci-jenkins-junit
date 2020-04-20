
@Test
    public void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(10, 2));
    }

    public int multiply(int a, int b) {
        return a * b;
    }
