package Lab01;

class test {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        node n1 = new node("Tanveer",1);
        node n2 = new node("Samejo",2);

        System.out.println(n1.name +" id "+ n1.id);
        System.out.println(n2.name +" id "+ n1.id);
    }
}

class node {
    String name;
    int id;

    public node(String name, int id) {
        this.name = name;
        this.id = id;
    }
}