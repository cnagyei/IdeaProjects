class VolatileDemo {
    long longVal; // May not be atomic
    double doubleVal; // May not be atomic

    volatile long longVal1; // Atomic
    volatile double doubleVal1; // Atomic

    volatile int number = 0; // volatile keyword makes the changes visible

}