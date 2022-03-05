package constructor;
class construct  {
    int id;
    String name;
    float salary;
    construct(int i, String n, float s){
       id=i;
       name =n;
       salary =s;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
	public static void main(String[] args) {
		construct  e1 = new construct(111,"Karan",5000.0f);
		construct  e2 = new construct(222,"Kiran",6000.0f);
        e1.display();
        e2.display();

	}

}
