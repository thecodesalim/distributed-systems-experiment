import java.util.ArrayList;

public class Node {
    protected int latency, distance, workload;
    static ArrayList<Node> servers = new ArrayList<Node>();
    public Node(int latency, int distance, int workload){
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

    public Node check(ArrayList<Node> servers) {
        for (Node node : servers) {
            if(node.getLatency() < 100){
                System.out.println(node);
                return node;
            }
         }
        return node;
    }
    public static void main(String[] args) {
        Node n1 = new Node(50, 50, 50);
        Node n2 = new Node(100, 50, 50);
        Node n3 = new Node(150, 50, 50);

        servers.add(n1);
        servers.add(n2);
        servers.add(n3);

        for (Node node : servers) {
            if(node.getLatency() < 100){
                System.out.println(node);
            }
         }
        System.out.println(servers.size());
    }

  }