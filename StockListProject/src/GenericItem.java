class GenericItem {
    public int ID;
    public String name;
    public float price;

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f \n", ID, name, price);
    }
}