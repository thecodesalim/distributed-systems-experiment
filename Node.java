import java.util.ArrayList;

//Represents a single server
public class Node {
    protected int latency, distance, workload;
    protected String name;
    static ArrayList<Node> servers = new ArrayList<Node>();
    static ArrayList<Client> clientList = new ArrayList<Client>();
    public Node(String name,int latency, int distance, int workload){
        this.name = name;
        this.latency = latency;
        this.distance = distance;
        this.workload = workload;
    }

    public String getName() {
        return this.name;
    }

    public int getLatency() {
        return this.latency;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getWorkload() {
        return this.workload;
    }

    public static void connectServer(ArrayList<Node> s){
        for(Node a: s){
            System.out.println(a.getName()  );
        }
    }

    public static void main(String[] args) {
        Node a = new Node("1", 50, 50, 50);
        System.out.println("hey");
        servers.add(a);
        connectServer(servers);
    }
  }

  //Represents a single client
class Client {
    protected int latency, distance, workload;

    public Client(int latency, int distance, int workload){
        this.latency = latency;
        this.distance = distance;
        this.workload = workload;
    }

    public int getLatency() {
        return this.latency;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getWorkload() {
        return this.workload;
    }
  }

  
