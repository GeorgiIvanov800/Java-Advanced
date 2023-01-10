package WorkinWithAbstraction.Enumer;

// enum types cannot be instantiated
//enum must always be written with UPPER CASES if we want two words we separate them with '_'
    public enum DayOfWeek {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);

    private int dayNumber;
        private DayOfWeek(int dayNumber) {
            this.dayNumber = dayNumber;
        }

    public int getDayNumber() {
        return dayNumber;
    }
}

