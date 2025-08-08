class Salary {
    long income;

    Salary(long income) {
        this.income = income;
    }
}

class Promotion {
    Salary salary;

    Promotion(Salary salary) {
        this.salary = salary;
    }

    public void promote() {
        salary.income += 1500;
    }

    Salary mySalary = new Salary(200);
}